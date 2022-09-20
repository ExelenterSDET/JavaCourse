package Day30.Java;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaArrayList {
    public static void main(String[] args) {

        int[][] arr = new int[3][3]; // arr[0][5]

        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(11,44,66,88,1010,1212));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(100,200,300,400,500,600));

        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);

        for (int row = 0; row < listOfLists.size(); row++) {
            for (int column = 0; column < listOfLists.get(row).size(); column++) {
                System.out.print(listOfLists.get(row).get(column) + " ");
            }
            System.out.println();
        }

        System.out.println("=============================================");
        System.out.println(listOfLists);




    }
}
