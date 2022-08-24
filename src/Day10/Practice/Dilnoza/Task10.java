package Day10.Practice.Dilnoza;

import java.util.Scanner;

public class Task10 {
    /*
    Given a String. If a given string contains only digits, return true. Else, return false
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Provide a string pls==>");
        String str = scan.nextLine();
      //  String s=str.replaceAll("[^a-z]", "");

        if(str.matches(".*\\d+.*") ){

            System.out.println(true);
        }
        else{
            System.out.println("false");



    }
}}