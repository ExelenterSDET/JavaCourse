package Day46.Mentoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

// non-empty array of Integers, every element is repeating except one number, return that number;
// {1, 2 ,5 ,2 ,1}==5
// {1, 2, 2}  =====1
public class Task3 {

    static int singleNumber(int[]arr){
        // {1, 2 ,5 ,2 ,1}

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])){
                set.remove(arr[i]);
            }else {
                set.add(arr[i]);
            }
        }
        for (Integer eachSet:set) {
            return eachSet;
        }
        return -1;
    }
}
