package Day23.Practice;

import java.util.Arrays;

public class Furkat {
    // 1. Create a method which will take as a parameter int[] and print maximum number in the given array (name of the method - getMaxNum)
    // 2. Create a method which will take as a parameter int[] and print minimum number in the given array (name of the method - getMinNum)
    // 3. Create a method which will take as a parameter int[] and print total of all numbers in the array (name of the method - getTotal)
    // 4. Create a method which will take as a parameter String[] and print all Strings in the reversed order (name of the method - reversedArray)

    public static void main(String[] args) {

        int[] arr = {2,4,8,20,6,6,5,7,15};
        Furkat furkat = new Furkat();
        furkat.maxNumber(arr);
        furkat.minNumber(arr);
        furkat.totalNumber(arr);

        String[] strArr = {"dog", "mouse", "cat", "cow", "lion", "tiger"};
        furkat.reverseArray2(strArr);
        furkat.reverseArray(strArr);

    }

    void maxNumber(int[] arr){
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }

    void minNumber(int[] arr){
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }

    void totalNumber(int[] arr){
        int total = 0;
        for (int i : arr) {
            total+=i;
        }
        System.out.println(total);
    }

    void reverseArray(String[] arr){
        for (int i = 0, j = arr.length-1; i < j; i++, j--) {
            String tempStorage = arr[i];
            arr[i] = arr[j];
            arr[j] = tempStorage;
        }
        System.out.println(Arrays.toString(arr));
    }

    void reverseArray2(String[] arr){
        String [] reversedArray = new String[arr.length];
        for (int i = 0, j = arr.length-1; i < arr.length; i++, j--) {
            reversedArray[i] = arr[j];
        }
        System.out.println(Arrays.toString(reversedArray));
    }
}
