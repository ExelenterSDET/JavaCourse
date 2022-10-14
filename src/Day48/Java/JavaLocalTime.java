package Day48.Java;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaLocalTime {
    public static void main(String[] args) {

        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);

        LocalTime anyTime = LocalTime.of(5, 10, 30);
        System.out.println(anyTime);

        int hour = timeNow.getHour();
        System.out.println("hour = " + hour);
        int minute = timeNow.getMinute();
        System.out.println("minute = " + minute);
        int second = timeNow.getSecond();
        System.out.println("second = " + second);
        int nano = timeNow.getNano();
        System.out.println("nano = " + nano);

        DateTimeFormatter shortTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        DateTimeFormatter mediumTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        DateTimeFormatter longTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG); // not supported
        DateTimeFormatter fullTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL); // not supported

        String shortFormat = timeNow.format(shortTimeFormatter);
        System.out.println(shortFormat);

        String mediumFormat = timeNow.format(mediumTimeFormatter);
        System.out.println("mediumFormat = " + mediumFormat);

        // FormatStyle.Long and FormatStyle.Full are not supported by LocalTime class

        DateTimeFormatter americanTimeFormat = DateTimeFormatter.ofPattern("hh:mm:ss");
        String format = timeNow.format(americanTimeFormat);
        System.out.println("format = " + format);

        DateTimeFormatter europeTimeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        String format2 = timeNow.format(europeTimeFormat);
        System.out.println("format = " + format2);

    }
}
