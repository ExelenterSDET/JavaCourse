package Day13.Practice;

import java.util.Scanner;

public class Mustafa {
    public static void main(String[] args) {
        /* Task 3
        Using scanner get int between 0 - 24
        if time is between 7 - 20 print Good Day,
        if time is between 7 - 12 print Good Morning,
        if time is between 20 - 22 print Good Evening,
    else print Good night
                */
        Scanner scan = new Scanner(System.in);
       /* System.out.println("Time? ");
        int time1 = scan.nextInt();

        System.out.println(
                (time1>0 && time1<=24)
                ?time1>7&&time1<=20?"Good day"
                : time1<=12?"Good morning"
                :time1>20 && time1>=22?"Good Evening":"Good night":"Invalid time");*/

        /* Task password checker
        Create a password.
        1. password should be minimum 8 character
        2. password should have minimum 1 Capital letter.
        3. password should have minimum 1 lower case letter.
        4. password should have minimum 1 special character.

        if password meets requirement, return "Strong password"
        else return "Invalid password"
         */

        System.out.print("Enter Password");
        String pass = scan.nextLine();

        String output = "";
        output = (pass.length() > 7)
                ?pass.replaceAll("[^A-Z]"," ").length()>0
                ?pass.replaceAll("[^a-z]","").length()>0
                ?pass.replaceAll("[^A-z,0-9]","").length()>0
                ?"Strong Password":"Enter with a special character"
                :"Enter with a lowercase letter":"Enter with a uppercase letter":"Minimum 8 characters";

        System.out.println(output);
    }
}
