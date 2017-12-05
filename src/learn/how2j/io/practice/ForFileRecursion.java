package learn.how2j.io.practice;

import java.io.File;

/**
 * Created by qqins on 2017/12/4 18:27
 */
public class ForFileRecursion {
    private static double max = 0;
    private static double min = Integer.MAX_VALUE;
    private static File maxFile = null;
    private static File minFile = null;

    public static void forFile(File f) {
        if (f.isFile()) {
            if (f.length() > max) {
                max = f.length();
                maxFile = f;
            }
            if (f.length() < min && f.length()!=0) {
                min = f.length();
                minFile = f;
            }
            return;
        }
        if (f.isDirectory()) {
            File[] fs = f.listFiles();
            if (fs != null)
                for (File fr : fs) {
                    forFile(fr);
                }
        }
    }

    public static void main(String[] args) {
        File f = new File("c:/Windows");
        forFile(f);
        System.out.println("最大文件为：" + maxFile + "其大小为：" + max);
        System.out.println("最小文件为：" + minFile + "其大小为：" + min);
    }
}
