package Day49.Practice.Andrea.Practice;

import java.time.LocalDate;

public class ComparingDateAndTime {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        LocalDate past = now.minusDays(5);
        System.out.println("now = " + now);
        System.out.println("past = " + past);

        boolean after = now.isAfter(past);
        System.out.println(after);

    }
}
