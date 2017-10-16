package homework;

import javax.xml.transform.Source;
import java.util.PrimitiveIterator;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

/**
 * Created by qqins on 2017/10/12 10:40
 */
public class Hw4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int digital;
        int count = 0;
        if (num < 0) {
            System.out.print("fu ");
        }
        num = Math.abs(num);
        int originalNum = num;
        do {
            digital = num % 10;
            num = num / 10;
            count++;
        } while (num != 0);
        num = originalNum;
        for (int i = count-1; i >= 0; i--) {
            digital = num / (int) Math.pow(10, i);
            num = num % (int) Math.pow(10, i);
            switch (digital) {
                case 0:
                    System.out.print("ling");
                    break;
                case 1:
                    System.out.print("yi");
                    break;
                case 2:
                    System.out.print("er");
                    break;
                case 3:
                    System.out.print("san");
                    break;
                case 4:
                    System.out.print("si");
                    break;
                case 5:
                    System.out.print("wu");
                    break;
                case 6:
                    System.out.print("liu");
                    break;
                case 7:
                    System.out.print("qi");
                    break;
                case 8:
                    System.out.print("ba");
                    break;
                case 9:
                    System.out.print("jiu");
                    break;
            }
            if(i!=0)
                System.out.print(" ");
        }
    }
}
