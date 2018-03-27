package learn.io;


import java.io.*;
import java.lang.reflect.Member;

public class RandomAccessFileTest {
    public static void main(String[] args) {
        try {
            insert("D:\\_MyFile\\学习\\java\\test\\test.txt",
                    5,"\r\nqsqsqs");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void insert(String filename, long pos, String insertContent)
            throws IOException {
        File tmp = File.createTempFile("tmp", null);
        tmp.deleteOnExit();
        try (RandomAccessFile raf=new RandomAccessFile(filename,"rw");
             FileOutputStream fos=new FileOutputStream(tmp);
             FileInputStream fis=new FileInputStream(tmp)){
            raf.seek(pos);
            byte[] bytes = new byte[32];
            int head=0;
            while ((head = raf.read(bytes)) != -1) {
                fos.write(bytes,0,head);
            }
            raf.seek(pos);
            raf.write(insertContent.getBytes());
            while ((head = fis.read(bytes)) != -1) {
                raf.write(bytes,0,head);
            }
        }
    }
}
