package Day29.Practice.DilnozaSP;

import java.util.Arrays;

public class Task9 {
    /*

          Task 9

          Create a method that has an int[] as parameter.
          Every element in the array appears twice except for one.
          Find that single one and return.

           Example s:
           Input: nums = [2,2,1]
           Output: 1

           Input: nums = [4,1,2,1,2]
           Output: 4

           Input: nums = [1]
           Output: 1
    */
    public static void main(String[] args) {
        Task9 t9 = new Task9();
        int[] nums = new int[]{4, 1, 2, 5, 1, 2, 4, 5, 3};// How do I get the last index?
        int single = t9.findSingle(nums);
        System.out.println("single = " + single);
    }

    int findSingle(int[] numbers) {
        Arrays.sort(numbers);
        int output=0;
        for (int i = 0; i < numbers.length-1; i++) {
            output=numbers[i]!=numbers[i+1]?1:0;
        }

        return output;
    }

}
