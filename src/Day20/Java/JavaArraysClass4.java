package Day20.Java;

import java.util.Arrays;

public class JavaArraysClass4 {

    public static void main(String[] args) {

        int arr[] = {1,3,5,7,9};
        int arr2[] = {1,3,5,7,9};
        int arr3[] = arr;

        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(arr3);
        System.out.println(arr==arr2); // true // false
        System.out.println(arr==arr3); // true  // true

        boolean equals = Arrays.equals(arr, arr2);
        System.out.println(equals);


    }
}
