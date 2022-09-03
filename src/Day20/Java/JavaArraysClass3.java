package Day20.Java;

import java.util.Arrays;

public class JavaArraysClass3 {
    public static void main(String[] args) {

        int arr[] = {3,5,1,0,100,-1,-5,5000,2,10};

        Arrays.sort(arr);

        int arrRev[] = new int [arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            arrRev[j] = arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrRev));

    }
}
