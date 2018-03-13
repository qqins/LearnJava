package learn.ch9.map;


import java.lang.reflect.Array;
import java.util.*;

/**
 * @author qqins
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, Employee> staff = new HashMap<>();
        staff.put("144-25-5464", new Employee("Amy Lee"));
        staff.put("567-24-2546", new Employee("Harry Hacker"));
        staff.put("157-62-7935", new Employee("Gary Cooper"));
        staff.put("456-62-5527", new Employee("Francesca Cruz"));
        System.out.println(staff);
        staff.forEach((k, v) ->
                System.out.println("key" + k + ", value=" + v));

        List<String> settings = Collections.nCopies(10, "qq");
        System.out.println(settings);
    }
}
