package Day13.Practice.Mentoring_08_25_2022;

import java.util.Scanner;

public class Task1_Ternary {

    public static void main(String[] args) {
        /*Task5
         * Write a program that accepts three numbers from the user and prints
         * "increasing" if the numbers are in increasing order,
         * "decreasing" if the numbers are in decreasing order,
         * and "Neither increasing or decreasing order" otherwise.
         * */

        Scanner scan = new Scanner(System.in);
        String message = "";

        System.out.print("Input the 1st number: ");
        int num1 = scan.nextInt();

        System.out.print("Input the 1st number: ");
        int num2 = scan.nextInt();

        System.out.print("Input the 1st number: ");
        int num3 = scan.nextInt();

        message = num1 > num2 && num2 > num3 ? "Decreasing Order"  //15 10 1
                : num1 < num2 && num2 < num3 ?   "Increasing Order" // 5 10 15
                : "Neither increasing or decreasing order";

        System.out.println("message = " + message);
    }
}
