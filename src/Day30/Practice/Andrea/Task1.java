package Day30.Practice.Andrea;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> listOfLists = new ArrayList<>();

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("March","April","May"));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("dog","cat","rabbit","frog","hen","hamster","mouse"));

        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);

        for (ArrayList<String> listOfList : listOfLists) {
            for (String s : listOfList) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
        System.out.println("========================");
        System.out.println(listOfLists);
        System.out.println("========================");

        for (ArrayList<String> list : listOfLists){
            list.forEach(str -> System.out.print(" " + str));
        }
    }
}
