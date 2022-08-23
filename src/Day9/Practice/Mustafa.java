package Day9.Practice;

import java.util.Scanner;

public class Mustafa {
    public static void main(String[] args) {
        /*Task1

        Create two string in scanner and verify if their lengths are equal.
        Example:str1 = "Hello", str2 = "World". The output should be TRUE
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string");
        String str1 = scan.nextLine();
        System.out.println("Enter second string");
        String str2 = scan.nextLine();
        boolean str3 = (str1.length() == str2.length());
        System.out.println(str3);

        /*Task2

        Write a Java program using Scanner, which will accept a string and replace all Capital characters
         with '$' sign. "Example: str1 = "Hello World". Expected Output: $ello $orld*/

        System.out.println("Enter a String to replace cappitaletters ");
        String str4 = scan.nextLine();
        System.out.println(str4.replaceAll("[A-Z]", "*"));

        /*
        Task3
        Write a java program using Scanner, which will accept three strings as priceProduct1 = "$5.36",
        priceProduct2 = "$3.47", priceProduct3 = "$4.15". Return the average of product prices*/

        System.out.println("First Price");
        double price1 = scan.nextDouble();
        System.out.println("Second Price");
        double price2 = scan.nextDouble();
        System.out.println("Third Price");
        double price3 = scan.nextDouble();
        System.out.println((price1 +price2 + price3)/3);
    }
}
