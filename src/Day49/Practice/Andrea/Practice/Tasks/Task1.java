package Day49.Practice.Andrea.Practice.Tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task1 {

    @Test
    public void testDate() {
        LocalDateTime now = LocalDateTime.of(2022, 5, 14, 14, 5, 10);
        LocalDateTime actual = now.plusMonths(5).plusYears(10);
        LocalDateTime expected = LocalDateTime.of(2032, 10, 14, 14, 5, 10);
        Assert.assertEquals(actual, expected);
   }

   @Test
   public void testAge(){
        LocalDate bday = LocalDate.of(1979, 6, 10);
        LocalDate now = LocalDate.now();
        Period age = (Period.between(bday, now));
        Assert.assertEquals(age.getYears(), 43);
    }

//    @Test
//    public void testTime(){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a time in hh:mm:ss => ");
//        String time = scan.nextLine();
//        LocalTime userTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm:ss"));
//
//
//        LocalTime now = LocalTime.now();
//        boolean isPast = userTime.isBefore(now);
//
//        Assert.assertEquals(isPast, true);
//
//    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a time in hh:mm:ss => ");
        String time = scan.nextLine();
        LocalTime userTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm:ss"));
        LocalTime now = LocalTime.now();

        LocalTime now2 = LocalTime.now();
        boolean isPast = userTime.isBefore(now2);
        System.out.println("isPast = " + isPast);
    }

    }

//    public static void main(String[] args) {
////now = now.plusYears(10).plusMonths(5);
//        //System.out.println("now = " + now);
//
//        LocalDateTime dateTime = LocalDateTime.now();
//        LocalDateTime newDateTime = dateTime.plusYears(10);
//        System.out.println("newDateTime = " + newDateTime);
//        newDateTime = dateTime.plusMonths(5);
//        System.out.println("newDateTime = " + newDateTime);
//    }


