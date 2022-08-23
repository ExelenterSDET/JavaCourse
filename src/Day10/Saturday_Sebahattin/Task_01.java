package Day10.Saturday_Sebahattin;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        /*       Task 1
        Given an int ,
        if the age is less than or equal 10
        print "too young to create a Facebook account"
        if the age is less than or equal 16
        print "too young to get a driver's license"
        if the age is less than or equal 18
        print "too young to get a tattoo"
        if the age is less than or equal 21
        print "too young to drink alcohol"
        if the age bigger than 21
        print "do whatever you want to do"
*/
        Scanner scan = new Scanner(System.in);

        System.out.println("Task 1 / Age");
        System.out.print("Enter your age = ");
        int age = scan.nextInt();

        if (age < 10){
            System.out.println("Too young to create a Facebook account");
        }
        if (age < 16) {
            System.out.println("Too young to get a driver's license");
        }
        if (age < 18) {
            System.out.println("Too young to get a tattoo");
        }
        if (age <= 21) {
            System.out.println("Too young to drink alcohol");
        }
        if (age > 21) {
            System.out.println("Do whatever you want to do");
        }
    }

}
