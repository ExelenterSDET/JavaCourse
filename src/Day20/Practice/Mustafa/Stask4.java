package Day20.Practice.Mustafa;

import java.util.Arrays;
import java.util.Random;

public class Stask4 {
    public static void main(String[] args) {
 /*Task4:
        1. Create one int array with length of 10.
        2. Using Random class, generate random numbers between 0 and 20
        and fill all indexes of an array.
        3. Print the difference between the largest and smallest values in the array. (largest - smallest = difference)
                [10, 3, 5, 6, 8, 7, 5, 6, 8, 7] → 7 (observe 10-3 = 7)*/

        int[] arr = new int[10];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
        }
        Arrays.sort(arr);
        System.out.println("arr = " + Arrays.toString(arr));

        int diff = arr[arr.length-1] - arr[0];
        System.out.println(diff);
    }
}
