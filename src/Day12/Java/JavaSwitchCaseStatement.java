package Day12.Java;

import java.util.Scanner;

public class JavaSwitchCaseStatement {
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
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number => ");
        int number = scan.nextInt();
        String result = "";
        // break
        switch(number){
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "This is not a valid day.";
                break;
        }

        System.out.println(result);



    }
}
