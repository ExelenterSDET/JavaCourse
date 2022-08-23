package Day10.Saturday_Project_Bakhridin;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        /**
         * Create two Strings. If the first string contains second string, concat second string to the first string.
         * else, concat first string to itself.
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("enter first string=> ");
        String s1 = scan.nextLine();
        System.out.print("enter second string=> ");
        String s2 = scan.nextLine();

        if (s1.contains(s2)) {
            System.out.println("First string concatenated to the second "+s1.concat(s2));
        }
        if (!s1.contains(s2)) {
            System.out.println("First string concatenated to the itself "+s1.concat(s1));
        }

    }

}
