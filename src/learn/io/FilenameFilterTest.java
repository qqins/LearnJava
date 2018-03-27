package learn.io;

import com.sun.media.sound.SoftTuning;

import java.io.File;
import java.util.Arrays;

/**
 * @author qqins
 */
public class FilenameFilterTest {
    public static void main(String[] args) {
        File file = new File("D:\\_MyFile\\学习\\java");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        File[] files=file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()) {
                System.out.println(file1.getName());
            } else {
                if (file1.toString().endsWith(".exe")) {
                    System.out.println(file1.getName());
                }
            }
        }

    }
}
