package Day49.Java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StringToDate {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now);

        String format = now.format(DateTimeFormatter.ISO_DATE);
        System.out.println(format);

        LocalTime timeNow = LocalTime.now();
        System.out.println("timeNow = " + timeNow);

        String format1 = timeNow.format(DateTimeFormatter.ISO_TIME);
        System.out.println("format1 = " + format1);

        String date = "2014-06-12";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyy-MM-dd");
        LocalDate parsedDate = LocalDate.parse(date, dateTimeFormatter);
        System.out.println("parsedDate = " + parsedDate);

        LocalDate parsedDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
        System.out.println("parsedDate1 = " + parsedDate1);


        LocalDate parse = LocalDate.parse("2020-10-13", DateTimeFormatter.ISO_DATE);
        System.out.println(parse);

        LocalDate usingOwnPattern = LocalDate.parse("11:04:2011", DateTimeFormatter.ofPattern("dd:MM:yyy"));
        System.out.println("usingOwnPattern = " + usingOwnPattern);

        LocalDateTime localDateTimeNow = LocalDateTime.parse("2014-11-05T14:15:10", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("localDateTimeNow = " + localDateTimeNow);

        LocalDateTime localDateTimeNowWOwnPattern = LocalDateTime.parse("2014-11-05|14-15-10", DateTimeFormatter.ofPattern("yyy-MM-dd|HH-mm-ss"));
        System.out.println("localDateTimeNowWOwnPattern = " + localDateTimeNowWOwnPattern);

    }
}
