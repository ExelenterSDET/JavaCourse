package Day24.Practice.Tohir_Week5;

import java.util.Arrays;

public class Assignment_4 {
    public static void main(String[] args) {

        int[][] dArr = new int[5][];

        for (int i = 0; i < 5; i++) {
            dArr[i]= new int[i];
            for (int j=0; j<i; j++){
                dArr[i][j] = i;
            }
            }
        System.out.println("Arrays.deepToString(dArr) = " + Arrays.deepToString(dArr));

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