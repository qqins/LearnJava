package homework;

import java.util.Scanner;

/**
 * Created by qqins on 2017/10/11 13:58
 */
public class Hw3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int digital;
        int numCount = 1;
        int sameOddEven = 0;
        int binaryNum = 0;
        do {
            digital = num % 10;
            num = num / 10;
            if (digital % 2 == numCount % 2)
                sameOddEven = 1;
            else
                sameOddEven = 0;
            binaryNum = binaryNum + (int) (Math.pow(2, numCount - 1)) * sameOddEven;
            numCount++;
        } while (num != 0);
        System.out.println(binaryNum);
    }
}
