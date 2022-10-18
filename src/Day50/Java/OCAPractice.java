package Day50.Java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class OCAPractice {

    public static void main(String[] args) {

        LocalDate date =  LocalDate.of(2012, 01, 30);
        System.out.println(date);
        date = date.plusDays(10);
        System.out.println(date);


        LocalDateTime dt =  LocalDateTime.of(2014,7,31,1,1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));

        LocalDate dt2 =  LocalDate.of(2014, Calendar.JUNE, 21);
        System.out.println("dt2 =>" + dt2 );

        dt2 =  LocalDate.of(2014, Month.JUNE, 21);
        System.out.println("dt2 =>" + dt2 );

        System.out.println(Calendar.JANUARY + " ===  " + Month.JANUARY.getValue());


        LocalDate date12 = LocalDate.of(2018, Month.APRIL, 20);
        System.out.println(date12.getYear() + " " + date12.getMonth() + " "
                + date12.getDayOfMonth());

        LocalDate date13 = LocalDate.of(2018, Month.APRIL, 30);
        date13 = date13.plusDays(2);
        date13 = date13.plusYears(3);
        System.out.println(date13.getYear() + " " + date13.getMonth() + " " + date13.getDayOfMonth());
    }
}
