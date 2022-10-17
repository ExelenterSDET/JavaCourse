package Day29.Practice;

import java.util.Scanner;

public class SaturdayUfukTask8 {
    /*Task 8

            1. Create a method that has an int as parameter.
            Check if a number is a prime number. Note: Prime numbers are numbers divisible only by 1 and themselves.

            2. Create a void method which will do following function:

    Using Scanner class, ask user to provide a number.
    If a number is a prime number, inform the user and terminate the program.
    If it is not, ask the user to try again, until they find a prime number.
    Maximum number attempts should be 10.
     */
    public static void main(String[] args) {
        SaturdayUfukTask8 ut8 = new SaturdayUfukTask8();
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println(" Try to enter a prime number: ");
            int num = scn.nextInt();
            boolean sonuc = ut8.prime(num);
            if (sonuc) {
                System.out.println("Congrats!! You found a prime number!");
                break;
            }
            else {
                System.out.println("Please try again! : Attemp number="+(i+1));
            }
        }
    }

        boolean prime (int a){
            boolean tf = true;
            for (int i = 2; i <= a / 2; i++)
                if (a % i == 0) {
                    tf = false;
                }
            if (tf) {
                System.out.println("This is a prime number");
            } else {
                System.out.println("This is not a prime number");
            }
            return tf;
        }
    }
