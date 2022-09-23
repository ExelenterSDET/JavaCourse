package Day33.Practice.Andrea;

import java.util.ArrayList;
import java.util.Arrays;

public class Mentoring {

    //Task 9 Random Array
    public static void main(String[] args) {

        Integer[] arr = {5,5,4,1,2,1,2,3,3};
        Integer[] arr1 = {2,2,1};
        Integer[] arr2 = {1};
        Integer[] arr3 = {6,4,1,2,1,2,3,3,5};
        Integer[] arr4 = {8,6,4,1,2,2,3,5,7,9};

        System.out.println(findUnique(arr));


    }

    static ArrayList<Integer> findUnique(Integer[] nums){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(nums));
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            list.removeIf(n -> n != value);
            if (list.size() == 1){
                uniqueList.add(list.get(0));
            }
            list = new ArrayList<>(Arrays.asList(nums));
        }
        return uniqueList;

    }
}
