package Day20.Practice.Sebahattin;

import java.util.Arrays;

public class Examples {
    public static void main(String[] args) {


    int numArr[] =  new int [5];
    String s = Arrays.toString(numArr);

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
        System.out.println("-------------------");

        int arr[] = {1,3,5,7,9};
        int arr2[] = arr;

        System.out.println("arr =>" + Arrays.toString(arr));
        System.out.println("arr2 =>" + Arrays.toString(arr2));

        arr2[0] = 100;
        arr2[1] = 1000;

        System.out.println("arr =>" + Arrays.toString(arr));
        System.out.println("arr2 =>" + Arrays.toString(arr2));
        System.out.println("---------------------------");

        int array[] = {3,5,1,0,100,-1,-5,5000,2,10};
        Arrays.sort(array);

        int arrRev[] = new int [array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            arrRev[j] = array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrRev));
        System.out.println("----------------------");

         int num[] = {1,3,5,7,9 };
        int i = Arrays.binarySearch(num, 7);
        System.out.println("i = " + i);
    }
}
