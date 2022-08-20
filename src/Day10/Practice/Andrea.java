package Day10.Practice;

import java.util.Scanner;

public class Andrea {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int i5 = scan.nextInt();
        System.out.print("Enter another integer: ");
        int i6 = scan.nextInt();
        System.out.print("Enter one more integer: ");
        int i7 = scan.nextInt();

        if (i5 == i6 && i6 == i7 && i5 > 0) {
            System.out.println("The total of these numbers is " + (i5 + i6 + i7));
        }
        if ((i5 != i6 || i5 != i7 || i6 != i7) && i5 > 0 && i6 > 0 && i7 > 0) {
            System.out.println("The product of the numbers is " + (i5 * i6 * i7));
        }
        if (i5 < 0 || i6 < 0 || i7 < 0) {
            System.out.println("0");
        }
    }
}
