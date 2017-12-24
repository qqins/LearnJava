package learn;


import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Created by qqins on 2017/9/19 22:23.
 */
public class CalenderTest {
    public static void main(String[] args) {
        Employee te = new Employee();
        System.out.println(te.getId());
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        date = date.minusDays(today - 1);
        System.out.println(date);
        DayOfWeek weekday = date.getDayOfWeek();
        System.out.println(weekday);
        int value = weekday.getValue();
        System.out.println(value);
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 0; i < value - 1; i++) {
            System.out.print("    ");
        }
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
    }
}
