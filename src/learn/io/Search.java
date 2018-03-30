package learn.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Search {
    public static void main(String[] args) {
        File file = new File("D:\\_MyFile\\学习\\java\\test\\t2\\time");
        searchContent(file,"package java.time;");
    }

    public static void searchContent(File folder, String search) {
        if (folder.isDirectory()) {
            File[] files = folder.listFiles();
            for (File file : files) {
                searchContent(file, search);
            }
        } else {
            if (folder.getName().endsWith(".java")) {
                try (FileReader fr = new FileReader(folder);
                     BufferedReader br=new BufferedReader(fr)) {
                    int count=0;
                    while (true) {
                        String line=br.readLine();
                        count++;
                        if (line==null) {
                            break;
                        }
                        if (line.contains(search)) {
                            System.out.println(folder.getCanonicalPath()+": 在"+count+"行");
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
