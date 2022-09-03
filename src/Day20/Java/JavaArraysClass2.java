package Day20.Java;

import java.util.Arrays;

public class JavaArraysClass2 {
    public static void main(String[] args) {

        int arr[] = {1,3,5,7,9};
        int arr2[] = arr;

        System.out.println("arr =>" + Arrays.toString(arr));
        System.out.println("arr2 =>" + Arrays.toString(arr2));

        arr2[0] = 100;
        arr[1] = 1000;

        System.out.println("arr =>" + Arrays.toString(arr));
        System.out.println("arr2 =>" + Arrays.toString(arr2));

        arr[0] = 10;
        System.out.println("arr =>" + Arrays.toString(arr));
        System.out.println("arr2 =>" + Arrays.toString(arr2));

        int arr3[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = arr[i];
        }


        System.out.println("arr =>" + Arrays.toString(arr));
        System.out.println("arr3 =>" + Arrays.toString(arr3));

        arr3[0] = 555;
        arr3[3] = 777;

        System.out.println("arr =>" + Arrays.toString(arr));
        System.out.println("arr3 =>" + Arrays.toString(arr3));

        int arr4[] = Arrays.copyOf(arr3, arr3.length);
        System.out.println("arr4 =>" + Arrays.toString(arr4));

        int arr5[] = Arrays.copyOf(arr3, 2);
        System.out.println("arr5 =>" + Arrays.toString(arr5));

        int arr6[] = Arrays.copyOfRange(arr3,1, 3);
        System.out.println("arr6 =>" + Arrays.toString(arr6));

    }
}
