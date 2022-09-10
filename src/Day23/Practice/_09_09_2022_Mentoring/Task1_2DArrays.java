package Day23.Practice._09_09_2022_Mentoring;

import java.util.Arrays;
import java.util.Random;

public class Task1_2DArrays {

    /*Write a Java program to print an array after changing the rows and columns of a given two-dimensional array.

1)    2D Array should have random length btw 3 – 6 for both rows and columns
2)    Added elements should be generated randomly btw 0 – 100 in tens format 10, 20, 30, …

Original Array Example:
{{10 20 30},
{40 50 60}}  //length is 2;

After changing the rows and columns of the above array:
{{10 40},
{20 50},
{30 60}}
*/
    public static void main(String[] args) {

        Random rnd = new Random();

        int [][] n = new int[rnd.nextInt(3,6)][rnd.nextInt(3,6)];

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                n[i][j] = rnd.nextInt(10)*10;
            }
        }
//        System.out.println(Arrays.deepToString(n));
        for (int[] ints : n) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println();

        int [][] nFlip = new int[n[0].length][n.length];

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                nFlip[j][i] = n[i][j];
            }
        }

        for (int[] ints : nFlip) {
            System.out.println(Arrays.toString(ints));
        }
    }

}
