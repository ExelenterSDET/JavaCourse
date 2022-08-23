package Day10.Practice.Saturday_Project_2_Tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

                /*Task13
        * Create a string and a number. Convert number to char.
if string contains char, return the character itself.
if string doesn't contain char, return "Character doesn't exist in the string"
        * */

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any text: ");
        String str = scan.nextLine();

        System.out.print("Enter any positive number: ");
        int number = scan.nextInt();

        char numberToChar = (char) number;
        String charToString = String.valueOf(numberToChar);

        if (str.contains(charToString)){
            System.out.println(numberToChar);
        }

        if (!str.contains(String.valueOf(numberToChar))){
            System.out.println("Character doesn't exist in the string");
        }
    }
}
