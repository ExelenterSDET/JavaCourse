package Day9.Java;

import java.util.Scanner;

public class JavaScannerClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name ");
        String s = scan.nextLine(); // is used to store string values
        System.out.println("please enter your address ");
        String s1 = scan.nextLine();
        System.out.println("please enter your zipcode");
        String s2 = scan.nextLine();
        System.out.println("please enter your city");
        String s3 = scan.nextLine();

        System.out.println("Your name is " + s
                            +"\n Your address is " + s1 + " " + s3 + " " + s2);

        // Task Use scanner to enter your FirstName, LastName, Your Favorite movie, your favorite book.
        // My name is s1 + s2. My favorite movie is + m and my favorite book is + b

    }
}
