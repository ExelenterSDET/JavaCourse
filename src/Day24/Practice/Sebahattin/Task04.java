package Day24.Practice.Sebahattin;

import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
/*      Create a 2D int array
        The 2D array has 5 element arrays
        Each element array length is equal its index in the 2D array
        Each element array contains int values of its index number
        Print the 2D array
        So, the output must be: [[], [1], [2, 2], [3, 3, 3], [4, 4, 4, 4]]
        DO NOT HARDCODE! USE LOOPS!

 */
        int [][]array = new int[5][];
        Task04 ts = new Task04();
        System.out.println(Arrays.deepToString(ts.task04(array)));
    }
    int[][] task04 (int[][] array){
        for (int i = 0 ; i < 5; i++) {
            array[i] = new int[i];
            for (int j = 0; j < i; j++) {
                array[i][j] = i;
            }
        }
        return array;
    }
}
