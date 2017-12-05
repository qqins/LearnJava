package learn.how2j.io;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.File;
import java.io.IOException;

/**
 * Created by qqins on 2017/12/3 16:46
 */
public class Test {
    public static void main(String[] args) throws IOException {
        File f1 = new File("d:/111");
        if(!f1.exists()){
            System.out.println("f1不存在");
            f1.createNewFile();
        }
        System.out.println(f1.exists());
        System.out.println("f1的绝对路径："+f1.getAbsolutePath());
        File f2 = new File("LOL.exe");
        System.out.println("f2的绝对路径："+f2.getAbsolutePath());
        File f3 = new File(f1, "LOL.exe");
        System.out.println("f3的绝对路径："+f3.getAbsolutePath());
    }
}
