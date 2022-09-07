package Day21.Java;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        /*
        Task1
        Create an int 2D array. length of rows is 4, length of columns is 3
        using random class, assign values to each element between 0 and 10
         */

        int[][] arr = new int[4][5];
        Random random  = new Random();
        // {{1,5,4},{0,1,2},{2,5,0},{1,2,5}};
        for (int i = 0; i < arr.length; i++) { // length of the rows
            for (int j = 0; j < arr[i].length; j++) { // length of the columns
                arr[i][j] = random.nextInt(10);
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(arr[0][1]);
        System.out.println(Arrays.toString(arr[0]));

        //Task2
        // Create another array, of 2D arrays length.
        // values, should be total of inner of 2d arrays.
        // Example:
        //[[7, 6, 8, 9, 8], [6, 6, 9, 6, 3], [0, 6, 5, 5, 3], [6, 6, 7, 5, 7]]
        // output:
        //[38, 30, 19, 31]

        int[] totals = new int[arr.length];
        for (int i = 0; i < arr.length; i++) { // length of the rows
            int total = 0;
            for (int j = 0; j < arr[i].length; j++) { // length of the columns
                total += arr[i][j];
            }
            totals[i] = total;
        }
        System.out.println(Arrays.toString(totals));



    }
}
