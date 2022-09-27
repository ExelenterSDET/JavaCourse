package Day34.Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class SaturdayProjectMehmetAliTask01 {
    /*
    Task 1
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
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length number of the list: ");
        int n = scan.nextInt();
//        list(n);
        hashMap(list(n));
    }
    static int[] list(int n) {
        int[] list = new int[n];
        Random rn = new Random();
        for (int i = 0; i < list.length; i++) {
            list[i] = rn.nextInt(10, 20);
        }
        System.out.println(Arrays.toString(list));
        return list;
    }
    static HashMap<Integer, Integer> hashMap(int[] list) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.length; i++) {
            map.put(list[i], map.getOrDefault(list[i], 0) + 1);
        }
        System.out.println(map);
        return map;
    }
}