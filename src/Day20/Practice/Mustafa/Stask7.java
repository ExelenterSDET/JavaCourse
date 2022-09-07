package Day20.Practice.Mustafa;

import java.util.Arrays;
import java.util.Random;

public class Stask7 {
    public static void main(String[] args) {
 /*Task7:
        1. Create an array with random length between 5 and 15.
        2. Generate random numbers between 0 and 3 and insert into an array.
        3. Print true if the first element and the last element are equal.
                Print false otherwise
        Example:
            [1, 2, 3] → false
                [1, 2, 3, 1] → true
                [1, 2, 1] → true
                [1] → true*/

        Random random = new Random();

        int [] arr = new int[random.nextInt(5,15)];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0,3);
        }
        System.out.println("arr = " + Arrays.toString(arr));


        boolean checkFirstLast = arr[0] == arr[arr.length-1];

        System.out.println("checkFirstLast = " + checkFirstLast);
    }
}
