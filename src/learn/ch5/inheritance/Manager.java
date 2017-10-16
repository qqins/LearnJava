package learn.ch5.inheritance;

import learn.ch5.inheritance.Employee;

/**
 * Created by qqins on 2017/9/26 9:39
 */
public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public Manager() {

    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setName(String name) {
        super.setName(name + "ss");
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
