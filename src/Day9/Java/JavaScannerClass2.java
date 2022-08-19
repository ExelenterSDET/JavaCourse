package Day9.Java;

import java.util.Scanner;

public class JavaScannerClass2 {

    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);
        /*
        int i = scan.nextInt();
        double d = scan.nextDouble();
        boolean b = scan.nextBoolean();
        */
        System.out.print("Enter int number  => ");
        int i = scan.nextInt();

        System.out.print("Enter double number => ");
        double d = scan.nextDouble();

        System.out.print("Enter boolean => ");
        boolean b = scan.nextBoolean();

        System.out.println("int is " + i);
        System.out.println("double is " + d);
        System.out.println("boolean is " + b);
    }
}
