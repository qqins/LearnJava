package learn.how2j.string_learn.sort_string;

import java.util.Arrays;

/**
 * Created by qqins on 2017/11/2 13:32
 */
public class SortStr {
    public static String genStr() {
        char start = '0';
        char end = 'z' + 1;
        char[] ch = new char[6];
        for (int i = 0; i < ch.length; i++) {
            char c;
            do {
                c = (char) ((int) (Math.random() * (end - start)) + start);
            } while (!(Character.isDigit(c) || Character.isLetter(c)));
            ch[i] = c;
        }
        return String.valueOf(ch);
    }

    public static void swapStr(String s1, String s2) {
        String temp;
        temp = s1;
        s1 = s2;
        s2 = temp;

    }

    public static void sortStr(String[] s) {
        String[] str = new String[s.length];
        for (int i = 0; i < str.length; i++) {
            str[i] = s[i].toLowerCase();
        }
        for (int i = 0; i < s.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < s.length; j++) {
                if (str[j].charAt(0) < str[index].charAt(0)) {
                    index = j;
                }
            }
            if (index != i) {
                String temp1, temp2;
                temp1 = s[i];
                temp2 = str[i];
                s[i] = s[index];
                str[i] = str[index];
                s[index] = temp1;
                str[index] = temp2;
//                swapStr(str[i],str[index]);
//                swapStr(s[i],s[index]);
            }
        }
    }

    public static void main(String[] args) {
        String[] s = new String[6];
        for (int i = 0; i < s.length; i++) {
            s[i] = genStr();
            System.out.println(s[i]);
        }
        sortStr(s);
        System.out.println("***********");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
