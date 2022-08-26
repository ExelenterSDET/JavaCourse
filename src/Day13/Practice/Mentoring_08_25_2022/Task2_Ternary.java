package Day13.Practice.Mentoring_08_25_2022;

import java.util.Scanner;

public class Task2_Ternary {

    public static void main(String[] args) {

        /*Task4
         * Write a Java program that reads an integer and check whether it is negative, zero, or positive.
         * */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter any integer: ");

        int number = scan.nextInt();
        String message = "";

//        if (number > 0) {
//            message = "Number is positive";
//        }
//        else if (number < 0) {
//            message = "Number is negative";
//        }
//        else {
//            message = "Number is zero";
//        }


        message = number > 0 ? "Number is positive"
                : number < 0 ? "Number is negative"
                : "Number is zero";

        System.out.println("message = " + message);
    }
}
