package homework.homework2;

/**
 * Created by qqins on 2017/11/17 15:27
 */

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class HW1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fraction a = new Fraction(in.nextInt(), in.nextInt());
        Fraction b = new Fraction(in.nextInt(), in.nextInt());
        a.print();
        b.print();
        a.plus(b).print();
        a.multiply(b).plus(new Fraction(5, 6)).print();
        a.print();
        b.print();
        in.close();
    }

}

class Fraction {
    private int a;
    private int b;
    Fraction() {

    }

    Fraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double toDouble() {
        return ((double) a) / b;
    }

    public Fraction plus(Fraction r) {
        Fraction x = new Fraction();
        x.a = a * r.b + r.a * b;
        x.b = b * r.b;
        return x;
    }

    public Fraction multiply(Fraction r) {
        Fraction x = new Fraction();
        x.a = a * r.a;
        x.b = b * r.b;
        return x;
    }

    public void print() {
        int m;
        int n;
        m = a > b ? a : b;
        n = a < b ? a : b;
        int c = getGCD(m, n);
        if(m==n){
            System.out.println(1);
        }else {
            System.out.println(a / c + "/" + b / c);
        }
    }

    public int getGCD(int m, int n) {
        if (n == 0)
            return m;
        else
            return getGCD(n, m % n);
    }
}