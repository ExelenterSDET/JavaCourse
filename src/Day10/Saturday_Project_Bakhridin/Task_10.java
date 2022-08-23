package Day10.Saturday_Project_Bakhridin;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {
        /**Task10
         * Given a String. If a given string contains only digits, return true. Else, return false
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string==> ");
        String s = scan.nextLine();


        if (s.contains("0123456789")) {
            System.out.println("True");
        }
        if (!s.contains("0123456789")) {
            System.out.println("False");
        }



    }
}
