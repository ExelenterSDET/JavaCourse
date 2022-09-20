package Day29.Practice.SaturdayProject6Andrea;

import java.util.Scanner;

public class Task8 {

   /* Task 8

            1. Create a method that has an int as parameter.
            Check if a number is a prime number. Note: Prime numbers are numbers divisible only by 1 and themselves.

            2. Create a void method which will do following function:

    Using Scanner class, ask user to provide a number.
    If a number is a prime number, inform the user and terminate the program.
    If it is not, ask the user to try again, until they find a prime number.
    Maximum number attempts should be 10.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int inputNumber = sc.nextInt();
        checkForPrime(inputNumber);
    }
    static void checkForPrime(int inputNumber) {
        boolean isItPrime = true;
        int attempts = 0;
        while (attempts < 10) {
            if (inputNumber <= 1) {
                isItPrime = false;
                attempts++;
            } else {
                for (int i = 2; i <= inputNumber / 2; i++) {
                    if ((inputNumber % i) == 0) {
                        isItPrime = false;
                        attempts++;
                        break;
                    }
                }
                if (isItPrime) {
                    System.out.println(inputNumber + " is a prime number.");
                    break;
                }
                else {
                    System.out.println(inputNumber + " is not a prime number.");
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter another number : ");
                    inputNumber = sc.nextInt();
                }
            }
            if (attempts == 9) {
                System.out.println("You have already tried 10 numbers. Better luck next time!");


}
                }
    }
}


