package learn.how2j.string_learn.stringbuffer;

/**
 * Created by qqins on 2017/11/3 15:23
 */
public class Test {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("let there");
        sb.append(" be light");
        System.out.println(sb);
        sb.delete(4, 10);
        System.out.println(sb);
        sb.insert(4, "there ");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}
