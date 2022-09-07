package Day20.Practice;

import java.util.Arrays;

public class AnthonyTASKS {
    public static void main(String[] args) {

        int numArr []= new int[5];

        String s = Arrays.toString(numArr);
        System.out.println(s);

        for (int i = 0; i <numArr.length ; i++) {
            numArr[i] = 10;

        }
        System.out.println(Arrays.toString(numArr));

        Arrays.fill(numArr,15);
        System.out.println(Arrays.toString(numArr));
        Arrays.fill(numArr,1,numArr.length-2,1);
        System.out.println(Arrays.toString(numArr));

        String strArr[] = new String[5];
        System.out.println(Arrays.toString(strArr));
        Arrays.fill(strArr,1,3,"world");
        System.out.println(Arrays.toString(strArr));

        System.out.println("-----------------------------------------------------------------------------");

        int arr2[] = {1,3,5,7,9};
        int arr3[] = arr2;

        System.out.println(" = "+ Arrays.toString(arr3));
        System.out.println("arr2 = " + Arrays.toString(arr2));

        System.out.println("-----------------------------------------------------------------------------");

        int arr4[] = {3,4,1,0,100,-1,-5,5000,2,10};

        Arrays.sort(arr4);

        System.out.println(Arrays.toString(arr4));

        System.out.println("-----------------------------------------------------------------------------");

        int arr5[] = {1,3,5,6,7,9};
        int arr6[] = {1,3,5,6,7,9};
        int arr7[] = arr5;

        System.out.println(arr5==arr6);
        System.out.println(arr5==arr7);

        boolean equals = Arrays.equals(arr5, arr6);
        System.out.println(equals);

        System.out.println("-----------------------------------------------------------------------------");

        int num[] = {1,3,5,7,9};

        //Arrays.binarySearch only if arrray is sorted and has no duplicates

        int i = Arrays.binarySearch(num,50);
        System.out.println("i = " + i);
    }
}
