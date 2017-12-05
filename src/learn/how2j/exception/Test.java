package learn.how2j.exception;

/**
 * Created by qqins on 2017/12/3 10:23
 */
public class Test {
    public static void main(String[] args) {
        int result = method();
        System.out.println(result);
    }

    public static int method() {
        try {
            return method1();
        } catch (Exception e) {
            return method2();
        } finally {
            return method3();
        }
    }

    public static int method1() {
        System.out.println("method1");
        return 1;
    }

    public static int method2() {
        System.out.println("method2");
        return 2;
    }

    public static int method3() {
        System.out.println("method3");
        return 3;
    }
}
