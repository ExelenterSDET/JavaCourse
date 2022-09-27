package Day29.Practice.Ibrahim.Saturday;

import java.util.Scanner;

/*
Task 8

           1. Create a method that has an int as parameter.
              Check if a number is a prime number. Note: Prime numbers are numbers divisible only by 1 and themselves.

           2. Create a void method which will do following function:

              Using Scanner class, ask user to provide a number.
              If a number is a prime number, inform the user and terminate the program.
              If it is not, ask the user to try again, until they find a prime number.
              Maximum number attempts should be 10.
 */
public class Task8 {

    // Not working with 1 and negative numbers!!!!!!!

    static boolean isPrime(int a){

        boolean isPrime = false;

        for (int i = 2; i < a; i++) {
            if (a % i == 0 || a == 1){
                isPrime = true;break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int attempt = 0;

        while (attempt < 10){
            System.out.print("Please enter a number = ");
            int num = scan.nextInt();

            if (isPrime(num)){
                System.out.println(num + " is not prime. Try again!");
            }else{
                System.out.print(num + " is prime");break;
            }
            attempt++;
        }
        if (attempt == 10){
            System.out.println("Maximum attempt has been reached!");
        }
    }
}
