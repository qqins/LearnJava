package learn.ch5.inheritance;

import learn.ch5.inheritance.Employee;
import learn.ch5.inheritance.Manager;

/**
 * Created by qqins on 2017/9/26 9:43
 */
public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);
        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);
        Manager b = new Manager();
        boss.setName("Qin");

        if (staff[1] instanceof Manager) {
            System.out.printf("yes");
            b = (Manager) staff[1];
            b.setBonus(1000);
            System.out.println(b.getName() + b.getSalary());
        }
        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary());
        }
    }
}
