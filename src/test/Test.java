package test;

import java.util.LinkedList;
import java.util.Scanner;


public class Test {
    private static LinkedList<Integer> list = new LinkedList<Integer>();

    /**
     * @param args 从1 2 3 到n中取任意个数组成m；
     */
    static int count=0;
    static void myPrint() {
        for (int i = 0; i < list.size(); i++)
            System.out.print("  " + list.get(i));
            count++;
        System.out.println();
    }

    public static void findSum(int sum, int n) {
        if (n >= 0 && sum == 0) {
            myPrint();
            return;
        }
        if (n >= 1 && sum == 1) {
            list.push(1);
            myPrint();
            list.pop();
            return;
        }
        if (n == 1 && sum > 1)
            return;
        if (sum >= n) {
            list.push(n);
            findSum(sum - n, n - 1);
            list.pop();
            findSum(sum, n - 1);
        } else {
            findSum(sum, sum);
        }
        return;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        findSum(m, n);
        System.out.println(count);

    }


}
