package Day10.Saturday_Project_Bakhridin;

import java.util.Scanner;

public class Task_01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /** Task1
         * Given an int ,
         *             if the age is less than or equal 10
         *                 print "too young to create a Facebook account"
         *              if the age is less than or equal 16
         *                 print "too young to get a driver's license"
         *              if the age is less than or equal 18
         *                 print "too young to get a tattoo"
         *             if the age is less than or equal 21
         *                 print "too young to drink alcohol"
         *             if the age bigger than 21
         *                 print "do whatever you want to do"
         */
        System.out.print("Enter your age => ");
        int age = scan.nextInt();

        if (age <=10 && age>0) {
            System.out.println("Too young to create a Facebook account");
        }
        if (age<=16 && age>0) {
            System.out.println("Too young to get a driver's licence");
        }
        if (age <=18 && age>0) {
            System.out.println("too young to get a tattoo");
        }
        if (age <=21 && age>0) {
            System.out.println("too young to drink alcohol");
        }
        if (age>21) {
            System.out.println("do whatever you want to do");
        }
        if (age<=0) {
            System.out.println("Your parents should work hard");
        }






    }

}
