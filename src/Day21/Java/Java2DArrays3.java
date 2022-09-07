package Day21.Java;

import java.util.Arrays;

public class Java2DArrays3 {
    public static void main(String[] args) {

        int[][] dArr = new int[3][5];

        for (int row = 0; row < dArr.length; row++) {
            for (int col = 0; col < dArr[row].length; col++) {
                dArr[row][col] = row;
            }
        }

        System.out.println(Arrays.deepToString(dArr));

    }
}
