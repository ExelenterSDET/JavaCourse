package Day9.Practice;

import java.util.Scanner;

public class MalikaHomework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       /* Task1
        Create two string in scanner and verify if their lengths are equal.
        Example: str1 = "Hello", str2 = "World". The output should be TRUE*/

        System.out.print("print Hello: ");
        String str1 = scan.nextLine();
        System.out.print("print World: ");
        String str2 = scan.nextLine();
        int Hello = str1.length();
        int World = str2.length();
        System.out.println("TASK1 ====>>> Output is: " + (Hello == World));

       /* Task2
        Write a Java program using Scanner, which will accept a string and replace all Capital characters with '$' sign.
        "Example: str1 = "Hello World". Expected Output: $ello $orld*/

        System.out.println(" ");
        System.out.print("Print \"Hello World\": ");
        String s = scan.nextLine();
        String replacetext = s.replaceAll("[A-Z]", "\\$");
        System.out.println("TASK2 ====>>> Output is: " + replacetext);

        /* Task3
        Write a java program using Scanner, which will accept three strings as
        priceProduct1 = "$5.36", priceProduct2 = "$3.47", priceProduct3 = "$4.15". Return the average of product prices */

        System.out.println("");
        System.out.print("priceProduct1: ");
        String s1 = scan.nextLine();
        System.out.print("priceProduct2: ");
        String s2 = scan.nextLine();
        System.out.print("priceProduct3: ");
        String s3 = scan.nextLine();

        String p1 = s1.replace("$", "");
        double product1 = Double.parseDouble(p1);
        String p2 = s2.replace("$", "");
        double product2 = Double.parseDouble(p2);
        String p3 = s3.replace("$", "");
        double product3 = Double.parseDouble(p3);

        System.out.println("TASK3 ====>>> The average of product prices is: $" + (product1 + product2 + product3) / 3);

    }
}
