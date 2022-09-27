package Day31.Practice.Ibrahim;


/*
    Create a method with parameter List of Lists of Integer and return type int.
    Print the max int.

    8:38 - 8:48

    Example: {{-1,-2,-3,-4,-5},{-2,-4,-6,-8,-10},{-3,-9,-18}} => result should be 18
     */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task1 {

    static int maxNumber(ArrayList<ArrayList<Integer>> a){
        int max = Integer.MIN_VALUE;
        for (ArrayList<Integer> integers : a) {
            max = max > Collections.max(integers) ? max : Collections.max(integers);
        }
        return  max;
    }

    public static void main(String[] args) {


        ArrayList<ArrayList<Integer>> listOfList = new ArrayList<>();


        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(-1,-2,-3,-4,-5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(-2,-4,-6,-8,-10));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(-3,-9,-18));

        listOfList.add(list1);
        listOfList.add(list2);
        listOfList.add(list3);

        System.out.println(maxNumber(listOfList));
    }
}
