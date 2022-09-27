package Day34.Practice.Sebahattin_Homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Task01 {
/*
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
    public static void main(String[] args) {
        int []num = new int[10];
        int numbers[]=randomNumber(num);
        System.out.println(Arrays.toString(num));
        HashMap<Integer, Integer> repeats = getRepeatsNumber(numbers);
        System.out.println(repeats);
}
    static int[] randomNumber (int[] num){
        for (int i = 0; i < num.length; i++) {
            Random rndm = new Random();
            int number = rndm.nextInt(10,20);
            num[i] = number;
        }
        return num;
    }
    static HashMap<Integer, Integer> getRepeatsNumber (int[] numbers){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.computeIfAbsent(numbers[i], k -> 0);
            map.computeIfPresent(numbers[i], (k, v) -> v += 1);
        }
        return map;
    }
}
