package Day20.Practice.Sebahattin;

import java.util.Arrays;
import java.util.Random;

public class Task05 {
    public static void main(String[] args) {
/*        Task5:
        Create a char array
        The array has a random length between 2 and 22 (inclusive)
                The array should only have random capital letters.
                Print the array.
*/
        Random input = new Random();
        int x = input.nextInt(2,23);
        char ch[] = new char[x];

        for (int i = 0; i < x; i++) {
            ch[i] = (char) input.nextInt(65,91);
        }
        System.out.println(Arrays.toString(ch));
    }
}
