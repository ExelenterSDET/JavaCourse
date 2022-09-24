package Day29.Practice.Sebahattin;

import java.util.ArrayList;
import java.util.Arrays;

public class Task04 {
/*    Create a method that takes two lists as parameter and return a new list
            with all values that are only in one of both lists
            Return ArrayList

            Example:

            Input:
                    [1, 2, 3, 4] and [1, 4, 5, 9]
            Output:
                    [2, 3, 5, 9]

 */
    public static void main(String[] args) {
        ArrayList<Integer> lists1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> lists2 = new ArrayList<>(Arrays.asList(1,4,5,9));
        System.out.println(newList(lists1, lists2));

    }
    static ArrayList<Integer> newList (ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> backupList = new ArrayList<>(list1);
        list1.removeAll(list2);
        list2.removeAll(backupList);
        list1.addAll(list2);

        return list1;
    }
}
