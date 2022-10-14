package Day48.Java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaLocalDate {
    public static void main(String[] args) {

        // LocalDate, LocalTime, LocalDateTime



       LocalDate anyDate = LocalDate.of(2022, 10, 10 );
       System.out.println(anyDate);
       LocalDate date = LocalDate.of(2000, Month.APRIL, 5);
        System.out.println(date);

        int dayOfYear = anyDate.getDayOfYear();
        System.out.println(dayOfYear);

        int monthValue = date.getMonthValue();
        System.out.println(monthValue);

        LocalDate today = LocalDate.now();
        System.out.println(today);

        String shortFormatDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("shortFormatDate = " + shortFormatDate);
        String mediumFormatDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("mediumFormatDate = " + mediumFormatDate);
        String longFormatDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("longFormatDate = " + longFormatDate);
        String fullFormatDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("fullFormatDate = " + fullFormatDate);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        LocalDate date1 = LocalDate.of(2000, 11, 14);
        String fullFormatDate1 = date1.format(dateTimeFormatter);
        System.out.println("fullFormatDate1 = " + fullFormatDate1);

        // Option 1
        DateTimeFormatter ourFormat = DateTimeFormatter.ofPattern("MM:dd:yyy");
        String ownFormat = date1.format(ourFormat);
        System.out.println("ownFormat = " + ownFormat);

        // Option 2

        ownFormat = date1.format(DateTimeFormatter.ofPattern("MM::dd::yyy"));
        System.out.println("ownFormat = " + ownFormat);
    }
}
