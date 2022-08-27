package Day15.Java;

import java.util.Scanner;

public class Task5DoWhileLoop {

    /*
        Use scanner to provide two numbers. And using this numbers, replace Math.pow()
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number => ");
        int num = scan.nextInt();
        System.out.print("Enter a power => ");
        int pow = scan.nextInt();


        int total = 1;
        int count = 0;

        do{
            total *= num;
            count++;
        }while(count<pow);

        int toTest = (int)Math.pow(num, pow);
        System.out.println("toTest = " + toTest);

        System.out.println("count = " + total);

        System.out.println(toTest == total ? "Correct " : "Incorrect");

    }
}
