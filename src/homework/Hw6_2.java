package homework;

import java.util.Scanner;

/**
 * Created by qqins on 2017/10/31 14:41
 */
public class Hw6_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String ns = str;
        int hours;
        int minutes;
        int seconds;
        int xor = 0;
        boolean flag = false;
        while (!str.equals("END")) {
            String[] word = str.split(",");
            if (word[0].equals("$GPRMC") && word[2].equals("A")) {
                int i;
                for (i = 1; str.charAt(i) != '*'; i++) {
                    xor = xor ^ str.charAt(i);
                }
                if (xor % 65536 == Integer.parseInt(str.substring(i + 1), 16)) {
                    ns = word[1];
                    flag = true;
                }
            }
            xor = 0;
            str = in.nextLine();
        }
        if (flag) {
            hours = Integer.parseInt(ns.substring(0, 2));
            if (hours >= 16) {
                hours = hours - 16;
            } else {
                hours = hours + 8;
            }
            minutes = Integer.parseInt(ns.substring(2, 4));
            seconds = Integer.parseInt(ns.substring(4, 6));
            System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
        }
    }
}
