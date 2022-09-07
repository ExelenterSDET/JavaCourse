package Day20.Practice.Sebahattin;

import java.util.Arrays;
import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
/*        Task4:
        1. Create one int array with length of 10.
        2. Using Random class, generate random numbers between 0 and 20
        and fill all indexes of an array.
        3. Print the difference between the largest and smallest values in the array. (largest - smallest = difference)
                [10, 3, 5, 6, 8, 7, 5, 6, 8, 7] → 7 (observe 10-3 = 7)
*/
        int [] arr = new int[10];
        Random input = new Random();

        for (int j = 0; j < arr.length; j++) {
            arr[j] = input.nextInt(20);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

        int a = arr[0];
        int b = arr[9];
        int result = b-a ;
        System.out.println("result = "+arr[9]+" - "+arr[0]+" = "+result);
    }
}
