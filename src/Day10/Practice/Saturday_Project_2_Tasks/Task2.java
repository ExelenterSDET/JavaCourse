package Day10.Practice.Saturday_Project_2_Tasks;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
                /*Task2
         Given an int number. Check if the number is even or not
        if the number is even print true
        if the number is odd print false
        result should be true or false.
        * */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int number = scan.nextInt();

        boolean isNumberEven = number%2 == 0;

        if (!isNumberEven){
            isNumberEven = false;
        }else {
            isNumberEven = true;
        }
        System.out.println(isNumberEven);
    }
}
