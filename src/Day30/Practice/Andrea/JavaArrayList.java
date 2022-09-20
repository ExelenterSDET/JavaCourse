package Day30.Practice.Andrea;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaArrayList {
    public static void main(String[] args) {

        int[][] arr = new int[3][3];
        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,55));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3,6,7,4,2,66));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(100,200,300,400,505));

        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);


        for (int i = 0; i < listOfLists.size(); i++) {
            for (int j = 0; j < listOfLists.get(i).size(); j++) {
                System.out.print(listOfLists.get(i).get(j));
            }
            System.out.println();
        }
        System.out.println("========================");
        System.out.println(listOfLists);
    }
}
