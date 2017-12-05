package learn.how2j.io;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by qqins on 2017/12/3 17:20
 */
public class Test2{
    public static void main(String[] args) throws IOException {
        File f = new File("d:/111/skin/garen.ski");
        f.mkdirs();
        f.createNewFile();
        File f1 = new File(f, "hh.txt");
        f1.createNewFile();
        System.out.println(f.getParent());
        System.out.println(Arrays.toString(f.list()));
        System.out.println(Arrays.toString(f.listRoots()));
    }
}
