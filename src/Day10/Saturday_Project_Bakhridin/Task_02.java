package Day10.Saturday_Project_Bakhridin;

import java.util.Scanner;

public class Task_02 {

    public static void main(String[] args) {


        /**Task2
         * Given an int number. Check if the number is even or not
         *         if the number is even print true
         *         if the number is odd print false
         *         result should be true or false.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter integer number==> ");
        int number = scan.nextInt();

        if (number%2==0) {
            System.out.println("given number is true");
        }
        if (number%2!=0) {
            System.out.println("given number is false");
        }




    }

}
