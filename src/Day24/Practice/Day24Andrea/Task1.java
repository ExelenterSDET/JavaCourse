package Day24.Practice.Day24Andrea;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of side 1: ");
        int side1 = scan.nextInt();
        System.out.print("Enter the length of side 2: ");
        int side2 = scan.nextInt();
        System.out.print("Enter the length of side 3: ");
        int side3 = scan.nextInt();
        int answer = getParam(side1, side2, side3);
        System.out.println("Parameter is: " + answer);
    }

    static int getParam (int a, int b, int c) {
        int param = a+b+c;
        return param;
    }

    static int getParam (int a, int b) {
        int param = 2*(a+b);
        return param;
    }
    static double getParam (int numSides, double sideLength) {
        double param = (double) numSides * sideLength;
        return param;
    }
    static int getParam (int a) {
        int param = 8 * a;
        return param;
    }


}
