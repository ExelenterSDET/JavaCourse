package Day30.Practice._09_20_2022_Mentoring_SP6;

import java.util.Scanner;

public class Task8 {

      /*            Task 8

           1. Create a method that has an int as parameter.
              Check if a number is a prime number. Note: Prime numbers are numbers divisible only by 1 and themselves.

           2. Create a void method which will do following function:

              Using Scanner class, ask user to provide a number.
              If a number is a prime number, inform the user and terminate the program.
              If it is not, ask the user to try again, until they find a prime number.
              Maximum number attempts should be 10.

============================================================================*/
    static boolean isPrimeNumber(int n){
        if (n <=1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(n) ; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    static void findPrimeNumber(){
        int attempts = 0;

        while (attempts < 10){
            int input;
            Scanner scan = new Scanner(System.in);
            System.out.print("Provide a number: ");
            input = scan.nextInt();
            if (isPrimeNumber(input)){
                System.out.println("Provided number is a Prime Number");
                break;
            }
            attempts++;
            if (attempts == 10 && !isPrimeNumber(input)){
                System.out.println("Sorry! Wrong inputs");
            }
        }
    }

}
