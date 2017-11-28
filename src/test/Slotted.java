package test;

/**
 * Created by qqins on 2017/11/16 16:26
 */
public class Slotted {
    public static void main(String[] args) {
        System.out.println(slo(100));
        System.out.println(slo(98));
        System.out.println(slo(0));
        System.out.println(slo(50));
        System.out.println(slo(49));
        System.out.println(slo(80));
    }

    public static double slo(double x) {
        return Math.ceil(4 * (1 - Math.min(x, 100) / 100.0))-1;
    }
}
