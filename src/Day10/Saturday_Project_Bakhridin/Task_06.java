package Day10.Saturday_Project_Bakhridin;

import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        /**Task6
         * Given a String (grade)
         *     if grade is "A" then ask for the average and
         *         if the average is greater than 90 print "Congrats"
         *         else print "Invalid average"
         *     if grade is "B" print "You're good"
         *     else (meaning if not "A" or "B") print "You need to work hard"
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your grade=> ");
        String grade = scan.nextLine();
        System.out.print("Please enter your average=> ");
        int average = scan.nextInt();

        if ((grade.equalsIgnoreCase("A") && average<=90)) {
            System.out.println("Congrats");                             //why this line code is executed even average is not 90
        }
        if (grade.equalsIgnoreCase("A") && average!=90) {
            System.out.println("Invalid");
        }
        if (grade.equalsIgnoreCase("B")) {
            System.out.println("You are good");
        }
        if (!grade.equalsIgnoreCase("A") && !grade.equalsIgnoreCase("B")) {
            System.out.println("You need to work hard");
        }





    }

}
