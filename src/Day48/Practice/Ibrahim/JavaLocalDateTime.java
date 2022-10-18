package Day48.Practice.Ibrahim;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class JavaLocalDateTime {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        LocalDateTime dt = LocalDateTime.of(2022, Month.OCTOBER, (18-5), 14, 32, 25, 15486534);
        System.out.println("dt = " + dt);
    }
}
