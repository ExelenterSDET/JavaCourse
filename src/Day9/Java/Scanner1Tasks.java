package Day9.Java;

import java.util.Scanner;

public class Scanner1Tasks {
    public static void main(String[] args) {

        // Task Use scanner to enter your FirstName, LastName, Your Favorite movie, your favorite book.
        // My name is s1 + s2. My favorite movie is + m and my favorite book is + b

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name => ");
        String name = scan.nextLine();

        System.out.print("Enter your last name => ");
        String lastName = scan.nextLine();

        System.out.print("Enter your favorite movie => ");
        String movie = scan.nextLine();

        System.out.print("Enter your favorite book => ");
        String book = scan.nextLine();

        System.out.println("My name is " + name + " " + lastName +
                          ". My favorite movie is \"" + movie +
                            "\" and my favorite book is \"" + book+"\".");

    }
}
