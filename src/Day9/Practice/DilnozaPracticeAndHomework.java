package Day9.Practice;

import java.util.Scanner;

public class DilnozaPracticeAndHomework {
    public static void main(String[] args) {
       // Task1: write a program to calculate total

        System.out.println("********************Task1************************");
        String price = "$5.25";
        String qty = "5";

        String newPrice = price.replaceAll("[^0-9.]","");
        double newPrice1 = Double.parseDouble(newPrice);
        double newQty = Double.parseDouble(qty);
        System.out.println("Total price is: "+ newPrice1*newQty);


        System.out.println("********************Task2************************");
        //Task2:  Calculate how much us dollar worth bitcoin you have.
        String bitcoinPrice = "($22,938.81 United States Dollar)";
        String qty2 = "0.657 BTC";

        String newBitcoinPrice = bitcoinPrice.replaceAll("[^0-9.]", "");
        Double dNewBitcoinPrice = Double.parseDouble(newBitcoinPrice);

        String dbQty0 = qty2.replaceAll("[^0-9.]", "");

        Double dbQty = Double.parseDouble(dbQty0);
        System.out.println("Total bitcoin in US dollars is: " + "$" + dNewBitcoinPrice * dbQty);

        System.out.println("********************Task3************************");

  /*1. Enter the product name
        2. Enter the price for that product
        3. Enter the qty
        4. calculate total.

        "You ordered <<product name>>. Total price is <<total price>>
*/
        Scanner scanner = new Scanner (System.in);
        System.out.print("What  product do you have==> ");
        String itemName = scanner.nextLine();
        System.out.print("What is the price of the product==> ");
        String itemPrice = scanner.nextLine();
        String removeSigns = itemPrice.replaceAll("[\\$]","");
        double newPriceDb = Double.parseDouble(removeSigns);
        System.out.print("How many did you get? ==>");
        int itemQty = scanner.nextInt();

        System.out.println("You ordered:  "+ itemName +". Total price is: " + newPriceDb * itemQty);

        System.out.println("====================HOME  WORK TASKS ==========================");

        System.out.println("********************Task1************************");
        Scanner scanner0 = new Scanner(System.in);
        System.out.print("Please enter Hello ==>" );
        String hello = scanner0.nextLine();
        System.out.print("Please enter World==>");
        String world = scanner0.nextLine();
        boolean isLengthEqual = hello.length()==world.length();
        System.out.println("Is the length of hello and world equal: " + isLengthEqual);
        System.out.println("********************Task2************************");

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter a string Hello World ==> ");
        String helloWorld = scanner1.nextLine();
        System.out.println(helloWorld.replaceAll("[A-Z]","\\$"));

        System.out.println("********************Task3************************");
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Please enter price for Product1 => ");//$5.36 value to be entered
        String productPrice1 =scanner2.nextLine();
        String price1 = productPrice1.replaceAll("[\\$]", "");
        double price1db= Double.parseDouble(price1);


        System.out.print("Please enter price for Product2 => ");//$3.47 value to be entered
        String productPrice2 =scanner2.nextLine();
        String price2 =productPrice2.replaceAll("[\\$]","");
        double price2db= Double.parseDouble(price2);

        System.out.print("Please enter price for Product3 => ");//$4.15 value to be entered
        String productPrice3 =scanner2.nextLine();
        String price3 =productPrice3.replaceAll("[\\$]","");
        double price3db= Double.parseDouble(price3);


        System.out.println("The average price of your items is: "+ "$" + (price1db + price2db + price3db) / 3);








    }
}
