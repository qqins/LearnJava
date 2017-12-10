package learn.how2j.io.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by qqins on 2017/12/5 19:13
 */
public class SpiltFile {
    public static void main(String[] args) {
        File f = new File("d:/111/cqupt/cqupt.pdf");
        int spiltLength = 100 * 1024;
        spilt(f, spiltLength);
    }

    public static void spilt(File file, int spiltLength) {
        if (spiltLength == 0)
            throw new RuntimeException("文件长度为0, 不可拆分");
        int fileNum = 0;
        if (file.length() % spiltLength == 0) {
            fileNum = (int) (file.length() / spiltLength);
        } else {
            fileNum = (int) (file.length() / spiltLength) + 1;
        }
        byte[] fullFile = new byte[(int) file.length()];
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            fis.read(fullFile);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        FileOutputStream fos = null;
        try {
            byte[] partFile;
            for (int i = 0; i < fileNum; i++) {
                String fileName = "cqupt" + "_" + (i + 1);
                File outFile = new File(file.getParent() + "/cqupt", fileName);
                fos = new FileOutputStream(outFile);
                if (i != fileNum - 1) {
                    partFile = Arrays.copyOfRange(fullFile, i * spiltLength,
                            (i + 1) * spiltLength);
                } else {
                    partFile = Arrays.copyOfRange(fullFile, i * spiltLength,
                            (int) file.length());
                }
                fos.write(partFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null)
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
