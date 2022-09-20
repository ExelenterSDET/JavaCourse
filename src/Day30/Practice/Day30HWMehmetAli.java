package Day30.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Day30HWMehmetAli {
    /*

    Create listOfLists of String.
   1. have at least 3 lists within listOfLists
   2. Size of the list or values could be anything.
   3. print the list of lists, using enhanced for loop or regular for loop.

   Create a method, which will remove all Strings, which size is less than 2.
   Parameter and return type is List of Lists of String

    */
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> listOfTheCars = new ArrayList<>();


        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Toyota", "y", "bMW", "hyundai", "kia", "Opel"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Honda", "mazda", "11", "maserati", "Renault"));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("mitsubishi", "Peugeot", "2a", "citroen"));

        listOfTheCars.add(list1);
        listOfTheCars.add(list2);
        listOfTheCars.add(list3);

        System.out.println(listOfTheCars);

        ArrayList<ArrayList<String>> arrayLists = toCamelCase(listOfTheCars);
        System.out.println(arrayLists);

        ArrayList<ArrayList<String>> arrayList = removeLessTwo(listOfTheCars);
        System.out.println(arrayLists);

    }

    static ArrayList<ArrayList<String>> toCamelCase(ArrayList<ArrayList<String>> listOfList) {
        for (int row = 0; row < listOfList.size(); row++) {
            for (int column = 0; column < listOfList.get(row).size(); column++) {
                String str = listOfList.get(row).get(column);
                str =  str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
                listOfList.get(row).set(column, str);

            }
        }
        return listOfList;
    }

    static ArrayList<ArrayList<String>> removeLessTwo(ArrayList<ArrayList<String>> listOfList) {
        for (int row = 0; row < listOfList.size(); row++) {
            for (int column = 0; column < listOfList.get(row).size(); column++) {

                listOfList.get(row).removeIf(str->str.length()<=2);
            }
        }
        return listOfList;
    }
}

