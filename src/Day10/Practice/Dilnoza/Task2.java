package Day10.Practice.Dilnoza;

import java.util.Scanner;

public class Task2 {

/*
Given an int number. Check if the number is even or not
        if the number is even print true
        if the number is odd print false
        result should be true or false.
 */
public static void main(String[] args) {
    System.out.println("******************** Task2********************************");
    Scanner scan1 = new Scanner(System.in);
    System.out.print("Please provide a number: ==>");
    int iNum = scan1.nextInt();

    if(iNum%2==0){
        System.out.println("You have an even ");
    }else{
        System.out.println("You have an odd number: ");
    }
}
}
