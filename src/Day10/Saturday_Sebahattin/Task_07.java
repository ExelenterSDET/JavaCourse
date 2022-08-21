package Day10.Saturday_Sebahattin;

import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {

/*     Task 7
            Given a String ,
            if the number of the characters in the given String is odd then print true else print false
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Task 7 / Is the number of characters in the string odd or even?");
        System.out.print("Enter numbers in the string with spaces = ");
        String number = input.nextLine();
        String[] newStr = number.split(" ");
        int newLength = newStr.length;
        System.out.println("Number of the characters = "+newLength);

        if (newLength%2 != 0){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
