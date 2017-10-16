package homework;

import java.util.Scanner;

/**
 * Created by qqins on 2017/10/11 11:36
 */
public class Hw3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input;
        int oddCount = 0;
        int evenCount = 0;
        while ((input = in.nextInt()) != -1) {
            if (input % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        System.out.println(oddCount + " " + evenCount);
    }
}
