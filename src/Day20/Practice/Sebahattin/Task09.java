package Day20.Practice.Sebahattin;

import java.util.Arrays;

public class Task09 {
    public static void main(String[] args) {
/*Task9.
        Given an array of [6,5,2,7,9,1,3,8,6,2,1,3,7,9,9]
        1. Sort an array. output should be [1, 1, 2, 2, 3, 3, 5, 6, 6, 7, 7, 8, 9, 9, 9]
        2. Remove all duplicates from the array and print.
        output should be [1, 2, 3, 4, 5, 6, 7, 8, 9]
*/
        int []array = {6,5,2,7,9,1,3,8,6,2,1,3,7,9,9};
        Arrays.sort(array);
        int []array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]){
                    counter = 1;
                    break;
                }
            }
            if (counter == 0){
                array2[i] =  array[i];
            }
        }
        String str = Arrays.toString(array2);
        String str1 = str.replaceAll("[0,]","");
        System.out.println(str1);
    }
}
