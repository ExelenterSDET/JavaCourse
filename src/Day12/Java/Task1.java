package Day12.Java;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        /*
        using scanner, create a number and convert character.
        using switch statement, print months of a year.
        Example:
        1 - January
        2 - February
        etc...
        if character is not within 1-12, return wrong input

         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number from 1 to 9 => ");

        byte bt = scan.nextByte();
//        bt += 48;
        char ch = (char)bt;

        String output = "";

        switch(ch){
            case 1:
                output = "January";
                break;
            case 2:
                output = "February";
                break;
            case 3:
                output = "March";
                break;
            case 4:
                output = "April";
                break;
            case 5:
                output = "May";
                break;
            case 6:
                output = "June";
                break;
            case 7:
                output = "July";
                break;
            case 8:
                output = "August";
                break;
            case 9:
                output = "September";
                break;
            case 10:
                output = "October";
                break;
            case 11:
                output = "November";
                break;
            case 12:
                output = "December";
                break;
            default:
                output = "Wrong input";

        }
        System.out.println(output);



    }
}
