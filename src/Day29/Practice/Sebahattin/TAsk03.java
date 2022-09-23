package Day29.Practice.Sebahattin;

import java.util.ArrayList;
import java.util.Arrays;

public class TAsk03 {
    public static void main(String[] args) {
/*
            Create a method which will take two lists as parameter and return
             a new list with all values of the first list that are not in the second list.
             Return ArrayList
             Example:
             Input:
             [1, 2, 3, 4] and [1, 4, 5, 9]
             Output:
             [2, 3]
*/
        ArrayList<Integer> lists1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> lists2 = new ArrayList<>(Arrays.asList(1,4,5,9));
        System.out.println(getNewList(lists1, lists2));

    }
    static ArrayList<Integer> getNewList (ArrayList<Integer> list1, ArrayList<Integer> list2){
        list1.removeAll(list2);
        return list1;
    }
}
