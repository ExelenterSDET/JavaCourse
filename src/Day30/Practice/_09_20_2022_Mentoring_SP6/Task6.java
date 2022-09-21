package Day30.Practice._09_20_2022_Mentoring_SP6;

import java.util.ArrayList;
import java.util.Arrays;

public class Task6 {
    /*            Task 6
            Create a void method that has an Arraylists of Integer as a parameter

            Count how many each Integer object repeats. Print the result.

            Example:
            [1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1]

            output should be:
            1 = 3; 2 = 2; 3 = 2, 4 = 2, 5 = 2, 6 = 1;
            */

    static void countOfIntegersInList(ArrayList<Integer> list) {

        while (list.size() >= 1) {
            ArrayList<Integer> copy = new ArrayList<>(list);
            int value = list.get(0);
            int counter;
            list.removeIf(listElement -> listElement == value);
            counter = copy.size() - list.size();
            System.out.print(value + " = " + counter + ";  "); // for(int i =0; i < len; i++)
        }
    }

    static void countOfIntegersInList2(ArrayList<Integer> list) {
        int[] arr = new int[1000];

        for (Integer value : list) {  // list.get(i)
            arr[value] += 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.print(i + " = " + arr[i] + ";  ");
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> iList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1));
        countOfIntegersInList(iList);
        System.out.println();
        ArrayList<Integer> iList2 = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1));
        countOfIntegersInList2(iList2);
    }

}
