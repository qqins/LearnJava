package learn.ch5.abstractClasses;

/**
 * Created by qqins on 2017/9/27 15:11
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");
        Employee e= (Employee) people[0];
        e.raiseSalary(5000);
        for (Person p : people) {
            System.out.println(p.getName() + "," + p.getDescription());
        }
    }
}
