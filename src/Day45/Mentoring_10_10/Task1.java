package Day45.Mentoring_10_10;

import java.util.Arrays;
import java.util.Random;

/*
1. add random number between 0 to 20   to the arr[] which size is 10;
2. reverse the arr[].
3. sort the arr[] in ascending order (at least 2 approaches)
4. sort the arr[] in descending order (at least 2 approaches)*/
public class Task1 {
    static int[] randomNumber(int length){

        int[] randomArr = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = rnd.nextInt(0, 21);
        }
        return randomArr;
    }
    static int[] reverse(int[] arr){

        int[] newArr = new int[arr.length];

        for (int i = arr.length-1; i >=0; i--) {
            newArr[arr.length -1-i] = arr[i];
        }
        return newArr;
    }

    static int[] reverse2(int[] arr){

        for (int i = 0; i < arr.length/2; i++) {
            for (int j = arr.length-1 - i; j >= 0 ; j--) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                break;
            }
        }
        return arr;
    }

    static int [] ascendingSort1(int [] arr ){
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = -1;
            }

        }
        return arr;
    }
    static int [] ascendingSort2(int [] arr ){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    static int [] descendingSort(int [] arr ){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] ints = randomNumber(10);
        System.out.println(Arrays.toString(ints));

        int[] reverse = reverse2(ints);
        System.out.println(Arrays.toString(reverse) + " ->reverse");

        int[] ints1 = ascendingSort2(reverse);
        System.out.println(Arrays.toString(ints1) + " ->ascending");

        int[] ints2 = descendingSort(reverse);
        System.out.println(Arrays.toString(ints2) + " ->descending");
    }
}
