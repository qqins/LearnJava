package learn.string_learn;

/**
 * Created by qqin on 17-10-16  下午3:35
 */
public class StrToNum {
    public static void main(String[] args) {
        String sNum = "666";
        int num = Integer.parseInt(sNum);
        System.out.println(num);
        int i=9;
        Integer i1=i;//自动装箱
        Integer i2 = new Integer(i);//装箱
        int i3=i2;//自动拆箱
        int i4 =i1.intValue();//拆箱
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
