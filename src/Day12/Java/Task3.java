package Day12.Java;

import java.util.Scanner;

public class Task3 {

    /*
  Write a Java program to input week day and print day number.

  "Monday" = > 1
  "Tuesday" => 2
   */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a day");
        String day = scan.nextLine();
        day = day.substring(0,1).toUpperCase().concat(day.substring(1).toLowerCase());

        int result = 0;
        switch(day){
            case "Monday":
                result = 1;
                break;
            case "Tuesday":
                result = 2;
                break;
            case "Wednesday":
                result = 3;
                break;
            case "Thursday":
                result = 4;
                break;
            case "Friday":
                result = 5;
                break;
            case "Saturday":
                result = 6;
                break;
            case "Sunday":
                result = 7;
                break;
        }

        if(result == 0){
            System.out.println("Wrong input");
        }else{
            System.out.println("Day number is " + result);
        }



    }
}
