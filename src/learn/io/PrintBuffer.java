package learn.io;

import java.io.*;

public class PrintBuffer {
    public static void main(String[] args) {
        try {
            print();
            buffer();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void print() throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("D:\\_MyFile\\学习\\java\\test" +
                        "\\origin.pdf"));
             PrintStream ps = new PrintStream(new FileOutputStream(
                     "D:\\_MyFile\\学习\\java\\test\\pri.pdf"))) {
            long start = System.currentTimeMillis();
            byte[] bytes = new byte[1024];
            int pos = 0;
            while ((pos = bis.read(bytes)) != -1) {
                ps.write(bytes, 0, pos);
            }
            long end = System.currentTimeMillis();
            System.out.println(end - start);
        }
    }

    public static void buffer() throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("D:\\_MyFile\\学习\\java\\test" +
                        "\\origin.pdf"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(
                     "D:\\_MyFile\\学习\\java\\test\\bur.pdf"))) {
            long start = System.currentTimeMillis();
            byte[] bytes = new byte[1024];
            int pos = 0;
            while ((pos = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, pos);
            }
            long end = System.currentTimeMillis();
            System.out.println(end - start);
        }
    }
}
