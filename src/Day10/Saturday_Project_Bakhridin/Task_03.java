package Day10.Saturday_Project_Bakhridin;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        /**
         * Given an int  ,
         *             if the int is 1 print Monday
         *             if the int is 2 print Tuesday
         *             if the int is 3 print Wednesday
         *             if the int is 4 print Thursday
         *             if the int is 5 print Friday
         *             if the int is 6 print Saturday
         *             if the int is 7 print Sunday
         *             if the number is bigger than or equal to 8 or less than 1 then print "This is not a valid day."
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter integer==> ");
        int daY = scan.nextInt();

        if (daY==1 ) {
            System.out.println("Monday");
        }
        if (daY==2) {
            System.out.println("Tuesday");
        }
        if (daY==3) {
            System.out.println("Thursday");
        }
        if (daY==4) {
            System.out.println("Friday");
        }
        if (daY==5) {
            System.out.println("Saturday");
        }
        if (daY==6) {
            System.out.println("Sunday");
        }
        if (daY>=8 || daY<=0) {
            System.out.println("This is not a valid day");
        }



    }

}
