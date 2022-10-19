package Day48.Practice.Ibrahim;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaDate {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);

        LocalDate dt = LocalDate.of(2022, 10, 18);
        System.out.println("dt = " + dt);
        LocalDate dt1 = LocalDate.of(2022, Month.OCTOBER, 18);
        System.out.println("dt1 = " + dt1);

        int dayOfYear = dt.getDayOfYear();
        System.out.println("dayOfYear = " + dayOfYear);

        int monthValue = dt1.getMonthValue();
        Month month = dt1.getMonth();
        LocalDateTime localDateTime = dt1.atStartOfDay();
        System.out.println("monthValue = " + monthValue);
        System.out.println("month = " + month);
        System.out.println("localDateTime = " + localDateTime);



        String format = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("Short = " + format);
        String format1 = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("Medium = " + format1);
        String format2 = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("Long = " + format2);
        String format3 = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("Full = " + format3);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

        LocalDate dt2 = LocalDate.of(1982, 7, 16);
        String format4 = dt2.format(dateTimeFormatter);
        System.out.println("format4 = " + format4);

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("MM dd'th' yyyy");
        String format5 = dt2.format(dateTimeFormatter1);
        System.out.println("format5 = " + format5);

    }
}
