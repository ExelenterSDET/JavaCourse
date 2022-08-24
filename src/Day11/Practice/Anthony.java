package Day11.Practice;

import java.util.Scanner;

public class Anthony {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter String Here =");
        String s = scan.nextLine();
        s = s.toLowerCase();

        if(s.startsWith("java")){
            System.out.println("TASK 1 = I love Java");
        }
        else {
            System.out.println("TASK 1 = Wrong Input");
        }
        System.out.println("----------------------------------------------------------------------------");
        Scanner scan4 = new Scanner(System.in);
        System.out.print("Enter a number => ");
        int int1 = scan4.nextInt();

        if (int1%5==0 && int1%3!=0){
            System.out.println("TASK 2 = fizz ");
        }
        else if (int1%3==0 && int1%5!=0) {
            System.out.println("TASK 2 = buzz " );
        }
        else if (int1 % 5 == 0) {
            System.out.println("TASK 2 = fizzbuzz");
        }
        else {
            System.out.println("TASK 2 = same number = "+int1);
        }
        System.out.println("----------------------------------------------------------------------------");
        Scanner scan2 = new Scanner(System.in);

        System.out.print("Enter your Grade = ");
        String grade = scan2.nextLine();

        String output = "";

        if (grade.equalsIgnoreCase("A")) {
            System.out.println("enter your average => ");
            int avg = scan2.nextInt();
            if (avg > 90) {
                output = "TASK 3 = Congrats";
            } else {
                output = "TASK 3 =Invalid Average";
            }
        } else if (grade.equalsIgnoreCase("B")) {
            System.out.println("TASK 3 =You're good");
        } else {
            System.out.println("TASK 3 =You need to work hard");
        }
        System.out.println(output);

    }
}
