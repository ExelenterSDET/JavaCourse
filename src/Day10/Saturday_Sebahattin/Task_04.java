package Day10.Saturday_Sebahattin;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {

        /*      Task 4
            Given a int number
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
        Scanner scan = new Scanner(System.in);
        System.out.println("Task 4 / Is it divisible by 3 and by 5.");
        System.out.print("Enter number = ");
        int div = scan.nextInt();

        if (div%3!=0 && div%5==0 && div!=0){
            System.out.println("fizz");
        }
        if (div%3==0 && div%5!=0 && div!=0) {
            System.out.println("buzz");
        }
        if (div%3==0 && div%5==0 && div!=0) {
            System.out.println("fizzbuzz");
        }
        if ((div%3!=0 && div%5!=0) || div==0) {
            System.out.println("Is not divisible "+div);
        }

    }
}
