package Day21.Practice._09_07_2022_Mentoring;

import java.util.Arrays;

public class SP4_Task9 {

            /*Task9.
        Given an array of [6,5,2,7,9,1,3,8,6,2,1,3,7,9,9]
        1. Sort an array. output should be [1, 1, 2, 2, 3, 3, 5, 6, 6, 7, 7, 8, 9, 9, 9]
        2. Remove all duplicates from the array and print.
        output should be [1, 2, 3, 4, 5, 6, 7, 8, 9]
        */

    public static void main(String[] args) {

        int [] arr = {6, 5, 2, 7, 9, 1, 3, 8, 6, 2, 1, 3, 7, 9, 9};
        String noDuplicates = "";

        Arrays.sort(arr);

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i+1]){
                noDuplicates += arr[i];
            }
            if (i+1 == arr.length-1){
                noDuplicates += arr[arr.length-1];
            }
        }
        String [] noDupArr = noDuplicates.split("");
        System.out.println("noDupArr = " + Arrays.toString(noDupArr));
    }
}
