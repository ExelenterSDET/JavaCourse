package Day10.Practice.Saturday_Project_2_Tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

                /*Task12
        *Create two strings. Check if the strings contain any upper case letters.
If strings contain capital letters, return the total count of capital letters for both strings.
if, one of the strings only contains capital letters, return the count of all characters for that string.
if none of the string contain capital letters, return 0
Example
Hello and World ==> output should be 2
Hello and world ==> output should be 5
hello and world ==> output should be 10
        *  */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first text: ");
        String str1 = scan.nextLine();

        System.out.println("Enter second text: ");
        String str2 = scan.nextLine();

        String str1Capitals = str1.replaceAll("[^A-Z]", "");
        String str2Capitals = str2.replaceAll("[^A-Z]", "");

        if (str1Capitals.length() > 0 && str2Capitals.length() > 0){
            System.out.println(str1Capitals.length() + str2Capitals.length());
        }

        if (str1Capitals.length() > 0 && str2Capitals.length() == 0){
            System.out.println(str1.length());
        }

        if (str1Capitals.length() == 0 && str2Capitals.length() > 0){
            System.out.println(str2.length());
        }

        if (str1Capitals.length() == 0 && str2Capitals.length() == 0){
            System.out.println(0);
        }
    }
}
