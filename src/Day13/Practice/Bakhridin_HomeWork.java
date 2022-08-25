package Day13.Practice;

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

        String passWord= "AuroraCity$";
        String result = null;
//
//        if (passWord.length()>8 && passWord.contains("A")&&passWord.contains("o")&&passWord.contains("$")) {
//            result="Strong password";
//        }else{
//            result="Invalid password";
//        }
//        System.out.println("result = " + result);

        result=(passWord.length()>8 && passWord.contains("A")&&passWord.contains("o")&&passWord.contains("$"))
                ? "Strong password":"Invalid password";

        System.out.println("result = " + result);


    }

}
