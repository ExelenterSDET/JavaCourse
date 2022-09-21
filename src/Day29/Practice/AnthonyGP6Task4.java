package Day29.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class AnthonyGP6Task4 {
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
     public static void main(String[] args) {
         ArrayList<Integer> listA = new ArrayList<>(Arrays.asList(1,2,3,4));
         System.out.println("listA = " + listA);
         ArrayList<Integer> listB = new ArrayList<>(Arrays.asList(1,4,5,9));
         System.out.println("listB = " + listB);
         System.out.println("Unique values = " + getUniqueList(listA, listB));
     }
    static ArrayList<Integer> getUniqueList(ArrayList<Integer> list1, ArrayList<Integer> list2){

        ArrayList<Integer> tempList = new ArrayList<>(list1);
        list1.removeAll(list2);
        list2.removeAll(tempList);
        list1.addAll(list2);
        return list1;
     }
}
