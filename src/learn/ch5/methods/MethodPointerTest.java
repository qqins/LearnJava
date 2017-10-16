package learn.ch5.methods;

import com.sun.xml.internal.fastinfoset.tools.PrintTable;

import java.lang.reflect.Method;

/**
 * Created by qqins on 2017/10/12 15:59
 */
public class MethodPointerTest {
    public static void main(String[] args) throws Exception{
        Method squre = MethodPointerTest.class.getMethod("squre", double.class);
        Method sqrt = Math.class.getMethod("sqrt", double.class);

        printTable(1,10,10,squre);
        printTable(1,10,10,sqrt);
    }
    public static double squre(double x){
        return x*x;
    }
    public static void printTable(double from,double to,int n,Method f){
        System.out.println(f);
        double dx = (to - from) / (n - 1);
        for (double x = from; x <=to ; x+=dx) {
            try {
                double y = (Double) f.invoke(null, x);
                System.out.printf("%10.4f | %10.4f\n",x,y);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
