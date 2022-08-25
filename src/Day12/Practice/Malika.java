package Day12.Practice;

import java.util.Scanner;

public class Malika {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Task1
        /*
        using scanner, create a number and convert to character.
        using switch statement, print months of a year.
        Example:
        1 - January
        2 - February
        etc...
        if character is not within 1-12, return wrong input*/

        System.out.print("Enter a number from 1 to 12: ");
        byte bt = scan.nextByte();
        scan.nextLine();
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

        //Task2
        /*Write a Java program to evaluate exam result of student, using String
    ex:
    "A"-> Excellent!!!
    "B"-> Well done
    "C"-> Good
    "D"-> Need improvement
    "F"-> Fail
    default -> Wrong input*/
        System.out.println("Enter your grade");
        String grade = scan.nextLine();

        String result = "";
        switch (grade.toUpperCase()){
            case "A":
                result = "Excellent";
                break;
            case "B":
                result = "Well done";
                break;
            case "C":
                result = "Good";
                break;
            case "D":
                result = "Need Improvement";
                break;
            case "F":
                result = "Fail";
                break;
            default:
                result = "Wrong input";

        }
        System.out.println(result);

        //Task3
        System.out.println("Print a day; ");
        String day = scan.nextLine();

        day = day.substring(0,1).toUpperCase().concat(day.substring(1).toLowerCase());

        int result1 = 0;

        switch(day){
            case "Monday":
                result1 = 1;
                break;
            case "Tuesday":
                result1 = 2;
                break;
            case "Wednesday":
                result1 = 3;
                break;
            case "Thursday":
                result1 = 4;
                break;
            case "Friday":
                result1 = 5;
                break;
            case "Saturday":
                result1 = 6;
                break;
            case "Sunday":
                result1 = 7;
                break;
        }
        if (result1 == 0) {
            System.out.println("Wrong input");
        }else{
            System.out.println("Day number is " + result1);
        }

    }
}
