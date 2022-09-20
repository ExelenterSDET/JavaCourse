package Day29.Practice.Saturday_Project;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
/* Task 3
             Create a method which will take two lists as parameter
             and return a new list with all values of the first list that are not in the second list.
             Return ArrayList
             Example:
             Input:
             [1, 2, 3, 4] and [1, 4, 5, 9]
             Output:
             [2, 3] */

    public static void main(String[] args) {

        ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("list1 = " + list1);
        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(1, 4, 5, 9));
        System.out.println("list2 = " + list2);
//        ArrayList<Integer>list3=new ArrayList<>();
//        list1.removeAll(list2);
//        list3=list1;
//        System.out.println("list3 = " + list3);

        ArrayList<Integer> newList = createNewList(list1, list2);
        System.out.println("newList = " + newList);

    }

    static ArrayList<Integer> createNewList(ArrayList<Integer>list1,ArrayList<Integer>list2) {
        ArrayList<Integer>list3=new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {

                if (list1.get(i).equals(list2.get(j))) {
                    list3.add(list1.get(i));
                }

            }

        }
        return list3;
    }
}
