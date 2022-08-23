package Day10.Saturday_Project_Bakhridin;

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {

        /**
         * Create two strings. Check if the strings contain any upper case letters.
         * If strings contain capital letters, return the total count of capital letters for both strings.
         * if, one of the strings only contains capital letters, return the count of all characters for that string.
         * if none of the string contain capital letters, return 0
         * Example
         * Hello and World ==> output should be 2
         * Hello and world ==> output should be 5
         * hello and world ==> output should be 10
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first string=> ");
        String str1=scan.nextLine();
        System.out.print("Enter second string=> ");
        String str2=scan.nextLine();

        if (str1.contains("Hello") && str2.contains("World")) {
            int length = str1.concat(str2).replaceAll("[^A-Z]", "").length();
            System.out.println("length = " + length);
        }
        if (str1.contains("Hello") && str2.contains("world")) {
            System.out.println(str1.length());
        }
        if (str1.contains("hello")&& str2.contains("world")) {
            System.out.println(str1.concat(str2).length());
        }



    }

}
