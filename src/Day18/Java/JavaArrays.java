package Day18.Java;

import java.util.Arrays;

public class JavaArrays {
    /*
    Java array is an object which contains elements of a similar data type.
    It is a data structure where we store similar elements.
    We can store only a fixed set of elements in a Java array.
    Array in Java is index-based, the first element of the array is stored at the 0th index,
    2nd element is stored on 1st index and so on.
     */
    public static void main(String[] args) {

        int numberArr[] = new int[3];

        System.out.println("Arrays.toString(numberArr) = " + Arrays.toString(numberArr));

        String strArr[] = new String[3];

        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));

        boolean blArr[] = new boolean[3];

        System.out.println("Arrays.toString(blArr) = " + Arrays.toString(blArr));

        double dbArr[] = new double[3];
        System.out.println("Arrays.toString(dbArr) = " + Arrays.toString(dbArr));

        int iArr[];
        iArr = new int[2];

    }
}
