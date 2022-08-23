package Day10.Practice.Saturday_Project_2_Tasks;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
                /*Task8
        * Given two Strings by using scanner class
            add the second string after the first one
            If the first word ends with the same letter as the second word starts with, then remove it.
            Example: "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
        * */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String str1 = scan.nextLine();

        System.out.print("Enter second text: ");
        String str2 = scan.nextLine();

        if (str1.charAt(str1.length()-1) == str2.charAt(0)){
            System.out.println(str1.substring(0, str1.length()-1).concat(str2));
        }

        if (str1.charAt(str1.length()-1) != str2.charAt(0)){
            System.out.println(str1.concat(str2));
        }
    }
}
