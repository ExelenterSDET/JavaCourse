package Day10.Saturday_Sebahattin;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
/*      Task 2
        Given an int number. Check if the number is even or not
        if the number is even print true
        if the number is odd print false
        result should be true or false.
 */
        System.out.println("Task 2 / Check if the number is even or not");
        System.out.print("Enter number = ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if (num%2 == 0){
            System.out.println("True");
        }
        if (num%2 != 0){
            System.out.println("False");
        }
    }
}
