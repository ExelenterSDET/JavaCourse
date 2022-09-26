package Day34.Practice.SaturdayProject7Andrea;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Task1 {

//    Task 1
//
//            1. Create a method which will return int[]. Parameter is int (n).
//    The length of array is n.
//    Using Random class, assign to each index of array a random number between 10 and 20.
//
//            2. Create a method which will return a HashMap.
//    Parameter will be int[].
//
//    Return how many times each int of array repeats.
//
//    Example:
//            [10,11,12,13,10,11,12,13]
//
//    Result:
//            10 = 2; 11=2, 12=2, 13=2

    public static void main(String[] args) {
        int n = 10;
        int[] arr1 = getRandomNumberArray(n);
        System.out.println(Arrays.toString(arr1));
        System.out.println(getDuplicateCount(arr1));
    }

    static int[] getRandomNumberArray (int n){
        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10, 20);
        }
        return arr;
    }
    static HashMap<Integer, Integer> getDuplicateCount (int[] numbers){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int number : numbers) {
            map.computeIfAbsent(number, k -> 0);
            map.computeIfPresent(number, (k, v) -> v += 1);
        }
        return map;
    }


}
