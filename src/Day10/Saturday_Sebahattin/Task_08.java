package Day10.Saturday_Sebahattin;

import java.util.Scanner;

public class Task_08 {
    public static void main(String[] args) {

/*      Task 8
            Given two Strings by using scanner class
            add the second string after the first one
            If the first word ends with the same letter as the second word starts with, then remove it.
            Example: "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Task 8 / The last letter of the first word, the first letter of the second word");
        System.out.print("Enter string 1 = ");
        String string1 = input.nextLine();
        System.out.print("Enter string 2 = ");
        String string2 = input.nextLine();

        int lengthStr1 = string1.length();
        char ch1 = string1.charAt(lengthStr1-1);
        char ch2 = string2.charAt(0);
        int lengthStr2 = string2.length();

        if (ch1 == ch2){
            System.out.println(string1.concat(string2.substring(1,lengthStr2)));
        }
        if (ch1 != ch2){
            System.out.println(string1.concat(string2));
        }
    }
}
