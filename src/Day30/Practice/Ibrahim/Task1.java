package Day30.Practice.Ibrahim;

import java.util.ArrayList;
import java.util.Arrays;

/*
    Create listOfLists of String.
    1. have at least 3 lists within listOfLists
    2. Size of the list or values could be anything.
    3. print the list of lists, using enhanced for loop or regular for loop.



     */
public class Task1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> listOfList = new ArrayList<>();


        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("January", "February", "March"));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("dog", "cat", "mouse", "rabbit"));

        listOfList.add(list1);
        listOfList.add(list2);
        listOfList.add(list3);

        for (ArrayList<String> str : listOfList) {
            for (String s : str) {
                System.out.print(s + ", ");
            }
            System.out.println();

        }
    }


}
