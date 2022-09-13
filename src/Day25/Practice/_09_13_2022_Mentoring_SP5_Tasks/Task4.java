package Day25.Practice._09_13_2022_Mentoring_SP5_Tasks;

import java.util.Arrays;

public class Task4 {

        /*
    * Task4

Create a 2D int array
The 2D array has 5 element arrays
Each element array length is equal its index in the 2D array
Each element array contains int values of its index number
Print the 2D array
So, the output must be: [[], [1], [2, 2], [3, 3, 3], [4, 4, 4, 4]]
DO NOT HARDCODE! USE LOOPS!
    * */

    public static void main(String[] args) {

        int [][] arr = new int[5][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i];
            for (int j = 0; j < i; j++) {
                arr[i][j] = i;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
