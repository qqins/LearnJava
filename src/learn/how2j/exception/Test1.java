package learn.how2j.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by qqins on 2017/12/3 10:30
 */
public class Test1 {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        try {
            method2();
        } catch (Exception e) {
            System.out.println("打开失败");
            e.printStackTrace();
        }
    }

    public static void method2() throws Exception {
        File f = new File("d:LOL.exe");
        System.out.println("试图打开:LOL.exe");
        new FileInputStream(f);
        System.out.println("成功打开");
    }
}
