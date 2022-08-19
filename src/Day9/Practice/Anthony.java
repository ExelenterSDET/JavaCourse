package Day9.Practice;

import java.util.Scanner;

public class Anthony {
    public static void main(String[] args) {

        /*
        Task1

        Create two string in scanner and verify if their lengths are equal. Example: str1 = "Hello", str2 = "World". The output should be TRUE
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter => ");
        String hello = scan.nextLine();
        System.out.print("Please enter => ");
        String world = scan.nextLine();


        System.out.println("TASK1 - OUTPUT = " + ((hello.length() == world.length())+"\n"));
        System.out.println("---------------------------------------------------------");


        /*
        Task2

        Write a Java program using Scanner, which will accept a string and replace all Capital characters with '$' sign. "Example: str1 = "Hello World". Expected Output: $ello $orld
        */

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Please enter => ");
        String helloWorld = scan2.nextLine();
        String replace = "Hello World";

        System.out.println("TASK2 - OUTPUT = " + replace.replaceAll("[H,W]","\\$")+"\n");
        System.out.println("---------------------------------------------------------");

         /*
        Task3

        Write a java program using Scanner, which will accept three strings as priceProduct1 = "$5.36", priceProduct2 = "$3.47", priceProduct3 = "$4.15". Return the average of product prices
         */

        Scanner scan3 = new Scanner(System.in);
        System.out.print("PriceProduct1 => ");
        String price1 = scan3.nextLine();
        System.out.print("PriceProduct2 => ");
        String price2 = scan3.nextLine();
        System.out.print("PriceProduct3 =>");
        String price3 = scan3.nextLine();

        String x = "$5.36";
        String y = "$3.47";
        String z = "$4.15";

        String x1 = x.replaceAll("[$]","");
        double a = Double.parseDouble(x1);

        String y1 = y.replaceAll("[$]","");
        double b = Double.parseDouble(y1);

        String z1 = z.replaceAll("[$]","");
        double c = Double.parseDouble(z1);

        double averagePrice = ((a+b+c)/3);

        System.out.println("TASK3 - AVERAGE PRICE OF PRODUCTS = "+"$"+((averagePrice)+ " USD")+"\n");
        System.out.println("---------------------------------------------------------");


    }
}
