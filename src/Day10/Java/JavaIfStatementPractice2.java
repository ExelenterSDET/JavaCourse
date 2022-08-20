package Day10.Java;

import java.util.Scanner;

public class JavaIfStatementPractice2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("print string1 => ");
        String s1 = scan.nextLine();
        System.out.print("print string2 => ");
        String s2 = scan.nextLine();

        if(s1.equalsIgnoreCase(s2)){
            System.out.println("two strings are equal");
        }
        if(!s1.equalsIgnoreCase(s2)){
            System.out.println("two strings are not equal");
        }
        if(s1.startsWith("A" )){
            System.out.println("First string starts with A");
        }
        if(s2.startsWith("A")){
            System.out.println("Second string starts with A");
        }
        if(s1.contains("$")){
            System.out.println("first string is a price ");
        }
        if(s2.contains("$")){
            System.out.println("second string is a price ");
        }

    }
}
