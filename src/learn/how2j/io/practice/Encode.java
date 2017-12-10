package learn.how2j.io.practice;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by qqins on 2017/12/8 15:05
 */
public class Encode {
    public static void main(String[] args) {
        File file = new File("d:/111/encodeingFile.txt");
        encodeFile(file, new File("d:/111/encodeFile.txt"));

    }

    public static void encodeFile(File encodeingFile, File encodeFile) {
        try (FileReader fr = new FileReader(encodeingFile)) {
            char[] ch = new char[(int) encodeingFile.length()];
            fr.read(ch);
            System.out.println("加密前：" + new String(ch));
            for (int i = 0; i < ch.length; i++) {
                if (Character.isDigit(ch[i])) {
                    ch[i]++;
                }
                if (Character.isLetter(ch[i]) && ch[i] != 'z' && ch[i] != 'Z') {
                    ch[i]++;
                }
                if (ch[i] == 'z')
                    ch[i] = 'a';
                if (ch[i] == 'Z')
                    ch[i] = 'A';
            }
            System.out.println("加密后：" + new String(ch));
            try (FileWriter fw = new FileWriter(encodeFile)) {
                fw.write(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
