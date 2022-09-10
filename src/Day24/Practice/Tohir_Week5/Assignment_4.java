package Day24.Practice.Tohir_Week5;

import java.util.Arrays;

public class Assignment_4 {
    public static void main(String[] args) {

        int[] dArr = new int[5];
        int[] dArr1 = new int[5];

        System.out.println(Arrays.toString(dArr));

        for (int row = 0; row < dArr1.length; row++) {
            dArr[row]= row;
            }


            //           for (int col = 0; col < dArr[row].length; col++) {
            //               dArr[row][col] = row;



        System.out.println(Arrays.toString(dArr));

    }
}


        //Task4
//
//Create a 2D int array
//The 2D array has 5 element arrays
//Each element array length is equal its index in the 2D array
//Each element array contains int values of its index number
//Print the 2D array
//So, the output must be: [[], [1], [2, 2], [3, 3, 3], [4, 4, 4, 4]]
//DO NOT HARDCODE! USE LOOPS!