package Day11.Java;

import java.util.Scanner;

public class Task2 {
    /*
            Given an int number
            -print "fizz" when given number is divisible by 5
            -print "buzz" when given number is divisible by 3
            -print "fizzbuzz" when given number is divisible by both 3 and 5
            -print same number if it is not divisible by 3 or 5
        Examples:
            input1 -> 10 | output1 -> fizz
            input2 -> 9  | output2 -> buzz
            input3 -> 30 | output3 -> fizzbuzz
            input4 -> 7  | output4 -> 7
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number => ");
        int number = scan.nextInt();
        String output = "";

        if(number%5 == 0 && number%3 == 0){
            output = "fizzbuzz";
        }else if (number%3 == 0){
            output = "buzz";
        }else if (number%5 == 0){
            output = "fizz";
        }else {
            output = String.valueOf(number);
        }
        System.out.println(output);

    }
}
