package Day24.Practice.Tohir_Week5;

import java.util.Scanner;

public class Assignment_5 {
    public static void main(String[] args) {
        Assignment_5 asg = new Assignment_5();
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert 1st number :");
        int a = scan.nextInt();
        System.out.println("\nInsert 2nd number :");
        int b = scan.nextInt();

        System.out.println(" sum= " + asg.sumOfSquaresOfGaussSums(a,b));

    }

    int gaussSumOf(int num)
    {
        int sum = 0;
        for (int i = 0; i < num+1; i++) {
            sum+=i;
        }
        return sum;
    }
    int sumOfSquaresOfGaussSums(int a, int b)
    {
        a = gaussSumOf(a);
        b = gaussSumOf(b);
        return (a*a+b*b);
    }
}
//Task5
//
//Part 1.
//   Create a method whose name is gaussSumOf
//       Information:
//          Gauss sum of a number is the sum of the all numbers from 1 to that number (inclusive).
//          For example:
//          Gauss sum of 7 is 1+2+3+4+5+6+7 = 28
//   As parameters the method takes a positive int
//   The method returns an int
//   The method calculates and returns the Gauss sum of the argument number.
//
//Part 2.
//    Create a method whose name is sumOfSquaresOfGaussSums
//    As parameters it takes two ints
//    The method returns an int
//    The method calculates and returns the sum of the squares of the Gauss sum of the given arguments.
//    Example:
//    first argument: 5 -> Gauss sum of 5 = 15 -> square of 15 = 225
//    second argument: 10 -> -> Gauss sum of 10 = 55 -> square of 55 = 3025
//    sum of the squares -> 225 + 3025 = 3250
//    if the method takes 5 and 10 then it returns 3250
//    HINT: Use the first method above to calculate the Gauss sums of the numbers.
// Part 3.
//    Create a Scanner class in the main method to provide numbers to run the method.