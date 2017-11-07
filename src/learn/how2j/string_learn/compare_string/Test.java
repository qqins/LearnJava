package learn.how2j.string_learn.compare_string;

/**
 * Created by qqins on 2017/11/3 13:50
 */
public class Test {
    public static void main(String[] args) {
        String str1 = "qqin";
        String str2 = "qqin";
        String str3 = new String(str2);
        String str4=str1.toUpperCase();
        String start = "q";
        String end = "n";
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str4));
        System.out.println(str1.startsWith(start));
        System.out.println(str1.endsWith(end));
    }
}
