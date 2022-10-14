package Day48.Java;

import java.time.Duration;
import java.time.LocalTime;

public class JavaDuration {
    public static void main(String[] args) {

        LocalTime timeNow = LocalTime.now();
        LocalTime localTime = LocalTime.of(20, 20, 20);

        Duration between = Duration.between(localTime, timeNow);
        System.out.println("between = " + between);

        long l = between.toMinutes();
        System.out.println(l);
        Duration duration = Duration.ofHours(10);
        Duration plus = between.plus(duration);
        System.out.println("plus = " + plus);

        LocalTime plus1 = timeNow.plus(duration);
        System.out.println("plus1 = " + plus1);
    }
}
