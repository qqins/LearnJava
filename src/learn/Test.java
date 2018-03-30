package learn;

import sun.nio.cs.ext.MacCentralEurope;

import javax.xml.transform.Source;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

/**
 * Created by qqins on 2017/9/19 14:36
 */
public class Test {
    public static void main(String[] args) throws IOException{
        File file = new File(".\\test.java");
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
    }
}
