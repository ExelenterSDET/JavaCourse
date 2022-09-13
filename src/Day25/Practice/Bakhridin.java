package Day25.Practice;

import java.util.Arrays;

public class Bakhridin {
    public static void main(String[] args) {
        int [][] array1 = new int[][] {{1,2},{3,4},{5,6}};
        int [][] array2 = {{11,12},{13,14},{15,16}};

        int [][] array3 = new int[3][2];
        array3[0][0] = 21 ;
        array3[0][1] = 22 ;
        array3[1][0] = 23 ;
        array3[1][1] = 24 ;
        array3[2][0] = 25 ;
        array3[2][1] = 26 ;

        System.out.println("Array 1 --> "+ Arrays.deepToString(array1));
        System.out.println("Array 2 --> "+Arrays.deepToString(array2));
        System.out.println("Array 3 --> "+Arrays.deepToString(array3));

        int [][]array4 = new int[3][2];
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                System.out.print((array4[i][j]=i)+" ");
            }
        }
        System.out.println();
        System.out.println(Arrays.deepToString(array4));

        array4[0] = new int[]{5,5};
        System.out.println(Arrays.deepToString(array4));
    }
}
