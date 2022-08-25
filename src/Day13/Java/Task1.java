package Day13.Java;

import java.util.Scanner;

public class Task1 {
    /*
    Task 1
    Using scanner get int between 0 - 24
    if time is between 7 - 20 print Good Day, else print Good night
     */

    /*
    Task 2
    Using scanner get int between 0 - 24
    if time is between 7 - 20 print Good Day,
    if time is between 7 - 12 print Good Morning,
    else print Good night
     */

    /*
    Task 3
    Using scanner get int between 0 - 24
    if time is between 7 - 20 print Good Day,
    if time is between 7 - 12 print Good Morning,
    if time is between 20 - 22 print Good Evening,
    else print Good night
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number between 0 - 24 ");
        int time = scan.nextInt();

        String output = "";

        output = (7 <= time && time <= 20)
                ? (time <= 12) ? "Good morning" : "Good Day"
                : (20 < time && time <= 22) ? "Good Evening" : "Good Night";

        System.out.println(output);



    }
}
