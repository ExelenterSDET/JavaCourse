package Day29.Practice.DilnozaSP;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
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

    ===========================================================================
         */
        public static void main(String[] args) {


            Task5 t5 = new Task5();
            ArrayList<String> str1= new ArrayList<>(Arrays.asList("a", "b", "c", "x"));
            System.out.println("str1 = " + str1);
            ArrayList<String> str2= new ArrayList<>(Arrays.asList("y", "z"));
            System.out.println("str2 = " + str2);
            ArrayList<String> newList = t5.twoStringsToOne(str1, str2);
            System.out.println("newList = " + newList);

        }

        ArrayList<String> twoStringsToOne(ArrayList<String> str1, ArrayList<String> str2){
            str1.add(1, str2.get(0));
            str1.add(3,str2.get(1));
            return str1;
        }
}
