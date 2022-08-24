package Day12.Java;

import java.util.Scanner;

public class Task2 {
    /*
    Write a Java program to evaluate exam result of student, using String
    ex:
    "A"-> Excellent!!!
    "B"-> Well done
    "C"-> Good
    "D"-> Need improvement
    "F"-> Fail
    default -> Wrong input
     */

    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);

        System.out.println("Enter your grade => ");
        String grade = scan.nextLine();

        String result = "";
        switch(grade.toUpperCase()){
            case "A":
                result = "Exelent!!!";
                break;
            case "B":
                result = "Well Done";
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



    }
}
