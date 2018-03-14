//package learn.ch7;

import com.sun.org.apache.regexp.internal.RE;

import java.security.spec.ECField;
import java.util.ResourceBundle;

public class MathTest {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("程序运行出错");
            System.exit(1);
        }
        try {
            TestDemo t = new TestDemo();
            System.out.println(t.div(args[0], args[1]));
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}

class TestDemo {
    public int div(String x, String y) throws ArithmeticException, NumberFormatException {
        int result = 0;

        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        result = a / b;

        return result;
    }
}
