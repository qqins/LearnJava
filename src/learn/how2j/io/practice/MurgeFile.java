package learn.how2j.io.practice;

import java.io.*;

/**
 * Created by qqins on 2017/12/7 20:07
 */
public class MurgeFile {
    public static void murge(String folder, String murgeName) {
        File desFile = new File(folder, murgeName);
        try (FileOutputStream fos = new FileOutputStream(desFile)) {
            int index = 1;
            while (true) {
                File sonFile = new File(folder, "cqupt_" + index++);
                if (!sonFile.exists())
                    break;
                byte[] all = new byte[(int) sonFile.length()];
                try (FileInputStream fis = new FileInputStream(sonFile)) {
                    fis.read(all);
                    fos.write(all);
                    fos.flush();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        murge("d:/111/cqupt/cqupt", "cqupt.pdf");
    }
}
