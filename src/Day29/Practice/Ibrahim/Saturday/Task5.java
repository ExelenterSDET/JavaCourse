package Day29.Practice.Ibrahim.Saturday;

import java.util.ArrayList;
import java.util.Arrays;

/*
Task 5
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
public class Task5 {

    static ArrayList<String> combinedlist(ArrayList<String> list1, ArrayList<String> list2){
        ArrayList<String> combined = new ArrayList<>();

       if (list1.size() >= list2.size()){
           for (int i = 0; i < list2.size(); i++) {
               combined.add(list1.get(i));
               combined.add(list2.get(i));
           }
           for (int i = list2.size(); i < list1.size(); i++) {
               combined.add(list1.get(i));
           }
       }else{
           for (int i = 0; i < list1.size(); i++) {
               combined.add(list1.get(i));
               combined.add(list2.get(i));
           }
           for (int i = list1.size(); i < list2.size(); i++) {
               combined.add(list2.get(i));
           }
       }
        return combined;
    }

    public static void main(String[] args) {
        ArrayList<String > list1 = new ArrayList<>(Arrays.asList("a", "b","c","x"));
        ArrayList<String > list2 = new ArrayList<>(Arrays.asList("y", "z"));
        System.out.println(combinedlist(list1, list2));

    }
}
