package Day29.Practice.Ibrahim.Saturday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/*
Task 7
            Create a method that has an Arraylists of Integer as a parameter.

            Remove all duplicates and return new ArrayList of Integer

            Example:
            [1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1]

            output should be:
            [1,2,3,4,5,6]
 */
public class Task7 {

    static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list){
        list.sort(null);

        for (int i = 0; i < list.size(); i++) {
            for (int i1 = i+1; i1 < list.size(); i1++) {
                if (list.get(i) == list.get(i1)){
                    list.remove(i);
                    i1--;
                }
            }
        }
        System.out.println(list);
        return list;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1));

        removeDuplicates(list);

    }
}
