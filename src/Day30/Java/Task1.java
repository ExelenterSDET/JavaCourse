package Day30.Java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    /*
    Create listOfLists of String.
    1. have at least 3 lists within listOfLists
    2. Size of the list or values could be anything.
    3. print the list of lists, using enhanced for loop or regular for loop.

    10 min - 9.02

     */

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> listOfLists = new ArrayList<ArrayList<String>>();

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("January", "February", "March"));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("dog", "cat", "mouse", "rabbit"));

        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);

        for (ArrayList<String> list : listOfLists) {
            for (String str : list) {
                System.out.print(str + " ");
            }
            System.out.println();
        }

        System.out.println("================================");

        for (ArrayList<String> list : listOfLists) {
            list.forEach(str -> System.out.print(str + " ")); // removeIf
            System.out.println();
        }

        System.out.println("================================");

//        listOfLists.forEach(list -> list.forEach(str -> System.out.print(str + " ")));

    }
}
