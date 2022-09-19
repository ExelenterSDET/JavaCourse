package Day29.Practice.DilnozaSP;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
     /*

             Task 3
             Create a method which will take two lists as parameter and return a new list with all values of the first list that are not in the second list.
             Return ArrayList

             Example:

             Input:
             [1, 2, 3, 4] and [1, 4, 5, 9]

             Output:
             [2, 3]

=====================================================================
     */

    public static void main(String[] args) {
        Task3 t3 = new Task3();
        ArrayList<Integer> list1= new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println("list1 = " + list1);
        ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(1,5,3,7,5,9));
        System.out.println("list2 = " + list2);
        ArrayList<Integer> newList = t3.twoLists(list1, list2);
        System.out.println("newList = " + newList);

    }
    ArrayList<Integer> twoLists(ArrayList<Integer> list1, ArrayList<Integer> list2){
        list1.removeAll(list2);
        return list1;
    }
}

