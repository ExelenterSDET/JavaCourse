package Day15.Practice.GroupProjectWeek3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Task2:
        Create a random password generator.
        1. Password should be minimum 16 characters
        2. Password should have 4 Capital letter.
        3. Password should have 4 lower case letter.
        4. Password should have 4 numbers.
        5. Password should have 4 special character.

        Example: Qe4$Os5!De1$Oe3&
 /
         */
        Scanner scan2 = new Scanner(System.in);

        System.out.print("Create a password => ");
        String input = scan2.nextLine();

        int capitalLettersCount = input.replaceAll("[^A-Z]", "").length();
        System.out.println("capitalLettersCount = " + capitalLettersCount);
        int lowerLettersCount = input.replaceAll("[^a-z]", "").length();
        System.out.println("lowerLettersCount = " + lowerLettersCount);
        int symbolsCount = input.replaceAll("[A-z0-9]", "").length();
        System.out.println("symbolsCount = " + symbolsCount);

        boolean isCapitalLetters= capitalLettersCount >=4;
        System.out.println("isCapitalLetters = " + isCapitalLetters);
        boolean islowerLetters= lowerLettersCount >=4;
        System.out.println("islowerLetters = " + islowerLetters);
        boolean isSymbol= symbolsCount >=4;
        System.out.println("isSymbol = " + isSymbol);
        boolean pswdLength = input.length() >=16;
        System.out.println("pswdLength = " + pswdLength);


        String message = input.length() >=16 &&
                capitalLettersCount >=4 &&
                lowerLettersCount >=4 &&
                symbolsCount >= 4 ? "Strong password" : "Invalid password";


        System.out.println("message = " + message);
    }
}
