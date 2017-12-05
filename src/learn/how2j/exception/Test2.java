package learn.how2j.exception;

/**
 * Created by qqins on 2017/12/3 10:43
 */
public class Test2 {
    public static void main(String[] args) {
        String str=null;
        try {
            str.toString();
        }catch (NullPointerException e){
            System.out.println("捕捉到空指针异常");
        }

        StringBuffer sb = new StringBuffer("1234567890");
        try {
            for (int i = 0; i < 100; i++) {
                sb.append(sb.toString());
            }
        }catch (OutOfMemoryError e){
            System.out.println("捕捉到内存异常");
        }
    }
}
