package learn.ch6.clone;

/**
 * Created by qqins on 2017/11/12 21:17
 */
public class CloneTest {
    public static void main(String[] args) {
        try {
            Employee original = new Employee("John", 50000);
            System.out.println(original);
            original.setHireDay(2000, 1, 1);
            Employee copy = original.clone();
            System.out.println(copy);
            copy.raiseSalary(10);
            copy.setHireDay(2002, 12, 31);
            System.out.println("original=" + original);
            System.out.println("copy=" + copy);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}


