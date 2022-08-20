package Day9.Practice;

import java.util.Scanner;

public class Bakhridin_ScannerClassTasks {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);


        /**
         * Task1
         * Create two string in scanner and verify if their lengths are equal.
         * Example: str1 = "Hello", str2 = "World". The output should be TRUE
         */
//        System.out.print("Enter first String value");
//        String str1=scan.nextLine();
//        System.out.print("Enter second String value");
//        String str2=scan.nextLine();
//
//        int lengthOfstr1 = str1.length();
//        String s = String.valueOf(lengthOfstr1);
//        int lengthOfstr2 = str2.length();
//        String s1 = String.valueOf(lengthOfstr2);
//
//        boolean isTrue=s.equals(s1);
//        System.out.println("isTrue = " + isTrue);


        /**
         * Task2
         * Write a Java program using Scanner, which will accept a string and replace all Capital characters with '$' sign.
         * "Example: str1 = "Hello World". Expected Output: $ello $orld
         */
//        System.out.println("Please enter \"Hello World\" ");
//         String str3=scan.nextLine();
//
//        String replaceAll = str3.replaceAll("[A-Z]", "\\$");
//        System.out.println("replaceAll = " + replaceAll);



        /**
         * Task3
         *
         * Write a java program using Scanner,
         * which will accept three strings as priceProduct1 = "$5.36",
         * priceProduct2 = "$3.47", priceProduct3 = "$4.15".
         * Return the average of product prices
         */
        System.out.println("Please enter price of product 1 ");
        String priceProduct1=scan.nextLine();
        System.out.println("Please enter price of product 2 ");
        String priceProduct2=scan.nextLine();
        System.out.println("Please enter price of product 3 ");
        String priceProduct3=scan.nextLine();

        double v = Double.parseDouble(priceProduct1.replaceAll("[^\\d.]",""));
        double v1 = Double.parseDouble(priceProduct2.replaceAll("[^\\d.]",""));
        double v2 = Double.parseDouble(priceProduct3.replaceAll("[^\\d.]",""));
        System.out.println("The average of product prices are =  " + (v+v1+v2)/3);


    }
}
