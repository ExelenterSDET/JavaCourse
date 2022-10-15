package Day49.Java;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeTasks {

    @Test
    public void testDate1(){
        LocalDateTime now = LocalDateTime.of(2022, 10, 14, 14, 05, 10 );
        LocalDateTime actual = now.plusMonths(5).plusYears(10);

        LocalDateTime expected = LocalDateTime.of(2033, 03, 14, 14, 05, 10 );
        Assert.assertEquals(actual, expected, "Dates are not equal");

        boolean isEqual = actual.equals(expected);
        Assert.assertTrue(isEqual, "Dates are not equal");
    }

    @Test
    public void testAge(){
        LocalDate today = LocalDate.now();
        LocalDate myBirthDay = LocalDate.of(1980, 11, 13);
        Period between = Period.between(myBirthDay, today);
        Assert.assertEquals(between.getYears(), 41);
    }

    @Test
    public void testTime(){
        String userTimeString = "14:04:10";
        LocalTime userTime = LocalTime.parse(userTimeString, DateTimeFormatter.ofPattern("HH:mm:ss"));
        LocalTime now = LocalTime.now();
        System.out.println("now = " + now);
        System.out.println("userTime = " + userTime);
        Assert.assertTrue(userTime.isBefore(now));
    }

    public static String getTime(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a time, formatted as HH:mm:ss");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String userTimeString = getTime();
        LocalTime userTime = LocalTime.parse(userTimeString, DateTimeFormatter.ofPattern("HH:mm:ss"));
        LocalTime now = LocalTime.now();
        System.out.println("now = " + now);
        System.out.println("userTime = " + userTime);

        boolean isBefore = userTime.isBefore(now);
        System.out.println("isBefore = " + isBefore);
    }
}
