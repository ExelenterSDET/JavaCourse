package Day10.Practice.Dilnoza;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

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

Scanner scanner = new Scanner(System.in);
        System.out.print("Please provide an integer==>");
        int iNum = scanner.nextInt();
        if (iNum%5==0 || iNum%3!=0){
            System.out.println("output1: "+ "fizz");
        }
        if(iNum%3==0 && iNum%5!=0){
            System.out.println("output2: "+ "buzz");
        }
        if(iNum%3==0 || iNum%5==0)
            System.out.println("output3: "+ "fizzbuzz");
        if (iNum%5!=0 && iNum%4!=0){
            System.out.println("Number not divisible by 3 and 5==> " +iNum);
        }





}}
