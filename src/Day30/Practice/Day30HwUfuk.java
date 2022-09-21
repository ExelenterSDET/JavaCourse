package Day30.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Day30HwUfuk {
    /*

     Create listOfLists of String.
    1. have at least 3 lists within listOfLists
    2. Size of the list or values could be anything.
    3. print the list of lists, using enhanced for loop or regular for loop.

    Create a method, which will remove all Strings, which size is less than 2.
    Parameter and return type is List of Lists of String

     */
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> listOfLists = new ArrayList<ArrayList<String>>();

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Istanbul","Ka","Kocaeli","Sakarya","Ed","Edirne"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Ordu","Or","Samsun","s","Trabzon","t","Kastamonu","Sinop"));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Van","Mus","mu","Bingol","Erzurum","er"));

        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);

        ArrayList<ArrayList<String>> arrayLists = removeLessThanTwo(listOfLists);
        System.out.println(arrayLists);


    }

    static ArrayList<ArrayList<String>> removeLessThanTwo(ArrayList<ArrayList<String>> listOfList) {
        for (int row = 0; row < listOfList.size(); row++) {
            for (int column = 0; column < listOfList.get(row).size(); column++) {
               listOfList.get(row).removeIf(str->str.length()<=2);
            }
        }
        return listOfList;
    }
}
