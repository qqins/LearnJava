package learn.ch6.interfaces;


import java.util.Arrays;

/**
 * Created by qqins on 2017/10/14 14:59
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);
        Arrays.sort(staff);
        for (Employee e:staff){
            System.out.println("name="+e.getName()+", salary="+e.getSalary());
        }
    }
}
