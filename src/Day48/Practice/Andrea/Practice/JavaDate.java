package Day48.Practice.Andrea.Practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate anyDate = LocalDate.of(2022, 10, 10);
        System.out.println(anyDate);

        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);

        LocalTime anyTime = LocalTime.of(5, 10, 30);
        System.out.println(anyTime);

        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println(dateTimeNow);

        LocalDateTime anyDateTime = LocalDateTime.of(2000, Month.AUGUST, 23, 12, 3);
        System.out.println(anyDateTime);

        Month month = anyDate.getMonth();
        System.out.println(month);

        String shortDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(shortDate);

        String medDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println(medDate);
        String longDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println(longDate);
        String fullDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(fullDate);

        DateTimeFormatter ourFormat = DateTimeFormatter.ofPattern("MM:dd:yyy");
    }
}
