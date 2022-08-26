package Day12.Practice.Mentoring_08_24_2022;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        /*Task2
         *Take three numbers from the user and print the greatest number.
         * */

        Scanner scan = new Scanner(System.in);
        int greatestN = 0;

        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scan.nextInt();

        //12 10 1      if 12>10 && 12>1  // if 10>12 && 10 > 1 // else

        if (num1 > num2 && num1 > num3){
            greatestN = num1;
        }

        else if (num2 > num1 && num2 > num3){
            greatestN = num2;
        }
        else if (num3 > num1 && num3 > num2){
            greatestN = num3;
        }
        else {
            System.out.println("Invalid input or all numbers are equal");
        }
        System.out.println("greatestN = " + greatestN);
    }
}
