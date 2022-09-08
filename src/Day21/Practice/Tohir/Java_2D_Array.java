package Day21.Practice.Tohir;
import java.util.Arrays;


public class Java_2D_Array {
    public static void main(String[] args) {
        int rows = 2;
        int columns = 3;
        int[][] dArr = new int[rows][];
        int[] arr1 = {1, 22, 3, 5};
        int[] arr2 = {2, 3, 45, 65, 43, 12};
        dArr[0] = arr1;
        dArr[1] = arr2;
        for (int i = 0; i < dArr.length; i++) {
            for (int i1 = 0; i1 < dArr[i].length; i1++) {
                System.out.print(" " +dArr[i][i1]);

            }
            System.out.println("\nArrays.toString(dArr[i]) = " + Arrays.toString(dArr[i]));

        }
        int [][] dArr1 = new int[rows][columns];
        dArr1[0][0] = 1;
        dArr1[0][1] = 2;
        dArr1[1][0] = 4;
        dArr1[1][1] = 5;
        System.out.println("dArr1 = " +Arrays.deepToString(dArr1));
    }
}
