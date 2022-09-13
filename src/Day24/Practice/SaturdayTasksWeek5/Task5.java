package Day24.Practice.SaturdayTasksWeek5;

import java.util.Scanner;

public class Task5 {

    //need to prompt for user input from console

//    Part 1.
//    Create a method whose name is gaussSumOf
//    Information:
//    Gauss sum of a number is the sum of the all numbers from 1 to that number (inclusive).
//    For example:
//    Gauss sum of 7 is 1+2+3+4+5+6+7 = 28
//    As parameters the method takes a positive int
//    The method returns an int
//    The method calculates and returns the Gauss sum of the argument number.
//
//    Part 2.
//    Create a method whose name is sumOfSquaresOfGaussSums
//    As parameters it takes two ints
//    The method returns an int
//    The method calculates and returns the sum of the squares of the Gauss sum of the given arguments.
//    Example:
//    first argument: 5 -> Gauss sum of 5 = 15 -> square of 15 = 225
//    second argument: 10 -> -> Gauss sum of 10 = 55 -> square of 55 = 3025
//    sum of the squares -> 225 + 3025 = 3250
//            if the method takes 5 and 10 then it returns 3250
//    HINT: Use the first method above to calculate the Gauss sums of the numbers.
//            Part 3.
//    Create a Scanner class in the main method to provide numbers to run the method.


    public static void main(String[] args) {
        int input1, input2 = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        input1 = scan.nextInt();
        System.out.println("Gauss sum of this number: " + gaussSumOf(input1));
        System.out.print("Enter another integer: ");
        input2 = scan.nextInt();

        System.out.println("Gauss sum of squares: " + sumOfSquaresOfGaussSums(input1,input2));
    }

        static int gaussSumOf(int a)
        {
            int sum = 0;
            for (int i = 0; i <= a; i++) {
                sum = sum + i;
            }

            return sum;
        }

        static int sumOfSquaresOfGaussSums(int a, int b){
            int num1 = gaussSumOf(a);
            int num2 = gaussSumOf(b);
            return num1*num1 + num2*num2;
        }

    }

