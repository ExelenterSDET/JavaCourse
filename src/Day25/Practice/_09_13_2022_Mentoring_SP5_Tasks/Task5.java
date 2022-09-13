package Day25.Practice._09_13_2022_Mentoring_SP5_Tasks;

public class Task5 {

        /*
    * Task5

Part 1.
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

    
    static int gaussSummOf(int n){
        //1. way  //n(n+1)/2
        //return n*(n+1)/2;
        //2. way

        int gaussSum = 0;
        for (int i = 1; i <= n; i++) {
            gaussSum = gaussSum + i;
        }
        
        
        return gaussSum;
        
    }

    static int sumOfSquaresOfGaussSums(int a, int b){
        //a*a + b*b;
        return gaussSummOf(a)*gaussSummOf(a) + gaussSummOf(b)*gaussSummOf(b);
    }



    public static void main(String[] args) {
        int i = 5;
        gaussSummOf(i);
    }

}
