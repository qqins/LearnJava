package learn.io;

import java.io.*;

public class Buffer {
    public static void main(String[] args) {
        File src = new File("D:\\_MyFile\\学习\\java" +
                "\\test\\BufferedInputStream.java");
        File dst = new File("D:\\_MyFile\\学习\\java\\test\\tq.java");
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dst);
             BufferedInputStream bis = new BufferedInputStream(fis);
//             BufferedOutputStream bos = new BufferedOutputStream(fos);
             PrintStream ps = new PrintStream(fos)) {
            ps.println("hello qqin 秦笙");
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = bis.read(bytes)) != -1) {
                ps.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
