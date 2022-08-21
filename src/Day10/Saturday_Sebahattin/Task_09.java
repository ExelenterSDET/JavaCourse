package Day10.Saturday_Sebahattin;

import java.util.Scanner;

public class Task_09 {
    public static void main(String[] args) {

/*      Task 9
        Given a String and a number. Get the character at the given index
        with the String. If number is greater then the length of the String,
        return 0
 */
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Task 9 / Given a String and a number.");
        System.out.print("Enter string = ");
        String indx = input.nextLine();
        System.out.print("Enter number = ");
        int numA = scan.nextInt();
        int inLength = indx.length();

        if (numA < inLength){
            char nexChar = indx.charAt(numA);
            System.out.println("Number is less than string length. Character = "+ nexChar);
        }
        if (numA >= inLength){
            System.out.println("Number is greater than length of string.");
        }
    }
}
