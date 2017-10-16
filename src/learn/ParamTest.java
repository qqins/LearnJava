/*package learn;

*//**
 * Created by qqins on 2018/9/21 18:42
 *//*
public class ParamTest {
    public static void main(String[] args) {
        System.out.println("Testing tripValue");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);
        System.out.println();
        System.out.println("\nTesting tripleSalary");
        Employee harry = new Employee("Harry", 50000);
        System.out.println("Before: salary =" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary =" + harry.getSalary());

        System.out.println();
        System.out.println("Testing swap:");

        Employee a = new Employee("Alice", 70000);
        Employee b = new Employee("Bob", 60000);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void tripleValue(double x) {
        x = 3 * x;
        System.out.println("End of method: x=" + x);
    }

    public static void tripleSalary(Employee x) {
        x.raiseSalary(200);
        System.out.println("End of method: salary=" + x.getSalary());
    }

    public static void swap(Employee x, Employee y) {
*//*        Employee temp = x;
        x = y;
        y = temp;
 *//*
        String tem = x.getName();
        x.setName(y.getName());
        y.setName(tem);
        System.out.println("End of method: x=" + x.getName());
        System.out.println("End of method: y=" + y.getName());
    }
}

class Employee {
    private String name;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double byPercent) {
        double rasie = salary * byPercent / 100;
        salary += rasie;
    }
}*/
