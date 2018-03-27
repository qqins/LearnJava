package learn.io;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileInputStreamTest {
    public static void main(String[] args) {
        File file = new File("D:\\_MyFile\\学习\\java\\test.txt");
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] bytes = new byte[1024];
            int head = 0;
            while ((head = fis.read(bytes)) > 0) {
                System.out.print(new String(bytes, 0, head));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
