package Day21.Practice._09_07_2022_Mentoring;

import java.util.Arrays;
import java.util.Random;

public class SP4_Task7 {
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

    public static void main(String[] args) {
        Random rnd = new Random();
        int [] numbers = new int[rnd.nextInt(5, 15)]; // ((max - min + 1) +min)

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(4);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0] == numbers[numbers.length-1]);
    }
}
