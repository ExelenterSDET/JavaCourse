package Day10.Practice.Dilnoza;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
         Given an int  ,
            if the int is 1 print Monday
            if the int is 2 print Tuesday
            if the int is 3 print Wednesday
            if the int is 4 print Thursday
            if the int is 5 print Friday
            if the int is 6 print Saturday
            if the int is 7 print Sunday
            if the number is bigger than or equal to 8 or less than 1 then print "This is not a valid day."
         */

        System.out.print("Provide the number to determine the day of the week:==> ");
        Scanner scanner = new Scanner(System.in);
        int dayOfTheWeek = scanner.nextInt();
        if (dayOfTheWeek == 1) {
            System.out.println("Monday");
        }
        if (dayOfTheWeek == 2) {
            System.out.println("Tuesday");
        }
        if (dayOfTheWeek == 3) {
            System.out.println("Wednesday");
        }
        if (dayOfTheWeek == 4) {
            System.out.println("Thursday");
        }
        if (dayOfTheWeek == 5) {
            System.out.println("Friday");
        }
        if (dayOfTheWeek == 6) {
            System.out.println("Saturday");
        }
        if (dayOfTheWeek == 7) {
            System.out.println("Sunday");
        }
        if (dayOfTheWeek >= 8 || dayOfTheWeek < 1) {
            System.out.println("This is not a valid day.");
        }



    }
}
