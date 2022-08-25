package Day13.Practice;

import java.util.Scanner;

public class Bakhridin_HomeWork {
    public static void main(String[] args) {



        // CONDITION ? OUTPUT IF TRUE : OUTPUT IF FALSE

         /* Task password checker
        Create a password.
        1. password should be minimum 8 character
        2. password should have minimum 1 Capital letter.
        3. password should have minimum 1 lower case letter.
        4. password should have minimum 1 special character.

        if password meets requirement, return "Strong password"
        else return "Invalid password"
         */

//        String passWord= "AuroraCity$";
//        String result = null;
//
//        if (passWord.length()>8 && passWord.contains("A")&&passWord.contains("o")&&passWord.contains("$")) {
//            result="Strong password";
//        }else{
//            result="Invalid password";
//        }
//        System.out.println("result = " + result);

//        result=(passWord.length()>8 && passWord.contains("A")&&passWord.contains("o")&&passWord.contains("$"))
//                ? "Strong password":"Invalid password";
//
//        System.out.println("result = " + result);

        Scanner scan = new Scanner(System.in);

        System.out.println("Create a password => ");
        String input = scan.nextLine();

        int capitalLetters=input.replaceAll("[^A-Z]","").length();
        int lowerLetters=input.replaceAll("[^a-z]","").length();
        int symbolCount=input.replaceAll("[A-z0-9]","").length();

        String message= input.length()>=8
                && capitalLetters>=1
                && lowerLetters>=1
                && symbolCount>=1 ? "Strong password" : "Invalid password";
        System.out.println("message = " + message);
    }


}
