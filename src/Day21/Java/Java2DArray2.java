package Day21.Java;

import java.util.Arrays;

public class Java2DArray2 {
    public static void main(String[] args) {
        int row = 2;
        int column = 2;

        int[][] dArr = new int[row][column];
//        int[] arr = {1,2};
//        int[] arr2 = {11,22};
//        dArr[0] = arr;
//        dArr[1] = arr2;
        dArr[0][0] = 1;
        dArr[0][1] = 2;
        dArr[1][0] = 11;
        dArr[1][1] = 22;

        System.out.println(Arrays.deepToString(dArr));


    }
}
