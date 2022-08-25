package Day13.java;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println();
        /* using scanner get int between 0 - 24
        if time is between 7 - 20 print Good Day, else print Good night
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("using scanner get int between 0 24");
        int num = scan.nextInt();
        String result = 7 < num && num <= 20 ? "Good day" : "Good night";

        System.out.println(result);
    }{
/* */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number between 0 - 24");
        int time = scan.nextInt();

        String output = "";
        output = (7 <= time && time >=20) ? "Good Day" : "Good Night";
        System.out.println(output);
        }

}
