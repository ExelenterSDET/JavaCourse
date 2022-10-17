package Day47.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);
        DateTimeFormatter fullforma = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        String fullformat = today.format(fullforma);
        System.out.println(fullformat);
        DateTimeFormatter ownformat = DateTimeFormatter.ofPattern("MM:dd:yyy|HH:mm:ss");
        String ownform = today.format(ownformat);
        System.out.println(ownform);
        DateTimeFormatter ownformat1 = DateTimeFormatter.ofPattern("yyy-MM-dd'T'HH:mm:ss2");
        String ownform1 = today.format(ownformat1);
        System.out.println(ownform1);
    }
}
