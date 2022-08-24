package Day12.Practice.Mentoring_08_24_2022;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        /*Task3
        * * Write a Java program that takes a number and set thousands separator in that number. 1000 => 1,000
        * example: 100 => 100
        *                1000 => 1,000 / len = 4  len-3
        *                10000 => 10,000
        *                100000 => 100,000
         * */

        Scanner scan = new Scanner(System.in);
        String result ="";

        System.out.print("Input any number: ");
        int n = scan.nextInt();    //1000

        String nToString = String.valueOf(n); // 1000
        int len = nToString.length();  // len = 4

        if (len < 4){
            result = nToString;
        } else {
            result = nToString.substring(0,len-3) + "," + nToString.substring(len-3);
        }

        System.out.println("result = " + result);

    }
}
