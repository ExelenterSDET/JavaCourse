package Day31.Practice.Andrea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task1 {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();


        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5555));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3,6,7,4,2,66));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(100,200,300,400,505));

        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);

        System.out.println(maxInt(listOfLists));
    }

    static int maxInt (ArrayList<ArrayList<Integer>> list){
        int max = Integer.MIN_VALUE;
        for (ArrayList<Integer> integers : list) {
            max = Collections.max(integers);

        }
        return max;
        }

    }
