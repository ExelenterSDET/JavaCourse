package Day9.Java;

import java.util.Scanner;

public class Scanner2Tasks {

    public static void main(String[] args) {

        /*
        1. Enter the product name
        2. Enter the price for that product
        3. Enter the qty
        4. calculate total.

        "You ordered <<product name>>. Total price is <<total price>>

         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your product name => ");
        String product = scan.nextLine();
        System.out.print("Enter price for the product =>");
        double price = scan.nextDouble();
        System.out.print("Enter your quantity =>");
        int qty = scan.nextInt();
        System.out.print("You ordered "+ product +". Total price is " + "$" + price*qty);

    }
}
