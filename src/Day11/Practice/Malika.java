package Day11.Practice;

import java.util.Scanner;

public class Malika {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Task1 IF/ELSE
        System.out.println("TASK1:");
        System.out.print("Enter text: ");
        String s = scan.nextLine();
        if (s.startsWith("Java")) {
            System.out.println("I love Java");
        } else {
            System.out.println("Wrong input");
        }

        //Task2 ELSE/IF
        /*Given an int number
        -print "fizz" when given number is divisible by 5
                -print "buzz" when given number is divisible by 3
                -print "fizzbuzz" when given number is divisible by both 3 and 5
                -print same number if it is not divisible by 3 or 5
        Examples:
        input1 -> 10 | output1 -> fizz
        input2 -> 9  | output2 -> buzz
        input3 -> 30 | output3 -> fizzbuzz
        input4 -> 7  | output4 -> 7*/

        System.out.println(" ");
        System.out.println("TASK2:");

        System.out.print("Enter any number: ");
        int num = scan.nextInt();
        scan.nextLine();

        String Text = "";

        if (num % 5 == 0 && num % 3 == 0) {
            Text = "fizzbuzz";
        } else if (num % 3 == 0) {
            Text = "buzz";
        } else if (num % 5 == 0) {
            Text = "fizz";
        } else {
            Text = String.valueOf(num);
        }
        System.out.println(Text);

        //Task3
        /*Given a String (grade)
        if grade is "A" then ask for the average and
        if the average is greater than 90 print "Congrats"
        else print "Invalid average"
        if grade is "B" print "You're good"
        else (meaning if not "A" or "B") print "You need to work hard"*/

        System.out.println(" ");
        System.out.println("TASK3:");


        System.out.print("Enter your grade: ");
        String grade = scan.nextLine();

        String output = "";

        if (grade.equalsIgnoreCase("A")) {
            System.out.print("Enter your average: ");
            int avg = scan.nextInt();
            if (avg > 90) {
                output = "Congrats";
            } else {
                output = "invalid Average";
            }
        } else if (grade.equalsIgnoreCase("B")) {
            output = "You are good";
        } else {
            output = "You need to work hard";

        }
        System.out.println(output);
    }

    }

