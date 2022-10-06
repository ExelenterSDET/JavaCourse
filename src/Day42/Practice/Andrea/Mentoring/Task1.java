package Day42.Practice.Andrea.Mentoring;

import java.util.Arrays;

public class Task1 {

//    Rotate array in Java
//    Rotate an array of n elements to the right by k steps. For example, with
//    n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

    static int[] rotate (int[] arr, int k){
        int[] newArr = new int[arr.length];
        for (int i = 0; i < k; i++) {
            newArr[i] = arr[arr.length-k + i];
        }

        int j = 0;

        for (int i = k; i < newArr.length; i++) {
            newArr[i] = arr[j];
            j++;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] rotate = rotate(arr, 3);
        int[] rotRev = rotateReverse(arr, 3);
        System.out.println(Arrays.toString(rotate));
        System.out.println(Arrays.toString(rotRev));
    }

    static int[] rotate2 (int[] arr, int k){

        for (int i = 0; i <k ; i++) {

            for (int j = arr.length-1; j > i ; j--) {

                int tem = arr[j];
                arr[j]= arr[j-1];
                arr[j-1] = tem;
            }
        }
        return arr;
    }

    static int[] rotateReverse2 (int[] arr, int k){
        for (int i = 0; i <k ; i++) {

            for (int j = arr.length-1; j > i ; j--) {

                int tem = arr[j];
                arr[j]= arr[j-1];
                arr[j-1] = tem;
            }
        }
        return arr;
    }

    static int[] rotateReverse (int[] arr, int k){

        int[] newArr = new int[arr.length];

        //
        for (int i = 0; i < k ; i++) {
            newArr[i] = arr[arr.length - i- 1];
        }

        int j = 0;

        for (int i = k; i < newArr.length; i++) {
            newArr[i] = arr[j];
            j++;
        }
        return newArr;
    }


}
