package Day29.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class SaturdayUfukTask5 {
    /*Task 5
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
        ArrayList<String> stri1 = new ArrayList<>(Arrays.asList("a", "b", "c","d","e","f","g"));
        ArrayList<String> stri2 = new ArrayList<>(Arrays.asList("x", "y", "z","q"));

        SaturdayUfukTask5 ut5 = new SaturdayUfukTask5();
        System.out.println(ut5.strComb(stri1, stri2));
    }

    ArrayList<String> strComb(ArrayList<String> str1, ArrayList<String> str2) {
        ArrayList<String> str3 = new ArrayList<>();
        int counter1 = 0;
        int counter2 = 0;

        for (int i = 0; i < Math.min(str1.size(),str2.size()); i++) {
            str3.add(str1.get(i));
            str3.add(str2.get(i));
        }
        if (str1.size() > str2.size()) {
            for (int i = str1.size() - str2.size()+1; i < str1.size(); i++) {
                str3.add(str1.get(i));
            }
        } else if (str1.size() < str2.size()) {
            for (int i = str2.size() - str1.size()+1; i < str2.size(); i++) {
                str3.add(str2.get(i));
            }

//        if (str1.size() == str2.size()) {
//            for (int i = 0; i < str1.size() + str2.size(); i++) {
//
//                if ((i) % 2 == 0) {
//                    str3.add(str1.get(counter1));
//                    counter1++;
//
//                } else {
//                    str3.add(str2.get(counter2));
//                    counter2++;
//                }
//            }
//        }

        }return str3;
    }
}



