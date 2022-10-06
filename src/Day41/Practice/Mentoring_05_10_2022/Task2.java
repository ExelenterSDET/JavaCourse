package Day41.Practice.Mentoring_05_10_2022;

import java.util.Arrays;
import java.util.HashSet;

public class Task2 {
    /*

    Given an integer array nums, return true if any value appears at least twice in the array,
    and return false if every element is distinct

        */

    static Boolean repeated (int [] arr){


        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    static Boolean repeated2 (int [] arr){

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i <arr.length ; i++) {
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
        }

        return false;
    }
    static Boolean repeated3 (int [] arr){

        Arrays.sort(arr);
        // 1 1 2 4 5

        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i] == arr[i+1]){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        Boolean repeated = repeated3(arr);
        System.out.println(repeated);
    }

}
