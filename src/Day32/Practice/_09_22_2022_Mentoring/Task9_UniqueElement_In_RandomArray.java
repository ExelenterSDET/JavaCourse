package Day32.Practice._09_22_2022_Mentoring;

import java.util.ArrayList;
import java.util.Arrays;

public class Task9_UniqueElement_In_RandomArray {

    public static void main(String[] args) {

        Integer[] arr = {5, 5, 4, 1, 2, 1, 2, 3, 3};
        Integer[] arr1 = {2, 2, 1};
        Integer[] arr2 = {1};
        Integer[] arr3 = {6, 4, 1, 2, 1, 2, 3, 3, 5};
        Integer[] arr4 = {8, 6, 4, 1, 2, 2, 3, 5, 7, 9};

        System.out.println(findUniqueNumber(arr3));
    }

    static ArrayList<Integer> findUniqueNumber(Integer [] nums){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(nums));
        ArrayList<Integer> uniqueNumbersList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            list.removeIf(n -> n != value);
            if (list.size() == 1){
                uniqueNumbersList.add(list.get(0));
            }
            list = new ArrayList<>(Arrays.asList(nums));
        }
        return uniqueNumbersList;
    }
}
