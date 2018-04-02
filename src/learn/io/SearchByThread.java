package learn.io;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SearchByThread {
    public static void main(String[] args) {
        File file = new File("D:\\_MyFile\\学习\\java\\test\\t2\\java");
        String content = "package java.time;";
        ExecutorService pool = Executors.newCachedThreadPool();
        SearchByPool sbp = new SearchByPool(file, content, pool);
        Future<String> re = pool.submit(sbp);
        try {
            System.out.println(re.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        pool.shutdown();
        int largestPoolSize = ((ThreadPoolExecutor) pool).getLargestPoolSize();
        System.out.println("largest pool size=" + largestPoolSize);

    }
}

class SearchByPool implements Callable<String> {
    private File src;
    private String content;
    private ExecutorService pool;

    public SearchByPool(File src, String content, ExecutorService pool) {
        this.src = src;
        this.content = content;
        this.pool = pool;
    }

    @Override

    public String call() {
        StringBuffer sb = new StringBuffer();
        List<Future<String>> result = new ArrayList<>();
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                SearchByPool sbp = new SearchByPool(file, content, pool);
                Future<String> re = pool.submit(sbp);
                result.add(re);
            } else {
                sb.append(search(file, content));
            }
        }
        for (Future<String> str : result) {
            try {
                sb.append(str.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

    public String search(File file, String content) {
        StringBuffer sb = new StringBuffer();
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            int count = 0;
            while (true) {
                String line = br.readLine();
                count++;
                if (line == null) {
                    break;
                }
                if (line.contains(content)) {
                    sb.append(file.getCanonicalPath() + ": " + count + "行qqin");
                    sb.append("\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
