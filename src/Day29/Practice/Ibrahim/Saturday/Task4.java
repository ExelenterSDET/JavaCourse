package Day29.Practice.Ibrahim.Saturday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Task 4
            Create a method that takes two lists as parameter and return a new list with all values that are only in one of both lists
            Return ArrayList

            Example:

            Input:
            [1, 2, 3, 4] and [1, 4, 5, 9]
            Output:
            [2, 3, 5, 9]
 */
public class Task4 {

    static ArrayList<Integer> combinedTwoLists(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> list3 = new ArrayList<>(a);
        a.removeAll(b);
        b.removeAll(list3);

        b.addAll(a);
        return b;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 4, 5, 9));

        System.out.println(combinedTwoLists(list1, list2));

    }
}
