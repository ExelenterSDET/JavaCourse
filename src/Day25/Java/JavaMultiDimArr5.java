package Day25.Java;

import java.util.Arrays;

public class JavaMultiDimArr5 {
    public static void main(String[] args) {

        int[][] dArr = new int[3][3];

        for (int row = 0; row < dArr.length; row++) {
            for (int column = 0; column < dArr[row].length; column++) {
                dArr[row][column] = row;
            }
        }

        System.out.println(Arrays.deepToString(dArr));



    }
}
