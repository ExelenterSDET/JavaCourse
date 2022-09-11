package Day24.Practice.SaturdayTasksWeek5;

import java.util.Arrays;

public class Task4 {

//    Create a 2D int array
//    The 2D array has 5 element arrays
//    Each element array length is equal its index in the 2D array
//    Each element array contains int values of its index number
//    Print the 2D array
//    So, the output must be: [[], [1], [2, 2], [3, 3, 3], [4, 4, 4, 4]]
//    DO NOT HARDCODE! USE LOOPS!


    //my notes:
    // row
    public static void main(String[] args) {

        int[][] array = new int[5][];

        for (int i = 0; i < 5; i++) {
            array[i] = new int[i];
            for (int j = 0; j < i; j++) {
                array[i][j] = i;
            }
        }
        System.out.print(Arrays.deepToString(array));
    }
}
