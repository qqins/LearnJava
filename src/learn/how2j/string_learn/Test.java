package learn.how2j.string_learn;

import java.util.Arrays;

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
        char c = 'A';
        System.out.println(c);
        short sc=(short) c;
        System.out.println(sc);

        String s = "helloworld";
        char [] ch=s.toCharArray();
        System.out.println(ch);
        char []cc={'h','h','h','h'};
        System.out.println(cc);
        int[] n={1,2,3,4,5};
        System.out.println(n);

        String q = new String("   ehhe   ");
        System.out.println(q);
        System.out.println(q.trim());

        String t = q.replaceFirst(" ","r");
        System.out.println(t);

        char [] chh={'a','c','b'};
        String [] strr={"aa","dd","ff"};
        System.out.println(chh);
        System.out.println(Arrays.toString(strr));


    }
}
