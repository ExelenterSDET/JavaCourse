package Day49.Practice.Ibrahim;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDate {
    public static void main(String[] args) {
        
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);

        String format = now.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("format = " + format);


        
    }
}
