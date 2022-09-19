package Day29.Practice.SaturdayProject6Andrea;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {

  /*  Task 3
    Create a method which will take two lists as parameter and return a new list with all values of the first list that are not in the second list.
            Return ArrayList

    Example:

    Input:
            [1, 2, 3, 4] and [1, 4, 5, 9]

    Output:
            [2, 3]

   */

    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println("listA = " + listA);
        ArrayList<Integer> listB = new ArrayList<>(Arrays.asList(1,4,5,9));
        System.out.println("listB = " + listB);
        System.out.println(getUniqueList(listA, listB));
    }
    static ArrayList<Integer> getUniqueList(ArrayList<Integer> list1, ArrayList<Integer> list2){
        list1.removeAll(list2);
        return list1;
    }
}

