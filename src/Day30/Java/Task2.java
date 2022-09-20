package Day30.Java;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {

    /*

    Create a method, which will have list of list of Strings as a parameter.
    Convert all String character to upper case.
    return the list of list of strings

    9:30 - 9:40

     */
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> listOfLists = new ArrayList<ArrayList<String>>();

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("January", "February", "March"));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("dog", "cat", "mouse", "rabbit"));

        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);

        ArrayList<ArrayList<String>> arrayLists = toUpperCase(listOfLists);
        System.out.println(arrayLists);

    }

    static ArrayList<ArrayList<String>> toUpperCase(ArrayList<ArrayList<String>> listOfList) {
        for (int row = 0; row < listOfList.size(); row++) {
            for (int column = 0; column < listOfList.get(row).size(); column++) {
                String strToUpperCase = listOfList.get(row).get(column).toUpperCase();
                listOfList.get(row).set(column, strToUpperCase);
            }
        }
        return listOfList;
    }

}
