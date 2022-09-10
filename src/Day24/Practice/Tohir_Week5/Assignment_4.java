package Day24.Practice.Tohir_Week5;

import java.util.Arrays;

public class Assignment_4 {
    public static void main(String[] args) {
        int num = 5;
        int [][] a = new int[num][];
        int[][] dArr = new int[num][num-1];

        for (int row = 0; row < dArr.length; row++) {
            for (int col = 0; col < row+1; col++) {
                dArr[row][col] = col;
            }
        }

        System.out.println(Arrays.deepToString(dArr));
       //System.out.println("Arrays.deepToString(a) = " + Arrays.deepToString(a)+" "+a.length);
        //for (int i = 0; i < num; i++) {
          //  a[i][0]=i;
                    }
       // System.out.println("a = " + Arrays.toString(a));
     //   System.out.println("Arrays.deepToString(a) = " + Arrays.deepToString(a)+" "+a.length);

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