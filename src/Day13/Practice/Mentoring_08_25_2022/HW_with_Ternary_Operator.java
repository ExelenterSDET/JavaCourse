package Day13.Practice.Mentoring_08_25_2022;

import java.util.Scanner;

public class HW_with_Ternary_Operator {

    public static void main(String[] args) {

        /* Task password checker
        Create a password.
        1. password should be minimum 8 character
        2. password should have minimum 1 Capital letter.
        3. password should have minimum 1 lower case letter.
        4. password should have minimum 1 special character.

        if password meets requirement, return "Strong password"
        else return "Invalid password"
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Create a password ");
        String input = scan.nextLine();

        int capitalLettersCount = input.replaceAll("[^A-Z]", "").length();
        int lowerLettersCount = input.replaceAll("[^a-z]", "").length();
        int symbolsCount = input.replaceAll("[A-z0-9]", "").length();

        boolean isCapitalLetters= capitalLettersCount >=1;
        boolean islowerLetters= lowerLettersCount >=1;
        boolean isSymbol= symbolsCount >=1;
        boolean pswdLength = input.length() >=8;

//condition ? true : false
//        String message = pswdLength ? "Strong password": "Invalid password"
//                isCapitalLetters ? islowerLetters ? isSymbol  ?
//                        "Strong password" : "Invalid password" :"" : "":"";


        String message = input.length() >=8 &&
                capitalLettersCount >=1 &&
                lowerLettersCount >=1 &&
                symbolsCount >= 1 ? "Strong password" : "Invalid password";


        System.out.println("message = " + message);
    }
}
