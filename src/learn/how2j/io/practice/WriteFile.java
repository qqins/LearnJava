package learn.how2j.io.practice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by qqins on 2017/12/5 10:13
 */
public class WriteFile {
    public static void main(String[] args) {
        File f = new File("d:/111/abc/def/lol.txt");
        FileOutputStream fos = null;
        try {
            File dir = f.getParentFile();
            if (!dir.exists()) {
                dir.mkdirs();
            }
            byte[] all = {88, 89};
            fos = new FileOutputStream(f);
            fos.write(all);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
