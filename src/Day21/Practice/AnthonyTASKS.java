package Day21.Practice;

import java.util.Arrays;
import java.util.Random;

public class AnthonyTASKS {
    public static void main(String[] args) {

        String[] names = {"Michael", "John", "Jim"};
        String[] lastNames = {"Jordan", "Travolta", "Carrey"};

        /*
        1. Initailiza 2DArray
        2. Print without for loop
        Michael Jordan
        John Travolta
        Jim Carrey
         */

        String[][] dArr = new String[2][];
        dArr[0] = names;
        dArr[1] = lastNames;
//
//        System.out.print(dArr[0][0] + " " + dArr[1][0]);
//        System.out.print(dArr[0][1] + " " + dArr[1][1]);
//        System.out.print(dArr[0][2] + " " + dArr[1][2]);


//        //for loop
//        for (int i = 0; i < dArr[0].length; i++) {
//            System.out.println(dArr[0][i] + " " + dArr[1][i]);
//            }
//        }

        for (int i = 0; i <dArr[0].length ; i++) {

            for (int j = 0; j <1 ; j++) {
                System.out.println(dArr[j][i] + " " + dArr[j+1][i]);
            }

        }
           /*
    Create an int 2D array. length of rows is 4,  length of columns is 3
    using random class, assign values to each element between 0and 10
     */


        int[][] arr = new int[4][5];
        //{{1,5,4},{0,1,2},{2,5,0},{1,2,5}}

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);

            }

        }
        System.out.println(Arrays.deepToString(arr));

        int[] totals = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int total = 0;
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];

            }
            totals[i] = total;
        }
        System.out.println(Arrays.toString(totals));
    }
}
