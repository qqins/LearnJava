package learn.ch6.interfaces;

import java.util.Arrays;

/**
 * Created by qqins on 2017/10/14 14:49
 */
public class Employee implements Comparable {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Object o) {
        Employee e=new Employee(" ",0);
        if (o instanceof Employee) {
            e = (Employee) o;
        }

        return Double.compare(this.salary, e.salary);
    }
}
