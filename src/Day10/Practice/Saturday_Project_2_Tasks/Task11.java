package Day10.Practice.Saturday_Project_2_Tasks;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        /*Task11
         * Create two Strings. If the first string contains second string,
         * concat second string to the first string. else, concat first string to itself.
         * */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String str1 = scan.nextLine();

        System.out.print("Enter second text: ");
        String str2 = scan.nextLine();

        if (str1.contains(str2)){
            System.out.println(str1.concat(str2));
        }
        if (!str1.contains(str2)){
            System.out.println(str1.concat(str1));
        }
    }
}
