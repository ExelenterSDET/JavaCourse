package Day30.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Bahridin_HomeWork {
    /*

  Create listOfLists of String.
 1. have at least 3 lists within listOfLists
 2. Size of the list or values could be anything.
 3. print the list of lists, using enhanced for loop or regular for loop.

 Create a method, which will remove all Strings, which size is less than 2.
 Parameter and return type is List of Lists of String

  */
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> listOfList=new ArrayList<>();

        ArrayList<String> list1=new ArrayList<>(Arrays.asList("chandler","t","phoenix","tucson"));
        ArrayList<String> list2=new ArrayList<>(Arrays.asList("chad","torrance","d","tibet"));
        ArrayList<String> list3=new ArrayList<>(Arrays.asList("ap","peach","grapes","p"));

        listOfList.add(list1);
        listOfList.add(list2);
        listOfList.add(list3);

        ArrayList<ArrayList<String>> arrayLists = removeLessThan2(listOfList);
        System.out.println("arrayLists = " + arrayLists);

    }

    static ArrayList<ArrayList<String>> removeLessThan2(ArrayList<ArrayList<String>> listOfList) {

        for (int i = 0; i < listOfList.size(); i++) {
            for (int j = 0; j < listOfList.size(); j++) {
                //String s = listOfList.get(i).get(j);
                listOfList.get(i).removeIf(str-> str.length()<2);
            }
        }
        return listOfList;

    }
}
