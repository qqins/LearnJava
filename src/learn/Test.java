package learn;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by qqins on 2017/9/19 14:36
 */
public class Test {
    public static void main(String[] args) throws IOException {
        String str = "  he   ejj   " + "\n" + "ke ke        ff     eg"
                + "\r\n" + "\u0000" + ' ' + "";
        String s = str.trim();
        System.out.println(s);
        String[] strings = str.split("\\s+");
        System.out.println(strings[0].equals(str.substring(0, 0)));
        System.out.println(Arrays.toString(strings));
        System.out.println("---------------------");
        String string = "\u0000\u0000\u0000";
        System.out.println(string);
        System.out.println("---------------------");
        System.out.println("".length());
    }
}
