package Day10.Saturday_Project_Bakhridin;

import java.util.Scanner;

public class Task_09 {

    public static void main(String[] args) {

        /**Task9
         * Given a String and a number. Get the character at the given index with the String.
         * If number is greater than the length of the String, return 0
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter string==> ");
        String str = scan.nextLine();
        System.out.print("Enter integer==> ");
        int num = scan.nextInt();

        if (num>str.length()) {
            System.out.println("Return: integer is greater than length of string");
        }
        if (num<str.length()) {
            System.out.println("Return: integer is less than length of string");
        }
        if (num==str.length()) {
            System.out.println("Return: integer is equals to length of string");
        }

    }

}
