package Day13.Practice;

import java.util.Scanner;

public class Furkat {
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

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your password => ");
        String str = scan.nextLine();


        boolean passIsShort = str.length() < 8;
        boolean hasNoCapital = str.replaceAll("[A-Z]","").length() == str.length();
        boolean hasNoLowerCase = str.replaceAll("[a-z]", "").length() == str.length();
        boolean hasNoSpecialChar = str.replaceAll("[^\\w]", "").length() == str.length();


        String output = passIsShort ? "Your pass is too short"
                : hasNoCapital ? "Pass has no capital"
                : hasNoLowerCase ? "Pass has no lower case"
                : hasNoSpecialChar? "Has no special char"
                : "Strong password";

        System.out.println("Solution 1 = " + output);

        output = passIsShort || hasNoCapital || hasNoLowerCase || hasNoSpecialChar ? "Invalid Password" : "Strong password";

        System.out.println("Solution 2 = " + output);



    }
}
