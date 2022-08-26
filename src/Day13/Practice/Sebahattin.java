package Day13.Practice;

import java.util.Scanner;

public class Sebahattin {
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
        System.out.println("Create a password ");
        String str = scan.nextLine();
        int strLength=str.length();
        String strCapital=str.replaceAll("[^A-Z]","");
        int strLengthCapital=strCapital.length();
        String strLower=str.replaceAll("[^a-z]","");
        int strLengthLower=strLower.length();
        String strSpecial=str.replaceAll("[A-Za-z0-9]","");
        int strLengthSpecial=strSpecial.length();

        String output = "";

        output = (strLength >= 8 && strLengthCapital >= 1 && strLengthLower >= 1 && strLengthSpecial >= 1) ? "Strong password"
                : "Invalid password";
        System.out.println(output);
    }
}
