package Day48.Practice.Ibrahim;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaLocalTime {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println("time = " + time);
        
        LocalTime tm = LocalTime.of(2, 28, 25, 158);
        System.out.println("tm = " + tm);

        int hour = tm.getHour();
        int minute = tm.getMinute();
        int second = tm.getSecond();

        System.out.println("second = " + second);
        System.out.println("minute = " + minute);
        System.out.println("hour = " + hour);

        
        try{
            String format = time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT));
            System.out.println("Short = " + format);
            String format1 = time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM));
            System.out.println("Medium = " + format1);
            String format2 = time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG));
            System.out.println("Long = " + format2);
            String format3 = time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL));
            System.out.println("Full = " + format3);
            
        }catch (RuntimeException e){
            System.out.println(e);
            System.out.println("You have an error");
        }
        
    }
}
