package Day25.Java;

import java.util.Arrays;

public class JavaMultiDimentionalArr2 {

    public static void main(String[] args) {
        int[][] dArr;
        dArr = new int[3][]; // column length is optional.

        int[] a = {1,3,5,7,9}; // length => 5
        int[] b = {2,4,6,8,10,12,14,16,18,20,22,24,26}; // 13
        int[] c = {0,5,10,15,20,25,30,35}; // 8
        dArr[0] = a;
        dArr[1] = b;
        dArr[2] = c;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.deepToString(dArr));

    }
}
