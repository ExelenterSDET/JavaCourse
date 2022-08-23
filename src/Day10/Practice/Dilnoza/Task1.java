package Day10.Practice.Dilnoza;

import java.util.Scanner;

public class Task1 {

/*
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

    public static void main(String[] args) {
        System.out.println("******************** Task1********************************");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please provide your age==> " );
        int age = scanner.nextInt();
        if (age<=10){
            System.out.println("too young to create a Facebook account");
        }if (age <=16){
            System.out.println("too young to get a driver's license");
        }if (age<=18){
            System.out.println("too young to get a tattoo");
        }if (age<=21){
            System.out.println("too young to drink alcohol");
        }if (age>=21){
            System.out.println("do whatever you want to do");
        }

    }
}
