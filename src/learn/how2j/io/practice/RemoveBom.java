package learn.how2j.io.practice;

//import com.sun.org.apache.xpath.internal.operations.String;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

/**
 * Created by qqins on 2017/12/10 20:42
 */
public class RemoveBom {
    public static void main(String[] args) {
        File file = new File("d:/111/bom.txt");
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] all = new byte[(int) file.length()];
            fis.read(all);
            for (byte b : all) {
                int i = (int) (b & 0xff);
                System.out.print(Integer.toHexString(i) + " ");
            }
            System.out.println(new String(all, "UTF-8"));
            byte[] bom = {(byte) 0xef, (byte) 0xbb, (byte) 0xbf};
            byte[] nall = removeBom(bom, all);
            for (byte b : nall) {
                int i = (int) b & 0xff;
                System.out.println(Integer.toHexString(i));
            }
            System.out.println(new String(nall,"UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static byte[] removeBom(byte[] bom, byte[] all) {
        return Arrays.copyOfRange(all, bom.length, all.length);
    }
}
