package learn.ch5.equals;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Created by qqins on 2017/9/28 13:49
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public Employee(String harry_hacker, int i) {

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Employee e = (Employee) obj;
        return Objects.equals(this.name, e.name) && Objects.equals(this.salary, e.salary)
                && Objects.equals(this.hireDay, e.hireDay);
    }
    @Override
    public int hashCode(){
        return Objects.hash(name,salary,hireDay);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[name:" + getName() + ",salary:" + getSalary() + ",hireDay:" + getHireDay() + "]";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
