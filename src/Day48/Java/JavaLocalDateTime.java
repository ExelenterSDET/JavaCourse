package Day48.Java;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaLocalDateTime {

    public static void main(String[] args) {

        LocalDateTime localDateTimeNow = LocalDateTime.now();
        System.out.println("localDateTimeNow = " + localDateTimeNow);

        LocalDateTime anyDateTime =
                LocalDateTime.of(2000, Month.AUGUST, 23, 22, 5, 10, 500);
        System.out.println("anyDateTime = " + anyDateTime);

        Month month = anyDateTime.getMonth();
        System.out.println("month = " + month);
        int year = anyDateTime.getYear();
        System.out.println("year = " + year);

        String shortFormatDate = localDateTimeNow.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("shortFormatDate = " + shortFormatDate);
        String mediumFormatDate = localDateTimeNow.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("mediumFormatDate = " + mediumFormatDate);
        String longFormatDate = localDateTimeNow.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("longFormatDate = " + longFormatDate);
        String fullFormatDate = localDateTimeNow.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("fullFormatDate = " + fullFormatDate);


         shortFormatDate = localDateTimeNow.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        System.out.println("shortFormatDate = " + shortFormatDate);
         mediumFormatDate = localDateTimeNow.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("mediumFormatDate = " + mediumFormatDate);
//         longFormatDate = localDateTimeNow.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG));
//        System.out.println("longFormatDate = " + longFormatDate);
//         fullFormatDate = localDateTimeNow.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
//        System.out.println("fullFormatDate = " + fullFormatDate);

        shortFormatDate = localDateTimeNow.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT));
        System.out.println("shortFormatDate = " + shortFormatDate);
        mediumFormatDate = localDateTimeNow.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM));
        System.out.println("mediumFormatDate = " + mediumFormatDate);

        // 2022-10-14T01:09:59Z
        DateTimeFormatter ownFormat = DateTimeFormatter.ofPattern("yyy-MM-dd'T'HH:mm:ss'Z'");
        String format = localDateTimeNow.format(ownFormat);
        System.out.println(format);

    }
}
