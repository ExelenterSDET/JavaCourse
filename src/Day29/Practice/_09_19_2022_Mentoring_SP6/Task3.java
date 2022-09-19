package Day29.Practice._09_19_2022_Mentoring_SP6;

import java.util.ArrayList;

public class Task3 {

    /*
             Task 3
             Create a method which will take two lists as parameter and return
              a new list with all values of the first list that are not in the second list.
             Return ArrayList

             Example:

             Input:
             [1, 2, 3, 4] and [1, 4, 5, 9]

             Output:
             [2, 3]*/

    static ArrayList<Integer> numbersNotInSecondList(ArrayList<Integer> list1, ArrayList<Integer> list2){
        list1.removeAll(list2);
        return list1;
    }
}
