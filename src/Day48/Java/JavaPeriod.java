package Day48.Java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class JavaPeriod {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1980, 11, 12);

        // Long Way
        LocalDate localDate = today.minusYears(birthday.getYear()).minusMonths(birthday.getMonthValue()).minusDays(birthday.getDayOfMonth());
        System.out.println("localDate = " + localDate);

        // using Period class
        Period period = Period.between(birthday, today);
        System.out.println(period);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        System.out.println(years + ":" + months + ":" + days);

        Period periodDays = Period.ofDays(2);
        Period periodMonths = Period.ofMonths(2);
        Period periodYears = Period.ofYears(10);

        today = today.plus(periodDays).plus(periodMonths).plus(periodYears);
        System.out.println("today = " + today);

        LocalDateTime localDateTimeNow = LocalDateTime.now();
        LocalDateTime dateTime = LocalDateTime.of(2000, 12, 20, 14, 20, 10);

        // Period.between(dateTime, localDateTimeNow); Periods are used only for LocalDate class

        LocalTime timeNow = LocalTime.now();
        LocalTime localTime = LocalTime.of(20,20,20);
        // Period.between(localTime, timeNow);
    }
}
