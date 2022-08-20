package Day9.Practice;

import java.util.Scanner;

public class MalikaTasks {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        //Task1 Write a java program to calculate total price
        String price = "$5.25";
        String qty = "5";

        double dPrice = Double.parseDouble(price.replaceAll("[^\\d.]", ""));
        int iQty = Integer.parseInt(qty);
        System.out.println(dPrice*iQty);

        //Task2 Calculate how much us dollar worth bitcoin you have
        String bitcoinPrice = "($22,938.81 United States Dollar)";
        String bitcoinQty1 = "0.657 BTC";
        double bitcoinPrice1 = Double.parseDouble(bitcoinPrice.replaceAll("[^\\d.]",""));
        double bitcoinQty = Double.parseDouble(bitcoinQty1.replaceAll("[^\\d.]", ""));
        System.out.println(bitcoinPrice1*bitcoinQty);

        //Task3
        System.out.print("Please enter your name");
        String s = scan.nextLine();
        System.out.print("Please enter your lastname");
        String s1 = scan.nextLine();
        System.out.print("Please enter your favourite movie");
        String s2 = scan.nextLine();
        System.out.print("Please enter your favourite book");
        String s3 = scan.nextLine();
        System.out.println("My name is " + s + " " + s1 + " My favourite movie is " + s2 + " My favourite book is " + s3);

        //Task4
        // 1. Enter the product name
        // 2. Enter the price for that product
        // 3. Enter Qty
        // 4. Calculate total

        //"You ordered <<product name>>. Total price is <<total price>>"

        System.out.print("Enter product name");
        String Product = scan.nextLine();
        System.out.print("Enter product price");
        String ProductPrice = scan.nextLine();
        System.out.print("Enter product qty");
        String ProductQty = scan.nextLine();
        System.out.print("Enter product Total Price");
        String ProductTotPrice = scan.nextLine();
        System.out.println("You ordered: " + ProductQty + " of " + Product + " and" + " Total price is: " + "$" + ProductTotPrice);


    }
}
