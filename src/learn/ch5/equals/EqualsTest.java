package learn.ch5.equals;

import java.util.Date;

/**
 * Created by qqins on 2017/9/28 14:14
 */
public class EqualsTest {
    public static void main(String[] args) {
        Employee q1 = new Employee("qin1", 50000, 1994, 12, 8);
        Employee q2 = q1;
        Employee q3 = new Employee("qin1", 50000, 1994, 12, 8);
        Employee bob = new Employee("bob", 10000, 1989, 1, 9);
        System.out.println("q1.equals(q2):" + q1.equals(q2));
        System.out.println("q1==q2:" + (q1 == q2));
        System.out.println("q1.equals(q3):" + q1.equals(q3));
        System.out.println("q1==q3:" + (q1 == q3));
        System.out.println("q1.equals(bob)" + q1.equals(bob));
        System.out.println("q1.hashCode():" + q1.hashCode());
        System.out.println("q2.hashCode():" + q2.hashCode());
        System.out.println("q3.hashCode():" + q3.hashCode());
        System.out.println("bob.hashCode():" + bob.hashCode());

        Manager boss = new Manager("Lin", 80000, 1980, 9, 3);
        boss.setBonus(5000);
        Manager bos = new Manager("Lin", 80000, 1980, 9, 3);
        System.out.println("boss.equals(bos):"+boss.equals(bos));
        System.out.println("boss.hashCode():"+boss.hashCode());
        System.out.println("bos.hashCode():"+bos.hashCode());
        System.out.println(boss);
        boss.setName("qqqq");
        System.out.println(boss);
        System.out.println(bos);
    }
}
