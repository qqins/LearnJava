package learn.how2j.string_learn.compare_string;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

/**
 * Created by qqins on 2017/11/3 13:55
 */
public class CompareStr {
    public static String randomStr(int length) {
        char[] ch = new char[length];
        short start = '0';
        short end = 'z' + 1;
        for (int i = 0; i < length; i++) {
            char c;
            do {
                c = (char) ((int) (Math.random() * (end - start)) + start);
            } while (!Character.isLetterOrDigit(c));
            ch[i] = c;
        }
        return String.valueOf(ch);
    }

    public static void checkDuplicate(String[] s) {
        String[] str = new String[s.length];

        for (int i = 0; i < s.length - 1; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].equals(s[j])) {
                    writeDuplicatedArray(s[i]);
                    break;
                }
            }
        }
        System.out.println("共有" + pos + "组相同的字符串");
        if (pos != 0) {
            System.out.println("分别为：");
            for (int i = 0; i < pos; i++) {
                System.out.print(duplicatedArray[i] + " ");
            }
        }
    }

    public static int pos = 0;
    public static String[] duplicatedArray = new String[100];

    public static void writeDuplicatedArray(String s) {
        for (int i = 0; i < pos; i++) {
            if (duplicatedArray[i].equals(s))
                return;
        }
        duplicatedArray[pos++] = s;
    }

    public static void main(String[] args) {
        String[] s = new String[100];
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            s[i] = randomStr(2);
        }
        for (String str : s) {
            System.out.print(str + " ");
            count++;
            if (count % 20 == 0) {
                System.out.println();
                count = 0;
            }
        }
        checkDuplicate(s);
    }
}
