package Day10.Saturday_Project_Bakhridin;

import java.util.Scanner;

public class Task_08 {

    public static void main(String[] args) {
        /**Task8
         * Given two Strings by using scanner class
         *             add the second string after the first one
         *             If the first word ends with the same letter as the second word starts with, then remove it.
         *             Example: "abc", "cat" --> "abcat"
         *                    "abc", "dog"  -->"abcdog"
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first string=> ");
        String s1 = scan.nextLine();
        System.out.print("Enter second string=> ");
        String s2 = scan.nextLine();

        String lastLetterOfFirstWord = String.valueOf(s1.charAt(s1.length() - 1));
        String firstLetterOfSecondWord = String.valueOf(s2.charAt(0));

        if (lastLetterOfFirstWord.equalsIgnoreCase(firstLetterOfSecondWord)) {
            System.out.println("Duplicate letter is removed: ");
            s1=s1.replace(lastLetterOfFirstWord,"");
            System.out.println(s1+s2);
        }
        if (!lastLetterOfFirstWord.equalsIgnoreCase(firstLetterOfSecondWord)) {
            System.out.println("Print as is: "+s1+s2);


        }



    }
}
