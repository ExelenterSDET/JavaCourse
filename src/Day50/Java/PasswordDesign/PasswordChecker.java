package Day50.Java.PasswordDesign;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);



        boolean isPasswordWeak = true;
        System.out.print("Create a password => ");
        String input = scan.nextLine();
        boolean isPasswordStrong = isPasswordStrong(input);

        System.out.println("Your password is Strong = " + isPasswordStrong);
    }

    public static boolean isPasswordStrong(String password){
        try {
            mustBeNotNull(password);
            hasMinimumOneCapitalLetters(password);
            hasMinimumOneLowerCaseLetters(password);
            hasMinimumOneSymbol(password);
            hasMinimumSixCharacters(password);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Your password is not strong");
            return false;
        }
        return true;
    }

    public static boolean mustBeNotNull(String password) throws Exception {
        if(password == null){
            throw new Exception("Password is null!");
        }
        return true;
    }

    public static boolean hasMinimumOneCapitalLetters(String password) throws Exception {
        if(password.replaceAll("[^A-Z]", "").length()<1){
            throw new Exception("Password has less then 1 capital letters");
        }
        return true;
    }

    public static boolean hasMinimumOneLowerCaseLetters(String password) throws Exception {
        if(password.replaceAll("[^a-z]", "").length()<1){
            throw new Exception("Password has less then 1 lower case letters");
        }
        return true;
    }

    public static boolean hasMinimumOneSymbol(String password) throws Exception {
        if(password.replaceAll("[A-z0-9]", "").length()<1){
            throw new Exception("Password has no special characters");
        }
        return true;
    }

    public static boolean hasMinimumSixCharacters(String password) throws Exception {
        if(password.length()<6){
            throw new Exception("Password has less then 6 characters");
        }
        return true;
    }

}
