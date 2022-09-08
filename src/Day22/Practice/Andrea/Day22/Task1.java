package Day22.Practice.Andrea.Day22;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Task1 p1 = new Task1();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scan.nextInt();
        System.out.print("Enter another number: ");
        int y = scan.nextInt();
        output(x,y);

    }
    public static void output(int a, int b){

        int total = a + b;
        System.out.println(total);

    }
}
