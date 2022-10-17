package Day47.Date;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaLocalTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalTime anytime = LocalTime.of(5,12,44);
        System.out.println(anytime);
        int hour = anytime.getHour();
        int minute = anytime.getMinute();
        int seconds = anytime.getSecond();
        System.out.println(hour+" "+minute+" "+" "+seconds);
        DateTimeFormatter shortformat = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        String shorttime = anytime.format(shortformat);
        System.out.println(shorttime);
        DateTimeFormatter ownformat = DateTimeFormatter.ofPattern("HH:mm:ss");
        String own = anytime.format(ownformat);
        System.out.println(own);
    }
}
