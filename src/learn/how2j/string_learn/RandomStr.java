package learn.how2j.string_learn;

/**
 * Created by qqin on 17-10-16  下午9:19
 */
public class RandomStr {
    public static void main(String[] args) {
//        System.out.println(genStr());
        String[] s = new String[8];
        for (int i = 0; i < s.length; i++) {
            s[i] = genStrPool();
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    public static String genStrPool() {
        String pool = "";
        char[] ch = new char[5];
        for (char i = '0'; i <= '9'; i++) {
            pool += i;
        }
        for (char i = 'a'; i <= 'z'; i++) {
            pool += i;
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            pool += i;
        }
        for (int i = 0; i < ch.length; i++) {
            ch[i] = pool.charAt((int) (Math.random() * pool.length()));
        }
        return String.valueOf(ch);
    }

    public static String genStr() {
        short start = '0';
        short end = 'z' + 1;
        char[] ch = new char[5];
        for (int i = 0; i < ch.length; i++) {
            while (true) {
                char c = (char) (Math.random() * (end - start) + start);
                if (Character.isLetter(c) || Character.isDigit(c)) {
                    ch[i] = c;
                    break;
                }
            }
        }
        return String.valueOf(ch);
    }
}
