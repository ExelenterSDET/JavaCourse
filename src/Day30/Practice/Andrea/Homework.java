package Day30.Practice.Andrea;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> listOfLists = new ArrayList<>();

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("I", "love", "java", "sometimes"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Do", "you", "?"));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("I", "saw", "a", "frog"));

        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);

        System.out.println(removeTinyWords(listOfLists));
    }

    static ArrayList<ArrayList<String>> removeTinyWords(ArrayList<ArrayList<String>> listOfList) {
        for (int i = 0; i < listOfList.size(); i++) {
            listOfList.get(i).removeIf(str -> str.length()<2);
        }
        return listOfList;
    }
}
