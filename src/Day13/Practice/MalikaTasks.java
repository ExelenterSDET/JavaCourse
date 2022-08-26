package Day13.Practice;

import java.util.Scanner;

public class MalikaTasks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         /* Task 1
    Using scanner get int between 0 - 24
    if time is between 7 - 20 print Good Day, else print Good night */

    /* Task 2
    Using scanner get int between 0 - 24
    if time is between 7 - 20 print Good Day,
    if time is between 7 - 12 print Good Morning,
    else print Good night */

    /* Task 3
    Using scanner get int between 0 - 24
    if time is between 7 - 20 print Good Day,
    if time is between 7 - 12 print Good Morning,
    if time is between 20 - 22 print Good Evening,
    else print Good night */

        System.out.print("Enter time: ");
        int time = scan.nextInt();
        scan.nextLine();
        System.out.println((time>7 && time<12) ? "Good Morning" : (time>=7 && time<20) ? "Good day" :
                (time>=20 && time<=22) ? "Good evening" : "Good night");

        //Task2 Password checker
        /*Create a password
        1. password should be minimum 8 character
        2. password should have minimum 1 Capital letter.
        3. password should have minimum 1 lower case letter.
        4. password should have minimum 1 special character.

        if password meets requirement, return "Strong password"
        else return "Invalid password"*/
        System.out.println(" ");

        System.out.print("Enter password: ");
        String password = scan.nextLine();
        String output = "";

        output=(password.length()>=8 && (password.replaceAll("[^A-Z]", "").length()>0)
                && (password.replaceAll("[^a-z]", "").length()>0)
                && (password.replaceAll("[^\\w]", "").length()>0)) ? "Strong Password" : "Invalid Password";
        System.out.println("output = " + output);
    }
}
