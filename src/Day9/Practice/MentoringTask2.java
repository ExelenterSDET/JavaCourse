package Day9.Practice;

import java.util.Scanner;

public class MentoringTask2 {
/*
Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
so "yo" and "java" yields "ya".
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter string 1 => ");
        String s1 = scan.nextLine();
        System.out.print("Enter string 2 => ");
        String s2 = scan.nextLine();

        //solution1
//        s1 = String.valueOf(s1.charAt(0));
//        s2 = String.valueOf(s2.charAt(s2.length()-1));

        // solution2
        s1 = s1.substring(0,1);
        s2 = s2.substring(s2.length()-1);

        System.out.println(s1.concat(s2));

    }
}
