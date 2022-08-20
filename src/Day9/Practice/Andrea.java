package Day9.Practice;

import java.util.Scanner;

public class Andrea {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Task 1");

        System.out.print("Please enter a word: ");
        String str1 = scan.nextLine();
        System.out.print("Please enter another word: ");
        String str2 = scan.nextLine();
        int l1 = str1.length();
        int l2 = str2.length();
        boolean sameLength = l1 == l2;
        System.out.println("sameLength = " + sameLength);

        System.out.println("\nTask 2");

        System.out.print("Please enter a sentence: ");
        String sentence = scan.nextLine();
        String s1 = sentence.replaceAll("[A-Z]", "\\$");
        System.out.println(s1);

        System.out.println("\nTask 3");

        System.out.print("Please enter the price of product 1 as a dollar value: ");
        String priceProduct1 = scan.nextLine();
        double dProduct1 = Double.parseDouble(priceProduct1.replaceAll("[^\\d.]", ""));

        System.out.print("Please enter the price of product 2 as a dollar value: ");
        String priceProduct2 = scan.nextLine();
        double dProduct2 = Double.parseDouble(priceProduct2.replaceAll("[^\\d.]", ""));

        System.out.print("Please enter the price of product 3 as a dollar value: ");
        String priceProduct3 = scan.nextLine();
        double dProduct3 = Double.parseDouble(priceProduct3.replaceAll("[^\\d.]", ""));

        System.out.println("The average price of these products is $" + ((dProduct1 + dProduct2 + dProduct3) / 3));

    }
}
