package learn.how2j.io.practice;

//import com.sun.org.apache.xpath.internal.operations.String;

import sun.plugin2.jvm.CircularByteBuffer;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;

/**
 * Created by qqins on 2017/12/10 19:50
 */
public class NumToChi {
    public static void main(String[] args) {
        byte[] all = {(byte) 0xE5, (byte) 0xB1, (byte) 0x8C};
        byte[] re = new byte[all.length];
        File file = new File("d:/111/NumToChi.txt");

        try (FileOutputStream fos = new FileOutputStream(file);
             FileInputStream fis = new FileInputStream(file);
             FileReader fr = new FileReader(file);
             InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"))) {
            fos.write(all);
            fis.read(re);

            char[] ch = new char[(int) file.length()];
            isr.read(ch);
            System.out.println(new String(ch));

            fr.read(ch);
            System.out.println(Charset.defaultCharset());
            System.out.println(new String(ch));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
