package Day13.java;

import java.util.Scanner;

public class TaskPasswordChecker {
    public static void main(String[] args) {
        /* Task password checker
        Create a password
        1. password should be minimum 8 character
        2. password should be minimum 1 Capital letter
        3. password should be minimum 1 lower case letter
        4. password should be minimum 1 special character

        if password meets requirement return 'Strong password' else return "Invalid password"
         */

        System.out.println("Please enter your password");
        Scanner scan = new Scanner(System.in);
        String pass = scan.nextLine();
        if (pass.length() >= 7) {
            if (!pass.toLowerCase().equals(pass)) {
                if (!pass.toUpperCase().equals(pass)) {
                    if (pass.contains("*") || pass.contains("+") || pass.contains("-") || pass.contains(":") || pass.contains("$") || pass.contains("#")){
                        System.out.println("you are log in");
                    }
                    else {
                        System.out.println("min 1 special character (* + - : $ #)");
                    }
                }
                else {
                    System.out.println("min 1 lower case letter");
                }
            } else {
                System.out.println("min 1 Capital letter");
            }
        } else {
            System.out.println("min 8 number");


        }
    }
}