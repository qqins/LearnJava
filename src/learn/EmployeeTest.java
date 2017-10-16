/*package learn;

import javax.xml.transform.Source;
import java.time.LocalDate;
import java.util.Date;

*//**
 * Created by qqins on 2017/9/20 12:11
 *//*
public class EmployeeTest {
    public static void main(String[] args) {
//        System.out.println(new Date());
        Employee[] staff = new Employee[3];
        Employee harry = new Employee("q", 11, 11, 11, 11);
        Date d = harry.getHireDay1();
        System.out.println(d);
//        double tenYearsInMilliSeconds=10*365.25*24*60*60*1000;
//        d.setTime(d.getTime()-(long)tenYearsInMilliSeconds);
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
        for (Employee e : staff) {
            e.raiseSalary(5);
            e.setId();
        }

        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary() + ", hireDay="
                    + e.getHireDay()+", id="+e.getId());
        }
        System.out.println(staff[1].getId());
        System.out.println(staff[1].getNexId());
        System.out.println(Employee.getNexId());
    }
}

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;
    private Date hireDay1;
    private static int nexId = 1;
    private int id;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public void setId() {
        this.id = nexId;
        nexId++;
    }

    public int getId() {
        return id;
    }

    public static int getNexId() {
        return nexId;
    }

    public Date getHireDay1() {
        System.out.println(hireDay1);
        return hireDay1;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public static void main(String[] args) {
        Employee e;
        e = new Employee("qs", 20000,2017, 9, 20);
        System.out.println(e.getSalary());
    }
}*/
