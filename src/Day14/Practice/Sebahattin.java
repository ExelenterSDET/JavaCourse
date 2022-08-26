package Day14.Practice;

import java.util.Random;
import java.util.Scanner;

public class Sebahattin {
    public static void main(String[] args) {
/*// Let user provide a number between 0 and 3 not included
    // and generate a random number between 0 and 3 not included
    // and check if provided number is equal to generated number
    // if they are equal print out "You Won the Game!!!"
    // else "Game Over!!!"

 */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 3 ==> ");
        int num = input.nextInt();

        if (num>0 && num<3) {

            Random random = new Random();
            int i = (random.nextInt(3 - 1)) + 1;
            System.out.println("i = " + i);

            if (i == num) {
                System.out.println("You Won the Game!!!");
            } else {
                System.out.println("Game Over!!!");
            }
        }
        else {
            System.out.println("Error !!! Please enter a number between 0 and 3");
            System.out.println("---------------------------------------------");
        }
        /*        Mentoring HomeWork:
         * Write a Java program that takes a single character from the alphabet.
         * Print Vowel or Consonant, depending on the user input. If the user input is not a letter
         * (between a and z or A and Z), or is a string of length > 1, print an error message.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a letter from the alphabet ==> ");
        String str = scan.nextLine();
        int strLength = str.length();

        str = str.toLowerCase();
        char ch = str.charAt(0);

        String output = "";

        if (strLength > 1){
            output = "Error: Not a valid entry. Please enter single letter!";
        } else if (((ch < 65 || ch > 90) && (ch < 97 || ch > 122))) {
            output = "Error: Not an upper case or lower case letter!";
        } else if ((str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u"))) {
            output = "Vowels";
        }
        else {
            output = "Consonant";
        }
        System.out.println(output);
    }
}