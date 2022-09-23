package Day30.Practice.Dilnoza;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework {
    /*

Create listOfLists of String.
1. have at least 3 lists within listOfLists
2. Size of the list or values could be anything.
3. print the list of lists, using enhanced for loop or regular for loop.

Create a method, which will remove all Strings, which size is less than 2.
Parameter and return type is List of Lists of String

*/
    public static void main(String[] args) {
     Homework hW = new Homework();

        ArrayList<ArrayList<String>> listOfLists = new ArrayList<>();

        listOfLists.add(new ArrayList<>(Arrays.asList("I","Love","Java")));
        listOfLists.add(new ArrayList<>(Arrays.asList("we","need","to","practice","more")));
        listOfLists.add(new ArrayList<>(Arrays.asList("and","we","will","reach","our","goal","to","be","SDET")));

        ArrayList<ArrayList<String>> arrayLists = hW.removeIfLessThan2(listOfLists);
        System.out.println("arrayLists = " + arrayLists);

    }

    ArrayList<ArrayList<String>> removeIfLessThan2( ArrayList<ArrayList<String>> lists){

        for (ArrayList<String> list : lists) {
            list.removeIf(num-> num.length()<=2);

        }return lists;
    }
}
