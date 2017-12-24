package learn.how2j.io.practice;

import java.io.File;
import java.util.Arrays;

/**
 * Created by qqins on 2017/12/3 17:36
 */
public class ForFile {
    public static void main(String[] args) {
        File f = new File("c:/WINDOWS");
        File[] fs = f.listFiles();
        long min = fs[0].length();
        long max = fs[0].length();
        File fa = fs[0];
        File fi = fs[0];
        for (File fr : fs) {
            if (fr.isFile())
                continue;
            if (fr.length() > max) {
                max = fr.length();
                fa = fr;
            }
            if (fr.length() < min && fr.length() != 0) {
                min = fr.length();
                fi = fr;
            }
        }
        System.out.println(fa.toString() + ":" + max);
        System.out.println(fi.toString() + ":" + min);
    }
}
