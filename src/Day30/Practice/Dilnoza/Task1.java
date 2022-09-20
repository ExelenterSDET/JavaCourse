package Day30.Practice.Dilnoza;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    // Class Task1
    public static void main(String[] args) {
/*
Create listOfLists of String.
    1. have at least 3 lists within listOfLists
    2. Size of the list or values could be anything.
    3. print the list of lists, using enhanced for loop or regular for loop.

    10 min - 9.02
 */

        ArrayList<ArrayList<String>> listOfList= new ArrayList<>();
        ArrayList<String> countries = new ArrayList<>(Arrays.asList("USA","Canada","Mexico"));
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("New York","Toronto","Mexico City"));
        ArrayList<String> language = new ArrayList<>(Arrays.asList("English","French","Spanish"));

        listOfList.add(countries);
        listOfList.add(cities);
        listOfList.add(language);

        for (int i = 0; i < listOfList.size(); i++) {
            for (int j = 0; j <listOfList.get(i).size() ; j++) {
                System.out.print(listOfList.get(i).get(j)+" ");

            }
            System.out.println();
        }
        System.out.println("listOfList = " + listOfList);
    }





}
