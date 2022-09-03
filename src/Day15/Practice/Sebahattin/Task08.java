package Day15.Practice.Sebahattin;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
/*      Using scanner, create a number.
        If number is palindromic, return true. else, return false.
        Note: Palindromic number is the number, that remains the same when its digits are reversed.
        Example:
        12321 => true
        12344321 => true
        1236541 => false
*/
        //Task8
        Scanner scan = new Scanner(System.in);
        System.out.print("Palindromic number control. Enter number = ");
        int num = scan.nextInt();
        String str = String.valueOf(num);
        int i = 0;
        int j = str.length() - 1;
        boolean control = true;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--)) {
                control = false;
                break;
            }
        }
        if (control)
            System.out.println(num+" number is a palindromic number");
        else
            System.out.println(num+" number is not a palindromic number");
    }
}
