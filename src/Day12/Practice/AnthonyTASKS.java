package Day12.Practice;

import java.util.Scanner;

public class AnthonyTASKS {

    public static void main(String[] args) {

        //using scanner, create character .
        // using switch statement, print months of a year.
        //Example:
        //1.January
        //2.February
        //....etc
        // if character is not within 1-12, return wrong input

        Scanner scan = new Scanner(System.in);

        System.out.println("Type Character");
        byte b1 = (byte)scan.nextByte();
        String month = "";

        b1 +=48;
        char ch = (char)b1;

        switch(ch){
            case '1':
                month = "January";
                break;
            case '2':
                month = "February";
                break;
            case '3':
                month = "March";
                break;
            case '4':
                month = "April";
                break;
            case '5':
                month = "May";
                break;
            case '6':
                month = "June";
                break;
            case '7':
                month = "July";
                break;
            case '8':
                month = "August";
                break;
            case '9':
                month = "September";
                break;
            //case "10":
            // month = "October";
            // break;
            //case '11':
            // month = "November";
            // break;
            //case '12':
            // month = "December";
            // break;
            //case '13':
            // month = "Invalid Month";
            // break;
            default:
                month = "Wrong Input";
        }
        System.out.println(month);
        System.out.println("---------------------------------------------------------------------");

        Scanner scan2 = new Scanner(System.in);
        System.out.println("ENTER STRING LETTER(S) => ");
        String s = scan2.nextLine();
        String grade = "";

        switch (s){
            case "A":
                grade = "Excellent!!!";
                break;
            case "B":
                grade = "Well done";
                break;
            case "C":
                grade = "Good";
                break;
            case "D":
                grade = " Need improvement";
                break;
            case "F":
                grade = "Fail";
                break;
            default: grade = "Wrong input";
                break;
        }
        System.out.println("TASK 2 = "+grade);
        System.out.println("---------------------------------------------------------------------");

           /*
        Write a java program to input week day and print day number

        "Monday" = > 1
        "Tuesday" = 2
         */
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Type Character");
        String s1 = scan3.nextLine();
        String dayNumber = "";


        switch (s1) {
            case "Monday":
                dayNumber = "1";
                break;
            case "Tuesday":
                dayNumber = "2";
                break;
            case "Wednesday":
                dayNumber = "3";
                break;
            case "Thursday":
                dayNumber = "4";
                break;
            case "Friday":
                dayNumber = "5";
                break;
            case "Saturday":
                dayNumber = "6";
                break;
            case "Sunday":
                dayNumber = "7";
                break;

            default:dayNumber = "Invalid number = 0";
                break;
        }
        System.out.println("TASK 3 = " + dayNumber);

    }
}
