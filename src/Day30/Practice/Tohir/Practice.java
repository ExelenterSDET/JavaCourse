package Day30.Practice.Tohir;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        Practice ash = new Practice();
        ArrayList<String> strlist0 =new ArrayList<>(Arrays.asList("Home","Dark","nose","bad","fat"));
        ArrayList<String> strlist1 = new ArrayList<>(Arrays.asList("MOnday","Mom","dad","soon"));
        ArrayList<String> strlist2 = new ArrayList<>(Arrays.asList("12","123","1234","1"));
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        list.add(strlist0);
        list.add(strlist1);
        list.add(strlist2);
        for (int i = 0; i < list.size(); i++) {
            for (int i1 = 0; i1 < list.get(i).size(); i1++) {
                System.out.print(list.get(i).get(i1)+"\t");
            }
            System.out.println(" ");
        }
        System.out.println(onlywithsize3ormore(list));
    }
    static ArrayList<ArrayList<String>> onlywithsize3ormore(ArrayList<ArrayList<String>> strlist)
    {
        for (int i = 0; i < strlist.size(); i++) {
            for (int i1 = 0; i1 < strlist.get(i).size(); i1++) {
                if (strlist.get(i).get(i1).length()<3)
                {
                    strlist.get(i).remove(i1);
                    i1--;
                }
            }
        }
        return strlist;
    }
}
 /*

     Create listOfLists of String.
    1. have at least 3 lists within listOfLists
    2. Size of the list or values could be anything.
    3. print the list of lists, using enhanced for loop or regular for loop.

    Create a method, which will remove all Strings, which size is less than 2.
    Parameter and return type is List of Lists of String

     */