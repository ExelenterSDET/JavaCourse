package Day29.Practice;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SaturdayUfukTask9 {
/* Task 9
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
        int[] arr1 = {4,1,2,1,2};
        System.out.println("Input: nums = " + Arrays.toString(arr1));
        SaturdayUfukTask9 ut9 = new SaturdayUfukTask9();
        System.out.println("Output: "+ ut9.findOne(arr1));
    }

    int findOne(int[] arr){
        Arrays.sort(arr);
        ArrayList<Integer> listArr = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        // Convert integer array to a Arraylist<Integer>
        for (int i = listArr.size() - 1; i > 0; i--) {
            if (listArr.get(i).equals(listArr.get(i - 1))) {
                listArr.remove(i);
                --i;
                listArr.remove(i);
            }
        }
        int result = listArr.get(0);
        return result;
    }
}
