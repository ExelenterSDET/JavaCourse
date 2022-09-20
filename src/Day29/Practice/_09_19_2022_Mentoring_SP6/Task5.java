package Day29.Practice._09_19_2022_Mentoring_SP6;

import java.util.ArrayList;

public class Task5 {
    /*            Task 5
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

            result list should be = [“a”,”y”,”b”,”z”,”c”,”x”]*/

    static ArrayList<String> combineAlternatedStrings(ArrayList<String> list1, ArrayList<String> list2){
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < Math.max(list1.size(), list2.size()); i++) {
            if (list1.size() > list2.size()){
                result.add(list1.get(i));
                if (i < list2.size()){
                    result.add(list2.get(i));
                }
            }
            else {
                result.add(list2.get(i));
                if (i < list1.size()){
                    result.add(list1.get(i));
                }
            }
        }
        return result;
    }
}
