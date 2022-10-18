package Day50.JavaExceptions.CheckedException.PasswordDesign;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        boolean passwordisweak = true;
        while (passwordisweak) {
            Scanner scan = new Scanner(System.in);
            try {
                String pass = scan.nextLine();
                mustbeNotNull(pass);
                hasMinOneCapLetters(pass);
                hasMinOneLowerLetters(pass);
            }catch (Exception e)
            {
                passwordisweak = false;
            }
        }
        System.out.println("Your password is strong!");


    }


    public static boolean mustbeNotNull(String password) {
        if (password == null)
        {
            throw new NullPointerException("Password is null.");
        }
        return true;
    }

    public static boolean hasMinOneCapLetters(String password) {
        if (password.replaceAll("[^A-Z]"," ").length()<1){
            throw new IllegalArgumentException("Password has no Capcase letter.");
        }
        return true;
    }
    public static boolean hasMinOneLowerLetters(String password){
        if (password.replaceAll("[^a-z]"," ").length()<1){
            throw new IllegalArgumentException("Password has no Lowercase letter.");
        }
        return true;
    }
}
