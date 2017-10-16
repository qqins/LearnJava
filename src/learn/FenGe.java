package learn;

import java.util.concurrent.ForkJoinPool;

/**
 * Created by qqins on 2017/9/19 17:22
 */
public class FenGe {
    public static void main(String[] args) {
        double f = 0.618;
        double x, y, z = 0, min = 1;
        int a = 0, b = 0;
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    continue;
                }
                x = (double) (1.0 * i / j);
                y = Math.abs(x - f);
                if (min > y) {
                    min = y;
                    z = x;
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println("离黄金分割点0.618最近的两个数相除为");
        System.out.println(a + "/" + b + "=" + z);
    }
}
