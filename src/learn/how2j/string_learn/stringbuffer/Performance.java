package learn.how2j.string_learn.stringbuffer;

/**
 * Created by qqins on 2017/11/3 15:32
 */
public class Performance {
    public static String randomStr(int length) {
        char[] ch = new char[length];
        String pool = "";
        for (char i = '0'; i <= '9'; i++) {
            pool += i;
        }
        for (char i = 'a'; i <= 'z'; i++) {
            pool += i;
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            pool += i;
        }
        for (int i = 0; i < length; i++) {
            ch[i] = pool.charAt((int) (Math.random() * pool.length()));
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        String str1="";
        StringBuffer sb=new StringBuffer();
        long t1=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str1 = str1 + randomStr(10);
        }
        System.out.println(System.currentTimeMillis()-t1);
        long t2=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append(randomStr(10));
        }
        System.out.println(System.currentTimeMillis()-t2);
    }
}
