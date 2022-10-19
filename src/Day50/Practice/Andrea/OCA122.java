package Day50.Practice.Andrea;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class OCA122 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012, 1, 30);
        date.plusDays(10); //does not change the value of date
        System.out.println(date);

//        LocalDate date2 = LocalDate.of(2012, 01, 32); - throws exception because there is not 32 days
//        System.out.println(date2);

        LocalDateTime ldt = LocalDateTime.of(2014, 7, 31, 1, 1);
        ldt.plusDays(30);
        ldt.plusMonths(1);
        System.out.println(ldt);
        System.out.println(ldt.format(DateTimeFormatter.ISO_DATE_TIME));

        LocalDateTime ldt2 = LocalDateTime.of(2014, 7, 31, 1, 1);
        ldt2.plusDays(30);
        ldt2.plusMonths(1);
        System.out.println(ldt2);
        System.out.println(ldt2.format(DateTimeFormatter.ISO_DATE));

        LocalDate ldt3 = LocalDate.of(2014, Month.JUNE, 21);
        System.out.println(ldt3);

//        LocalDate date5 = LocalDate.of(2018, Month.APRIL, 40); // runtime exception because there are not 40 days ina month
//        System.out.println(date5.getYear() + " " + date5.getMonth() + " "
//                + date5.getDayOfMonth());

        LocalDate date8 = LocalDate.of(2018, Month.APRIL, 30);
        date8.plusDays(2);
        date8.plusYears(3);
        System.out.println(date8.getYear() + " " + date8.getMonth() + " "
                + date8.getDayOfMonth());

    }
}

//Dates, like Strings, are immutable
// to change the value of date, line 9 should be date =  date.plusDays(10);