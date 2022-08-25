package Day12.Practice;

import java.util.Scanner;

public class Andrea {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your letter grade: ");
        String grade = scan.nextLine().toUpperCase();
        String result = "";

        switch (grade) {
            case "A":
                result = "Excellent!!!";
                break;
            case "B":
                result = "Well done";
                break;
            case "C":
                result = "Good";
                break;
            case "D":
                result = "Need improvement";
                break;
            case "F":
                result = "Fail";
            default:
                result = "Wrong input";
                break;

        }
        System.out.println("result = " + result);


        System.out.print("Enter a day: ");
        String day = scan.nextLine().toLowerCase();
        String result2 = "";

        switch (day) {
            case "monday":
                result2 = "1";
                break;
            case "tuesday":
                result2 = "2";
                break;
            case "wednesday":
                result2 = "3";
                break;
            case "thursday":
                result2 = "4";
                break;
            case "friday":
                result2 = "5";
                break;
            case "saturday":
                result2 = "6";
                break;
            case "sunday":
                result2 = "7";
                break;
            default:
                result2 = "Wrong input";
                break;
        }
        System.out.println("result = " + result2);

        System.out.print("Enter a special character #, $, %, or & : ");
        char ch = scan.next().charAt(0);
        String result3 = "";

        switch (ch) {
            case 35:
                result3 = "HASHTAG";
                break;
            case 36:
                result3 = "DOLLAR";
                break;
            case 37:
                result3 = "PERCENT";
                break;
            case 38:
                result3 = "AND";
                break;
            default:
                result3 = "WRONG INPUT";
                break;
        }
        System.out.println("result = " + result3);

    }
}
