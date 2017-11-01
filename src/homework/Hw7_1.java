package homework;

import java.util.Scanner;

/**
 * Created by qqins on 2017/11/1 9:06
 */
public class Hw7_1 {
    public static boolean isPrim(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void decompose(int n) {
        System.out.print(n + "=");
        for (int j = 2; j <= n; j++) {
            while (n != j) {
                if (n % j == 0) {
                    System.out.print(j + "x");
                    n = n / j;
                } else
                    break;
            }
        }
        System.out.print(n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        decompose(input);
    }
}
