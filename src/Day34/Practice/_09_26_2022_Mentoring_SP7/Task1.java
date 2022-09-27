package Day34.Practice._09_26_2022_Mentoring_SP7;

import java.util.HashMap;
import java.util.Random;

public class Task1 {
        /*   Task 1

        1. Create a method which will return int[]. Parameter is int (n).
           The length of array is n.
           Using Random class, assign to each index of array a random number between 10 and 20.

        2. Create a method which will return a HashMap.
           Parameter will be int[].

           Return how many times each int of array repeats.

           Example:
           [10,11,12,13,10,11,12,13]

           Result:
           10 = 2; 11=2, 12=2, 13=2
           */
    static int [] randomArray(int n){
        Random rnd = new Random();
        int [] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rnd.nextInt(10, 20);
        }
        return nums;
    }

    static HashMap <Integer, Integer> countIntegers(int [] nums){
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.computeIfAbsent(num, k -> 0);
            map.computeIfPresent(num, (k, v) -> v+1);
        }
        return map;
    }

    public static void main(String[] args) {
        int [] nums = randomArray(5);
        System.out.println(countIntegers(nums));
    }
}
