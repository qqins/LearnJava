package learn.ch7;

public class Test {
    public static void main(String[] args) {
        System.out.println(he(1, 0));
    }

    public static int he(int a, int b) {
        try {
            if (b == 0) {
                throw new Exception("!!!");
            }
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        } finally {
            System.out.println("2");
        }
        return 3;
    }
}
