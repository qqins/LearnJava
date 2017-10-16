package learn.string_learn;

/**
 * Created by qqins on 2017/10/13 16:37
 */
public class NumToStr {
    public static void main(String[] args) {
        int i = 666;
        String str = String.valueOf(i);
        System.out.println("   * * * * * * * * *  ");
        System.out.println(str);
        Integer it = i;
        String str2 = it.toString();
        System.out.println(str.equals(str2));
        System.out.println(str.compareTo(str2));
        System.out.println(str2);
        System.out.println(1.0-0.9);
    }
}
