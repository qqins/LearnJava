package learn.how2j.io;

import com.sun.xml.internal.ws.api.message.MessageWritable;

import java.io.File;
import java.util.Date;

/**
 * Created by qqins on 2017/12/3 17:03
 */
public class Test1 {
    public static void main(String[] args) {
        File f = new File("d:/111/LOL.exe");
        System.out.println("当前文件是:"+f);
        System.out.println("当前文件是否存在："+f.exists());
        System.out.println("当前文件是否为目录："+f.isDirectory());
        System.out.println("当前文件是否为文件："+f.isFile());
        System.out.println("文件的长度："+f.length());
        f.setLastModified(0);
        long time=f.lastModified();
        Date d = new Date(time);
        System.out.println("文件最后的修改时间为："+d);

        File f2 = new File("d:/111/DOTA.exe");
        f.renameTo(f2);
        System.out.println(f2);
    }
}
