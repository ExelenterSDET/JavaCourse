package Day31.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task1 {

    /*
    Create a method with parameter List of Lists of Integer and return type int.
    Print the max int.

    8:38 - 8:48

    Example: {{-1,-2,-3,-4,-5},{-2,-4,-6,-8,-10},{-3,-9,-18}} => result should be 18
     */

    static int maxNum(ArrayList<ArrayList<Integer>> list){
        int max = Integer.MIN_VALUE;
        for (ArrayList<Integer> integers : list) {
            max = max > Collections.max(integers) ? max : Collections.max(integers);
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)));
        list.add(new ArrayList<Integer>(Arrays.asList(2,4,6,8,10)));
        list.add(new ArrayList<Integer>(Arrays.asList(2,3,4,5)));

        int i = maxNum(list);
        System.out.println(i);


    }
}
