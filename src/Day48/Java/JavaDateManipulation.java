package Day48.Java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JavaDateManipulation {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);

        today = today.plusDays(1);
        System.out.println("today = " + today);

        today = today.plusWeeks(3);
        System.out.println("today = " + today);

        today = today.plusMonths(2);
        System.out.println("today = " + today);

        today = today.plusYears(10);
        System.out.println("today = " + today);

        today = today.plusYears(1).plusDays(10).plusMonths(3);
        System.out.println("today = " + today);

        today = today.minusDays(20).minusMonths(1).minusYears(3);
        System.out.println("today = " + today);


        LocalTime timeNow = LocalTime.of(23,20,20);
        System.out.println("timeNow = " + timeNow);
        timeNow = timeNow.plusMinutes(50).minusHours(2).plusSeconds(20);
        System.out.println("timeNow = " + timeNow);

        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("dateTimeNow = " + dateTimeNow);
        dateTimeNow = dateTimeNow.plusSeconds(10).plusDays(100).minusYears(1);
        System.out.println("dateTimeNow = " + dateTimeNow);

        // Can we subtract days of each other? No. instead we can use values by calling getYear, getMonth, getDays methods.
        today = today.minusYears(dateTimeNow.getYear());
        System.out.println("dateTimeNow = " + today);

        today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1980, 11, 13);
        LocalDate localDate = today.minusYears(birthday.getYear()).minusMonths(birthday.getMonthValue()).minusDays(birthday.getDayOfMonth());
        System.out.println("localDate = " + localDate);

    }
}
