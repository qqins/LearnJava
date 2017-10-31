package homework;

import java.util.Scanner;

/**
 * Created by qqins on 2017/10/31 21:35
 */
public class Hw7_2 {
    public static boolean isPerfectNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        boolean flag = false;
        for (int i = n; i <= m; i++) {
            if (isPerfectNum(i)) {
                if (flag) {
                    System.out.print(" ");
                }
                System.out.print(i);
                flag = true;
            }

        }
    }
}
