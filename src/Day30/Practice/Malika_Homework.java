package Day30.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Malika_Homework {
    public static void main(String[] args) {
        /*

     Create listOfLists of String.
    1. have at least 3 lists within listOfLists
    2. Size of the list or values could be anything.
    3. print the list of lists, using enhanced for loop or regular for loop.

    Create a method, which will remove all Strings, which size is less than 2.
    Parameter and return type is List of Lists of String

     */
        ArrayList<ArrayList<String>> listOfLists = new ArrayList<ArrayList<String>>();

        ArrayList<String> classes = new ArrayList<>(Arrays.asList("Math", "Geography", "Biology","Chemistry", "Physics"));
        ArrayList<String> letters = new ArrayList<>(Arrays.asList("A", "B", "c", "d"));
        ArrayList<String> daysOfTheWeek = new ArrayList<>(Arrays.asList("Mon", "Tue", "W", "Thu","F","Sat","Sun"));

        listOfLists.add(classes);
        listOfLists.add(letters);
        listOfLists.add(daysOfTheWeek);

        for (ArrayList<String> list : listOfLists){
            for (String str : list){
                System.out.print(str + " ");
            }
            System.out.println();
        }
        ArrayList<ArrayList<String>> arrayLists = removeSizeLessThan2(listOfLists);
        System.out.println(arrayLists);
    }
    static ArrayList<ArrayList<String>> removeSizeLessThan2 (ArrayList<ArrayList<String>> listOfList){

        for (ArrayList<String> strings : listOfList) {
            for (int i = 0; i < strings.size(); i++) {
                if (strings.get(i).length()<2) {
                    strings.remove(i); // ====>>> (1st way with 'remove')
                    i--;

                }

                //strings.removeIf(str->str.length()<2); // ===>>>(2nd way with 'removeIf')
            }
        }
        return listOfList;
    }
}
