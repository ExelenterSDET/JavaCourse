package Day21.Practice._09_07_2022_Mentoring;

import java.util.Arrays;
import java.util.Random;

public class SP4_Task5 {

            /*Task5:
        Create a char array
        The array has a random length between 2 and 22 (inclusive)
        The array should only have random capital letters.
        Print the array.*/

    public static void main(String[] args) {

        Random rnd = new Random();
        char [] chars = new char[rnd.nextInt(2, 23)]; // ((max - min + 1) +min)

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) rnd.nextInt(65, 91);
            chars[i] = (char) (rnd.nextInt(26) + 'A'); // 17 + 65
        }

        System.out.println(Arrays.toString(chars));
    }

}
