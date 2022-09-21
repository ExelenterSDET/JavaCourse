package Day30.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Anthony {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> listOfList=new ArrayList<>();

        ArrayList<String> list1=new ArrayList<>(Arrays.asList("hello", "world", "I"));
        ArrayList<String> list2=new ArrayList<>(Arrays.asList("Mexico", "$", "Russia"));
        ArrayList<String> list3=new ArrayList<>(Arrays.asList("fish", "H","I", "dog"));

        listOfList.add(list1);
        listOfList.add(list2);
        listOfList.add(list3);

        ArrayList<ArrayList<String>> arrayLists = removeLessThan2(listOfList);
        System.out.println("List of Arrays = " + arrayLists);

    }

    static ArrayList<ArrayList<String>> removeLessThan2(ArrayList<ArrayList<String>> listOfList) {

        for (int i = 0; i < listOfList.size(); i++) {
            listOfList.get(i).removeIf(str-> str.length()<2);
        }
        return listOfList;
    }
}
