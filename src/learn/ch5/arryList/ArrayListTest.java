package learn.ch5.arryList;

import java.util.ArrayList;

/**
 * Created by qqins on 2017/9/28 16:13
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Employee> staff=new ArrayList<>();
        staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
        staff.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
        staff.add(new Employee("Tony Tester", 40000, 1990, 3, 15));
        Employee qin = new Employee("qqin", 100000, 1994, 12, 8);
        System.out.println(staff.size());
        staff.add(3,qin);
        System.out.println(staff.size());
        System.out.println(staff.get(0).getName());
        System.out.println(staff.get(3).getName());

        staff.set(0, qin);
        System.out.println(staff.get(0).getName());
        staff.remove(0);
        for (Employee e:staff){
            e.raiseSalary(5);
        }
        for (Employee e:staff){
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay" + e.getHireDay());
        }
    }
}
