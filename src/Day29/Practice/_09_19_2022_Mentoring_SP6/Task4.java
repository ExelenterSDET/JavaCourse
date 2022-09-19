package Day29.Practice._09_19_2022_Mentoring_SP6;

import java.util.ArrayList;

public class Task4 {
    /*            Task 4
            Create a method that takes two lists as parameter and return a new list with all values that are only in one of both lists
            Return ArrayList
            Example:
            Input:
            [1, 2, 3, 4] and [1, 4, 5, 9]
            Output:
            [2, 3, 5, 9]
*/

    static ArrayList<Integer> getUniqueNumbersFromTwoLists(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> copy = new ArrayList<>(list1);
        copy.removeAll(list2);
        list2.removeAll(list1);
        copy.addAll(list2);
        return copy;
    }
}
