package Day10.Saturday_Project_Bakhridin;

import java.util.Scanner;

public class Task_04 {

    public static void main(String[] args) {

        /**Task4
         * Given a int number
         *             -print "fizz" when given number is divisible by 5
         *             -print "buzz" when given number is divisible by 3
         *             -print "fizzbuzz" when given number is divisible by both 3 and 5
         *             -print same number if it is not divisible by 3 or 5
         *         Examples:
         *             input1 -> 10 | output1 -> fizz
         *             input2 -> 9  | output2 -> buzz
         *             input3 -> 30 | output3 -> fizzbuzz
         *             input4 -> 7  | output4 -> 7
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter number=> ");
        int num = scan.nextInt();

        if (num%5==0) {
            System.out.println("fizz");
        }
        if (num%3==0) {
            System.out.println("buzz");
        }
        if (num%5==0 && num%3==0) {
            System.out.println("fizzbuzz");
        }
        if (num%5!=0 && num%3!=0) {
        }
        System.out.println("7");

    }
}
