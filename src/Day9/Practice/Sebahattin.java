package Day9.Practice;

import java.util.Scanner;

public class Sebahattin {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please 1. enter the word = ");
        String str1 = in.nextLine();
        System.out.println("Please 2. enter the word = ");
        String str2 = in.nextLine();

        int i1 = str1.length();
        int i2 = str2.length();

        boolean bl = i1 == i2;
        System.out.println(bl);
        System.out.println("------------------");

        System.out.println("Please enter a sentence =");
        String str3 = in.nextLine();
        String replace = str3.replaceAll("[A-Z]", "\\$");
        System.out.println(replace);
        System.out.println("------------------");

        System.out.println("Please enter price for product 1");
        String pr1 = in.nextLine();
        double dpr1 = Double.parseDouble(pr1.replaceAll("[^\\d.]",""));

        System.out.println("Please enter price for product 2");
        String pr2 = in.nextLine();
        double dpr2 = Double.parseDouble(pr2.replaceAll("[^\\d.]",""));

        System.out.println("Please enter price for product 3");
        String pr3 = in.nextLine();
        double dpr3 = Double.parseDouble(pr3.replaceAll("[^\\d.]",""));

        System.out.println("Average price of your product = $"+(dpr1+dpr2+dpr3)/3);
    }
}
