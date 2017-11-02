package learn.how2j.string_learn.sort_string;

import com.sun.imageio.plugins.common.BogusColorSpace;

import java.util.Scanner;

/**
 * Created by qqins on 2017/11/2 16:09
 */
public class RecursionSelectPassWord {
    public static boolean found = false;

    public static void main(String[] args) {
//        String password = genStr(3);
        String password = "004";
        System.out.println("密码是:" + password);
        char[] guessPassword = new char[password.length()];
        generatePassword(guessPassword, 0, password);
    }

    public static void generatePassword(char[] guessPassword, int index, String password) {
        if (found){
            System.out.println("qqqqqqqqqqqqqqqqq");
            return;
        }
        for (char i = '0'; i <= 'z'; i++) {
            char c = i;
            System.out.println(c);
            if (!Character.isLetterOrDigit(c))
                continue;
            guessPassword[index] = c;
            if (index != guessPassword.length - 1) {
                generatePassword(guessPassword, index + 1, password);
            } else {
                String guess = String.valueOf(guessPassword);
                System.out.println(guess);
                if (password.equals(guess)) {
                    System.out.println("破解密码为:" + guess);
                    found = true;
                    return;
                }
            }
        }
        System.out.println("over");
    }

    public static String genStr(int length) {
        String pool = "";
        char[] ch = new char[length];
        for (char i = '0'; i <= '9'; i++) {
            pool += i;
        }
        for (char i = 'a'; i <= 'z'; i++) {
            pool += i;
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            pool += i;
        }
        for (int i = 0; i < length; i++) {
            ch[i] = pool.charAt((int) (Math.random() * pool.length()));
        }
        return String.valueOf(ch);
    }
}
