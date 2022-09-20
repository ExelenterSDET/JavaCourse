package Day30.Practice.Andrea;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> listOfLists = new ArrayList<>();

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("monday","tuesday","wednesday","thursday"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("March","April","May"));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("dog","cat","rabbit","frog","hen","hamster","mouse"));

        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);

        System.out.println(listToUpperCase(listOfLists));
    }
    static ArrayList<ArrayList<String>> listToUpperCase (ArrayList<ArrayList<String>> listOfList){
        for (int row = 0; row < listOfList.size(); row++) {
            for (int col = 0; col < listOfList.get(row).size(); col++) {
                String s = listOfList.get(row).get(col).toUpperCase();
                listOfList.get(row).set(col, s);
            }
        }
        return listOfList;
    }
}
