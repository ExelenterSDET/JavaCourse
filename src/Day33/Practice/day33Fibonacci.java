package Day33.Practice;

import java.util.Scanner;

public class day33Fibonacci {
    /*Write a java program to check whether given number belongs to Fibonacci series or not.
         For example, 34 belongs to Fibonacci series where as 51 doesn’t belongs to Fibonacci series.
         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int inputnumber = scan.nextInt();
        fibonacci(inputnumber);

    }

    static void fibonacci(int a) {
        int number1 = 0;
        int number2 = 1;
        int number3 = 0;
        while (number3 < a) {
            number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
        }
        if (number3 == a) {
            System.out.println("this is a Fibonacci number");
        } else System.out.println("This is not a Fibonacci number");
    }
}
