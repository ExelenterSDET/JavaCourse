package Day30.Practice._09_20_2022_Mentoring_SP6;

import java.util.ArrayList;
import java.util.Arrays;

public class Task7 {
    /*/*            Task 7
            Create a method that has an Arraylists of Integer as a parameter.

            Remove all duplicates and return new ArrayList of Integer

            Example:
            [1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1]

            output should be:
            [1,2,3,4,5,6]*/

    static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<>();

        while (list.size() >=1){
            int value = list.get(0);
            list.removeIf(listElement -> listElement == value);
            newList.add(value);
        }
        return newList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1));
        System.out.println(removeDuplicates(list));
    }
}
