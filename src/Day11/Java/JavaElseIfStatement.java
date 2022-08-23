package Day11.Java;

import java.util.Scanner;

public class JavaElseIfStatement {
        /*
            The if-else-if ladder statement
            executes one condition from
            multiple statements.
         */

    public static void main(String[] args) {

        /*
         Given an int  ,
            if the int is 1 print Monday
            if the int is 2 print Tuesday
            if the int is 3 print Wednesday
            if the int is 4 print Thursday
            if the int is 5 print Friday
            if the int is 6 print Saturday
            if the int is 7 print Sunday
            if the number is bigger than or equal to 8 or less than 1 then print "This is not a valid day."
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number => ");
        int number = scan.nextInt();

        String day = "";
        if(number == 1){
            day = "Monday";
        }else if(number ==2){
            day = "Tuesday";
        }else if(number == 3){
            day = "Wednesday";
        }else if(number == 4){
            day = "Thursday";
        }else if(number == 5){
            day = "Friday";
        }else if (number == 6){
            day = "Saturday";
        }else if (number == 7){
            day = "Sunday";
        }else {
            day = "This is not a valid day.";
        }
        System.out.println(day);

    }
}
