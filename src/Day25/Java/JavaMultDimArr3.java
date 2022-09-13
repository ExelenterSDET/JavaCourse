package Day25.Java;

import java.util.Arrays;

public class JavaMultDimArr3 {

    public static void main(String[] args) {

        int[][] dArr = new int[3][3];
//        dArr[0][0] = 1;
//        dArr[0][1] = 2;

        dArr[0] = new int []{1}; //{0,0,0}
        dArr[1][0] = 2;
        dArr[1][1] = 4;
        dArr[2][0] = 3;
        dArr[2][1] = 6;

        System.out.println(Arrays.deepToString(dArr));

    }
}
