package Day20.Practice;

import java.util.Arrays;

public class Andrea {
    public static void main(String[] args) {

       int numArr[] = new int [5];
       String s = Arrays.toString(numArr);
       System.out.println("s = " + s);

       for (int i = 0; i <numArr.length; i++) {
            numArr[i] = 10;
       }
       System.out.println(Arrays.toString(numArr));

       Arrays.fill(numArr, 15);
       System.out.println(Arrays.toString(numArr));

       Arrays.fill(numArr, 1, numArr.length-2, 1);
       System.out.println(Arrays.toString(numArr));

       String strArr[] = new String[5];

       Arrays.fill(strArr, "Hello");
       Arrays.fill(strArr, 1, 4, "World");

       System.out.println(Arrays.toString(strArr));

       int arr[] = {1,3,5,7,9};
       int arr2[] = arr;

       System.out.println(Arrays.toString(arr));
       System.out.println(Arrays.toString(arr2));

       arr2[0] = 100;
       arr2[1] = 1000;

        //when you change arr2, it also updates arr because they are referencing the same store
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        //this will keep the 2 arrays separate:
        int arr3[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = arr[i];

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr3));

        arr3[0] = 100;
        arr[0] = 5;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr3));

        //this will not affect the value of array3:
        int arr4[] = Arrays.copyOf(arr3, arr3.length);
        System.out.println(Arrays.toString(arr4));
        arr4[0] = 1;

        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));

        int arr5[] = {3,5,1,0,100,-1,-5,5000,2,10};
        Arrays.sort(arr5);
        System.out.println(Arrays.toString(arr5));

        int arrRev[] = new int [arr.length];
        for (int i = arr5.length - 1, j = 0; i >= 0; i--, j++) {

        }

        int arr6[] = {1,3,5,7,9};
        int arr7[] = {1,3,5,7,9};
        int arr8[] = arr6;
        System.out.println(arr6);
        System.out.println(arr7);
        System.out.println(arr8);
        System.out.println(arr6==arr7);
        System.out.println(arr6==arr8);

        boolean equals = Arrays.equals(arr6,arr8);
        System.out.println("equals = " + equals);

        //use binarySearch only if array is sorted and has no duplicates
        int num[] = {1,3,5,7,9};
        int i = Arrays.binarySearch(num,9);
        System.out.println("i = " + i);
    }
    }




