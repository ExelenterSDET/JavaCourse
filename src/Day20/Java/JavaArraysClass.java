package Day20.Java;

import java.util.Arrays;

public class JavaArraysClass {
    public static void main(String[] args) {

        int numArr[] =  new int [5];

        String s = Arrays.toString(numArr);
        System.out.println(s);

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = 10;
        }

        System.out.println(Arrays.toString(numArr));

        Arrays.fill(numArr, 15);

        System.out.println( Arrays.toString(numArr));

        Arrays.fill(numArr,1, numArr.length-2, 1);

        System.out.println( Arrays.toString(numArr));

        String strArr[] = new String[5];

        Arrays.fill(strArr, "Hello");
        System.out.println(Arrays.toString(strArr));
        Arrays.fill(strArr, 1, 4, "World");
        System.out.println(Arrays.toString(strArr));





    }
}
