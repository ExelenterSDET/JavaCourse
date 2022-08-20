package Day9.Practice;

import java.util.Scanner;

public class MentoringTask1 {
    /*
    Given 2 strings, return their concatenation, except omit the first char of each.
    The strings will be at least length 1.

    Example:
    nonStart("Hello", "There") → "ellohere"
    nonStart("java", "code") → "avaode"
    nonStart("shotl", "java") → "hotlava"
     */
    public static void main(String[] args) {

        // Hint
        // 1. substring method
        // 2. concat method

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first string => ");
        String str1 = scan.nextLine();
        System.out.print("Enter second string => ");
        String str2 = scan.nextLine();

        str1 = str1.substring(1);
        str2 = str2.substring(1);

        String result = str1.concat(str2);

        System.out.println("result = " + result);



    }
}
