package homework;


import java.util.Scanner;

/**
 * Created by qqins on 2017/10/21 21:46
 */
public class Hw5_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SIZE = 101;
        int[] a = new int[SIZE];
        int[] b = new int[SIZE];
        int num;
        int aMax = 0;
        int bMax = 0;
        int count=0;
        do {
            num = in.nextInt();
            if (num > aMax) {
                aMax = num;
            }
            a[num] = in.nextInt();
        } while (num != 0);
        do {
            num = in.nextInt();
            if (num > bMax) {
                bMax = num;
            }
            b[num] = in.nextInt();
        } while (num != 0);
        int max = (aMax > bMax ? aMax : bMax);
        int[] c = new int[max + 1];
        c[max] = a[max] + b[max];
        if (c[max] == 1) {
            if (max == 0) {
                System.out.print(c[max]);
            } else if (max == 1) {
                System.out.print("x");
            } else {
                System.out.print("x" + max);
            }
        }else if(c[max]==0){
            count++;
        }
        else {
            if (max == 0) {
                System.out.print(c[max]);
            } else if (max == 1) {
                System.out.print(c[max] + "x");
            } else {
                System.out.print(c[max] + "x" + max);

            }
        }
        for (int i = max - 1; i >= 0; i--) {
            c[i] = a[i] + b[i];
            if (c[i] > 1) {
                if (i == 1) {
                    System.out.print("+" + c[i] + "x");
                } else if (i == 0) {
                    System.out.print("+" + c[i]);
                } else {
                    System.out.print("+" + c[i] + "x" + i);
                }
            } else if (c[i] < 0) {
                if (i == 1) {
                    System.out.print(c[i] + "x");
                } else if (i == 0) {
                    System.out.print(c[i]);
                } else {
                    System.out.print(c[i] + "x" + i);
                }
            } else if (c[i] == 1) {
                if (i == 1) {
                    System.out.print("+" + "x");
                } else if (i == 0) {
                    System.out.print("+" + c[i]);
                } else {
                    System.out.print("+" + "x" + i);
                }
            }else if(c[i]==0){
                count++;
            }
        }
        if(count==max+1)
            System.out.print(0);
    }
}
