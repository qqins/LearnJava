package homework;

import java.util.Scanner;

/**
 * Created by qqins on 2017/10/12 10:05
 */
public class Hw4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0;
        int primeCount = 0;
        boolean isPrime = true;
        for (int i = 2; ; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeCount++;
                if (primeCount >= n) {
                    sum += i;
                }
                if (primeCount == m)
                    break;
            }
            isPrime=true;
        }
        System.out.println(sum);
    }
}
