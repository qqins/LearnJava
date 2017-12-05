package learn.how2j.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by qqins on 2017/12/4 18:56
 */
public class Test3 {
    public static void main(String[] args) {

        try {

            File f = new File("d:/111/lol.txt");
            FileInputStream fis = new FileInputStream(f);
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
            for (byte b : all) {
                System.out.println(b);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            File f = new File("d:/111/lol2.txt");
            byte[] all={88,89};
            FileOutputStream fos = new FileOutputStream(f);
            fos.write(all);
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
