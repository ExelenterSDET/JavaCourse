package Day49.Java;

import java.time.LocalDate;

public class ComparingDateAndTime {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);
        LocalDate past = now.minusDays(5);
        System.out.println("past = " + past);

        boolean after = now.isAfter(past);
        System.out.println("after = " + after);
        boolean before = now.isBefore(past);
        System.out.println("before = " + before);
        boolean equal = now.isEqual(past);
        System.out.println("equal = " + equal);

        now = now.minusYears(2);
        System.out.println("now = " + now);

        boolean leapYear = now.isLeapYear();
        System.out.println("leapYear = " + leapYear);


    }

}
