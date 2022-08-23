package Day10.Saturday_Project_Bakhridin;

import java.util.Scanner;

public class Task_07 {

    public static void main(String[] args) {
        /**Task7
         * Given a String ,
         *             if the number of the characters in the given String is odd then print true else print false
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter string==> ");
        String str = scan.nextLine();

        if (str.length()%2==0) {
            System.out.println("True");
        }
        if (str.length()%2!=0) {
            System.out.println("False");
        }

    }

}
