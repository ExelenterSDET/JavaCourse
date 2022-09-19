package Day29.Practice.SaturdayProject6Andrea;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {

   /*  Task 5
    Create a method that has two Arraylists of Strings as a parameter and return ArrayList of Strings

    take as first value for the new list the first value from the first list
    take as next value for the new list the first value from the second list
    take as next value for the new list the second value from the first list …
    until all values from both lists are in the new list.

            Example:
    Given two lists of same size,
    list1 = [“a”, “b”, “c”] and list2 = [“x”, “y”, “z”]

    result list should be = [“a”,”x”,”b”,”y”,”c”,”z”]

    Example:
    Given two lists of different size
    list1 = [“a”, “b”, “c”, “x”] and list2 = [“y”, “z”]

    result list should be = [“a”,”y”,”b”,”z”,”c”,”x”]
    */

    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>(Arrays.asList("a","b","c","x"));
        ArrayList<String> listB = new ArrayList<>(Arrays.asList("y","z"));
        System.out.println(alternateStrings(listA,listB));
    }

    static ArrayList<String> alternateStrings(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> newList = new ArrayList<>();
        int i = 0;
        for (i = 0; i < Math.min(list1.size(), list2.size()); i++) {
            newList.add(list1.get(i));
            newList.add(list2.get(i));
        }
        if (list1.size()>list2.size()){
            for (int j = list2.size(); j < list1.size(); j++) {
                newList.add(list1.get(j));
            }
        }
        else if (list1.size()<list2.size()) {
            for (int j = list1.size(); j < list2.size(); j++) {
                newList.add(list2.get(j));
            }
        }
        return newList;
    }
}
