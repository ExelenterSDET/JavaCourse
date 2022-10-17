package Day49.Practice.Andrea.Practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDate {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);

        String format = now.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("format = " + format);

        String format2 = now.format(DateTimeFormatter.ISO_DATE);
        System.out.println("format2 = " + format2);
        
        LocalDate parse = LocalDate.parse("20140606", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("parse = " + parse);
    }
}
