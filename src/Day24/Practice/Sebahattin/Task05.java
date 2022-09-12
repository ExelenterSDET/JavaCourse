package Day24.Practice.Sebahattin;

import java.util.Scanner;

public class Task05 {
    /*      Part 1.
       Create a method whose name is gaussSumOf
           Information:
              Gauss sum of a number is the sum of the all numbers from 1 to that number (inclusive).
              For example:
              Gauss sum of 7 is 1+2+3+4+5+6+7 = 28
       As parameters the method takes a positive int
       The method returns an int
       The method calculates and returns the Gauss sum of the argument number.

    Part 2.
        Create a method whose name is sumOfSquaresOfGaussSums
        As parameters it takes two ints
        The method returns an int
        The method calculates and returns the sum of the squares of the Gauss sum of the given arguments.
        Example:
        first argument: 5 -> Gauss sum of 5 = 15 -> square of 15 = 225
        second argument: 10 -> -> Gauss sum of 10 = 55 -> square of 55 = 3025
        sum of the squares -> 225 + 3025 = 3250
        if the method takes 5 and 10 then it returns 3250
        HINT: Use the first method above to calculate the Gauss sums of the numbers.
     Part 3.
        Create a Scanner class in the main method to provide numbers to run the method.

 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number ===> ");
        int num1 = input.nextInt();
        System.out.println("Enter second number ===> ");
        int num2 = input.nextInt();
        Task05 ts = new Task05();
        System.out.println("Gauss sum of "+num1+ " = "+ts.gaussSumOf(num1));
        System.out.println("if the method takes "+num1+" and "+num2+" then it returns "+ts.sumOfSquaresOfGaussSums(num1,num2));
    }

    int gaussSumOf (int num1){
        int sum1 = 0;
        for (int i = 0; i <= num1; i++) {
            sum1 += i;
        }
        return sum1;
    }
    int sumOfSquaresOfGaussSums (int num1, int num2){
        Task05 ts = new Task05();
        int sum1 = ts.gaussSumOf(num1);
        int sum2 = ts.gaussSumOf(num2);
        int squares1 = sum1*sum1;
        int squares2 = sum2*sum2;
        return squares1+squares2;
    }
}
