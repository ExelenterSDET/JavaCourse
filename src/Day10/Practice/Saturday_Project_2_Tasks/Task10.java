package Day10.Practice.Saturday_Project_2_Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /*Task10
         * Given a String. If a given string contains only digits, return true. Else, return false
         * */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String str = scan.nextLine();

        String onlyDigits = str.replaceAll("[^\\d]", "");

        if (str.equals(onlyDigits)){
            System.out.println(true);
        }
        if (!str.equals(onlyDigits)){
            System.out.println(false);
        }
    }
}
