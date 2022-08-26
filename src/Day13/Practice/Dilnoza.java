package Day13.Practice;

import java.util.Scanner;

public class Dilnoza {
    /* Task password checker
         Create a password.
         1. password should be minimum 8 character
         2. password should have minimum 1 Capital letter.
         3. password should have minimum 1 lower case letter.
         4. password should have minimum 1 special character.

         if password meets requirement, return "Strong password"
         else return "Invalid password"
          */
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
            System.out.print("Please provide your password, min 8 characters => ");
            String str = scan.nextLine();

            boolean IsPwShort = str.length()<8;
            boolean hasUpperCase = str.replaceAll("[A-Z]","").length()==str.length();
            boolean hasLowerCase =str.replaceAll("[a-z]","").length()== str.length();
            boolean hasSpecialChar  = str.replaceAll("[\\p{P}\\p{S}]","").length()==str.length();

            String input = "";

            input = IsPwShort? "PW is too short"
                    : hasUpperCase? "PW has no Uppercase Letter"
                    :hasLowerCase? "Pw does not have lower case Letter"
                    :hasSpecialChar? "Has no special character"
                    :"PW is good";

            System.out.println("input = " + input);


        }
}
