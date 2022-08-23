package Day10.Practice.Saturday_Project_2_Tasks;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        /*Task1
        * Given an int ,
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
        * */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        String message = "";

        if (age <= 10 && age >=0){
            message = "too young to create a Facebook account";
        } else if (age <= 16) {
            message = "too young to get a driver's license";
        }
        else if (age <= 18) {
            message = "too young to get a tattoo";
        }
        else if (age <= 21) {
            message = "too young to drink alcohol";
        }else {
            message = "do whatever you want to do";
        }

        System.out.println(message);
    }
}
