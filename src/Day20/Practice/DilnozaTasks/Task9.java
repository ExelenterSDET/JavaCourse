package Day20.Practice.DilnozaTasks;

import java.util.Arrays;

public class Task9 {
     /*
      Task9.
    Given an array of [6,5,2,7,0,1,3,8,6,2,1,3,7,9,0]
            1. Sort an array. output should be [0, 0, 1, 1, 2, 2, 3, 3, 5, 6, 6, 7, 7, 8, 9]
            2. Remove all duplicates from the array and print.
    output should be [1, 2, 3, 4, 5, 6, 7, 8, 9]
     */

    public static void main(String[] args) {
        int numArray[] = {6, 5, 2, 7, 0, 1, 3, 8, 6, 2, 1, 3, 7, 9, 0};
        Arrays.sort(numArray);
        int len = numArray.length;
        int  temp[]  =new int[numArray.length];
        int j =0;
        System.out.println("Sorted numArray = " + Arrays.toString(numArray));
        for (int i = 0; i < len-1; i++) {
            if (numArray[i]!= numArray[i+1]) {
                temp[j++] =numArray[i];
            }
        }
        temp[j++]= numArray[len-1];

        for (int k = 0; k <j; k++) {
            System.out.print( temp[k]+", ");
        }
        System.out.println();

    }
}

