package Day30.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Sebahattin {
    public static void main(String[] args) {
/*
     Create listOfLists of String.
    1. have at least 3 lists within listOfLists
    2. Size of the list or values could be anything.
    3. print the list of lists, using enhanced for loop or regular for loop.

    Create a method, which will remove all Strings, which size is less than 2.
    Parameter and return type is List of Lists of String
*/
        ArrayList<ArrayList<String>> listOfList = new ArrayList<>();

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Opel", "Toyota", "W", "Porche", "Honda"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Blue", "Pink", "B", "Black", "R"));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("First", "O", "Sceond", "Third"));

        listOfList.add(list1);
        listOfList.add(list2);
        listOfList.add(list3);

        System.out.println(listOfList);
        System.out.println("======================================================================================");
        System.out.println(removeLessThanTwo(listOfList));

    }
    static ArrayList<ArrayList<String>> removeLessThanTwo (ArrayList<ArrayList<String>> listOfLists){
        for (int i = 0; i < listOfLists.size(); i++) {
            listOfLists.get(i).removeIf(s -> s.length()<2);
        }
        return listOfLists;
    }
}
