package Day47.Date;

import java.time.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class JavaLocalDate {
    public static void main(String[] args) {

        //LocalDate
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate anyday = LocalDate.of(2022,10,14);
        System.out.println(anyday);
        LocalDate secondday = LocalDate.of(2022,Month.AUGUST,15);
        int dayofyear = anyday.getDayOfYear();
        System.out.println(dayofyear);
        String shortDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        String mediumDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String longDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println(shortDate);
        System.out.println(mediumDate);
        System.out.println(longDate);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

        String fullDate = today.format(dateTimeFormatter);
        DateTimeFormatter ourformat = DateTimeFormatter.ofPattern("MM---dd---YYYY");
        String ourformatt = today.format(ourformat);
        System.out.println(ourformatt);


    }
}
