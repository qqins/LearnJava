package learn.io;


import java.io.*;

public class Copy {
    public static void main(String[] args) {
        copyFolder("D:\\_MyFile\\学习\\java\\test\\t1",
                "D:\\_MyFile\\学习\\java\\test\\t2");
    }

    public static void copyFolder(String srcPath, String dstPath) {
        File src = new File(srcPath);
        File dst = new File(dstPath);
        if (!dst.exists()) {
            dst.mkdirs();
        }
        File[] srcFiles = src.listFiles();
        for (File file : srcFiles) {
            if (file.isDirectory()) {
                File newDstPath = new File(dst, file.getName());
                copyFolder(file.getAbsolutePath(), newDstPath.getAbsolutePath());
            } else {
                File newDstPath = new File(dst, file.getName());
                copyFile(file.getAbsolutePath(), newDstPath.getAbsolutePath());
            }
        }
    }

    public static void copyFile(String srcPath, String dstPath) {
        try (FileInputStream fis = new FileInputStream(new File(srcPath));
             BufferedInputStream bis = new BufferedInputStream(fis);
             FileOutputStream fos = new FileOutputStream(new File(dstPath));
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
