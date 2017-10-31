package homework;

import javax.xml.transform.Source;
import java.util.Scanner;

/**
 * Created by qqins on 2017/10/31 11:10
 */
public class Hw6_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int count = 0;
        boolean isEnd = false;
        boolean isWord = false;
        if (!str.equals(".")) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c != ' ') {
                    count++;
                    isWord = true;
                }
                if (isWord && (c == ' ' || c == '.')) {
                    isEnd = true;
                    isWord = false;
                }
                if (isEnd) {
                    if (c == '.') {
                        System.out.print(count - 1);
                    } else {
                        System.out.print(count + " ");
                    }
                    count = 0;
                    isEnd = false;
                }
            }
        }
    }
}
