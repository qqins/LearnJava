package learn.string_learn;

/**
 * Created by qqin on 17-10-16  下午3:57
 */
public class Test {
    public static void main(String[] args) {
        double pi = 3.1415926;
        String str_pi = String.valueOf(pi);
        System.out.println(str_pi);
        Double dPi = pi;
        String str_pi1 = dPi.toString();
        System.out.println(str_pi1);
        double ppi = Double.parseDouble(str_pi);
        System.out.println(ppi);
    }
}
