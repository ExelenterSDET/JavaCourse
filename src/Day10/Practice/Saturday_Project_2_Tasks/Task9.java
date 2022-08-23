package Day10.Practice.Saturday_Project_2_Tasks;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        /*Task9
         *Given a String and a number.
         * Get the character at the given index with the String.
         * If number is greater than the length of the String, return 0
         * */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter any text: ");
        String str = scan.nextLine();

        System.out.print("Enter any number: ");
        int number = scan.nextInt();

        if (number > str.length()){
            System.out.println(0);
        }
        if (number <= str.length() && number > 0){
            System.out.println(str.charAt(number-1)); // hello {indexes: 0 1 2 3 4} {length() = 5}
        }
    }
}
