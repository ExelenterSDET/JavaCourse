package Day21.Java;

import java.util.Arrays;

public class Java2DArray {
    public static void main(String[] args) {
        int row = 2;
        int column = 0;

        int[][] dArr = new int[row][]; // first bracket specifies the length of rows, second is for columns
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {2,4,6,8,10,12,14,16,18,20,22};
        dArr[0] = arr1;
        dArr[1] = arr2;

        for (int row1 = 0; row1 < dArr.length; row1++) {
            for (int col = 0; col < dArr[row1].length; col++) {
                System.out.print("$" + dArr[row1][col] + " ");
            }
            System.out.println();
        }



    }
}
