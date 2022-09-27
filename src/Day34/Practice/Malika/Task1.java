package Day34.Practice.Malika;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {
                    //TASK1
        /* Create a method with the parameter List of Lists of Integer and return type int.
        Print the max int. */

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<Integer>(Arrays.asList(1,2,5,66,8,7)));
        list.add(new ArrayList<Integer>(Arrays.asList(2,8,5,7,55,3)));
        list.add(new ArrayList<Integer>(Arrays.asList(10,20,25,45,18,36)));

        int i = maxNum(list);
        System.out.println(i);
    }
    static int maxNum(ArrayList<ArrayList<Integer>> list){
        int max = Integer.MIN_VALUE;
        for (ArrayList<Integer> integers : list) {
            max = max> Collections.max(integers) ? max : Collections.max(integers);
        }
        return max;
    }
    }

