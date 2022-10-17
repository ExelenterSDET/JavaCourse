package Day46.StudentReg;

import java.time.Duration;
import java.time.LocalTime;

public class JavaDuration {
    public static void main(String[] args) {
        LocalTime timenow = LocalTime.now();
        LocalTime othertime = LocalTime.of(4,5,7);
        Duration between = Duration.between(othertime,timenow);

        long t = between.toMinutes();
        System.out.println(t);


    }
}
