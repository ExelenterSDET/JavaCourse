package Day20.Practice.Sebahattin;

import java.util.Arrays;
import java.util.Random;

public class Task07 {
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
            [1] → true
 */
        Random input = new Random();
        int x = input.nextInt(5,15+1);

        int []num = new int[x];
        for (int i = 0; i < x; i++) {
            num[i] = input.nextInt(0,3+1);
        }
        System.out.println( num[0] == num[x-1]? Arrays.toString(num) + "---> TRUE"
                :Arrays.toString(num) + " ---> FALSE");
    }
}
