package Day13.Practice;

import java.util.Scanner;

public class MalikaHW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Task2 Password checker
        /* Create a password
        1. password should be minimum 8 character
        2. password should have minimum 1 Capital letter.
        3. password should have minimum 1 lower case letter.
        4. password should have minimum 1 special character.

        if password meets requirement, return "Strong password"
        else return "Invalid password"*/

        System.out.print("Enter password: ");
        String password = scan.nextLine();
        String output = "";

        output=(password.length()>=8 && (password.replaceAll("[^A-Z]", "").length()>0)
                && (password.replaceAll("[^a-z]", "").length()>0)
                && (password.replaceAll("[^\\w]", "").length()>0)) ? "Strong Password" : "Invalid Password";
        System.out.println("output = " + output);

    }
}
