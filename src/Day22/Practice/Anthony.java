package Day22.Practice;

import java.util.Arrays;

public class Anthony {
    /*
    // 1. Create a method which will take as a parameter int[] and print maximum number in the given array (name of the method - getMaxNum)
    // 2. Create a method which will take as a parameter int[] and print minimum number in the given array (name of the method - getMinNum)
    // 3. Create a method which will take as a parameter int[] and print total of all numbers in the array (name of the method - getTotal)
    // 4. Create a method which will take as a parameter String[] and print all Strings in the reversed order (name of the method - reversedArray)
     */

    public static void main(String[] args) {

        int[] numArray1 = {7, 22, 54, 83, 36};
        String str[] = {"hello", "world","java", "Love"};
        getMax(numArray1);
        getMin(numArray1);
        getTotal(numArray1);
        reverse(str);

    }
    static void getMax(int[] arr){
        int max1 = arr[0];
        for (int j : arr) {
            if (j > max1) {
                max1 = j;
            }
        }
        System.out.println("maxNum = " + max1);
    }
    static void getMin(int[] arr){
        int minNum = arr[0];
        for (int j : arr) {
            if (j < minNum) {
                minNum = j;
            }
        }
        System.out.println("minNum = " + minNum);
    }
    static void getTotal(int[] arr){
        int total = 0;
        for (int j : arr) {
            total += j;
        }
        System.out.println("Total = " + total);
    }
    static void reverse(String s[]){
        String [] t = new String[s.length];
        for (int i = 0; i < s.length; i++) {
            t[s.length-1-i] = s[i];
        }
        System.out.println("String reversed = " + Arrays.toString(t));
    }
}
