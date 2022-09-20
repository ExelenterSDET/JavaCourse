package Day29.Practice.Saturday_Project;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {

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
        ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("list1 = " + list1);
        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(1, 4, 5, 9));
        System.out.println("list2 = " + list2);

        Task4 ts4=new Task4();
        ArrayList<Integer> integers = ts4.returnNewList(list1, list2);
        System.out.println("integers = " + integers);

    }

    ArrayList<Integer> returnNewList(ArrayList<Integer>list1,ArrayList<Integer>list2) {
        ArrayList<Integer>list3=new ArrayList<>(list1);
        list1.removeAll(list2);
        list2.removeAll(list3);
        list1.addAll(list2);
        return list1;
    }

}
