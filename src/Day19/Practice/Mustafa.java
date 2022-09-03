package Day19.Practice;

import java.util.Scanner;

public class Mustafa {
    public static void main(String[] args) {
         /* Task1 Write a Java program to test if an array contains a specific value.
        int[] my_array1 = {1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};
        int n = 1789;
        Output: true*/

        int[] my_array1 = {1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a digit between 1254 and 2458");
        int num1 = scanner.nextInt();

        for (int i = 0; i < my_array1.length; i++) {
            if (my_array1[i] == num1){
                System.out.println("True");
            }

        }
        System.out.println();

        //Task2 Write a Java program to calculate the average value of array elements.
        int [] numArr = {12, 35, 58, 78, 96, 12};
        double tot = 0;
        for (int i = 0; i < numArr.length; i++) {
            tot += numArr[i];
        }
        System.out.println(tot/numArr.length);


        String [] strArr = {"$50", "$150", "$5", "$18", "$25"};
        String [] str1 = { };

        /*Task4
        Remove dollar sign from array elements and print updated array;
        output = "50", "150", "5", "18", "25"  9:35
        * */

        for (int i = 0; i <strArr.length ; i++) {
            strArr[i] = strArr[i].replace("$", " ");
            System.out.print(strArr[i] + ",");
        }



    }
}
