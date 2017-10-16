package learn;

import javax.xml.transform.Source;
import java.time.LocalDate;
import java.util.Date;

/**
 * Created by qqins on 2017/9/19 14:36
 */
public class Test {
    public static void main(String[] args) {
        /*System.out.println(new Date());
        String s = new Date().toString();
        System.out.println(s);
        Date birthday = new Date();
        System.out.println(birthday);
        Date deadline;
        deadline=birthday;
        System.out.println(deadline);*/
        System.out.println(new Date());
        System.out.println(LocalDate.now());
        LocalDate newYearEve = LocalDate.of(1999, 12, 31);
        int year = newYearEve.getYear();
        int month = newYearEve.getMonthValue();
        int day = newYearEve.getDayOfMonth();
        int day1 = newYearEve.getDayOfYear();
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(day1);
        LocalDate aThousandDaysLater = newYearEve.plusDays(1000);
        System.out.println(newYearEve);
        System.out.println(aThousandDaysLater);
        newYearEve = newYearEve.minusDays(day);
        System.out.println(newYearEve);
    }
}
