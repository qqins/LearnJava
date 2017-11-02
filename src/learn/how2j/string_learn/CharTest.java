package learn.how2j.string_learn;

import java.util.Scanner;

/**
 * Created by qqin on 17-10-16  下午4:27
 */
public class CharTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        char[] cs=str.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if (Character.isUpperCase(cs[i]) || Character.isDigit(cs[i])) {
                System.out.print(cs[i]);
            }
        }
    }
}
