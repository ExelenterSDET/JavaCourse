package Day20.Practice.Mustafa;

import java.util.Arrays;
import java.util.Random;

public class Stask5 {
    public static void main(String[] args) {
        /*Task5:
        Create a char array
        The array has a random length between 2 and 22 (inclusive)
                The array should only have random capital letters.
                Print the array.*/



        Random random = new Random();
        char arr [] = new char[random.nextInt(2,22)];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char)random.nextInt(65,90);

        }
        System.out.println(Arrays.toString(arr));

    }
}
