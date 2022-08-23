package Day10.Saturday_Sebahattin;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

/*      Task 10
        Given a String.
        If a given string contains only digits, return true. Else, return false
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Task 10 / Is there a digit");
        System.out.print("Enter string = ");
        String contain = input.nextLine();
        String digit = contain.replaceAll("[^\\d]","");

        if (contain.length() == digit.length()){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
