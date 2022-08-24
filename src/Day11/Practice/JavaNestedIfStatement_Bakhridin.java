package Day11.Practice;

import java.util.Scanner;

public class JavaNestedIfStatement_Bakhridin {
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
        System.out.print("Enter your Grade:=>");
        String grade = scan.nextLine();
//        System.out.print("Enter your average:=>");
//        int average = scan.nextInt();

        String yourResult = "";

        if (grade.equalsIgnoreCase("A")) {
            System.out.print("Enter your average:=>");
            int average = scan.nextInt();
            if (average >= 95 && average <= 100) {
                yourResult = "Congrats";
            } else if (average > 90 && average < 95) {
                yourResult = "Good Job";
            } else {
                yourResult = "You should be in Grade B, please check there";
            }
        } else if (grade.equalsIgnoreCase("b")) {
            System.out.print("Enter your average:=>");
            int average = scan.nextInt();
            if (average >= 85 && average <= 90) {
                yourResult = "You are doing good";
            } else if (average >= 80 && average < 85) {
                yourResult = "Not too bad";

            } else {
                yourResult = "You need to work hard";
            }


        } else {
            System.out.println("Unknown Grade");
        }
        System.out.println("Your result is = " + yourResult);

    }
}
