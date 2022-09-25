package Day29.Practice.Ibrahim.Saturday;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
        Task 3
         Create a method which will take two lists as parameter and return
         a new list with all values of the first list that are not in the second list.
         Return ArrayList

         Example:

         Input:
         [1, 2, 3, 4] and [1, 4, 5, 9]

         Output:
         [2, 3]
*/
public class Task3 {
    static ArrayList<Integer> listDifference(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            list3 = a;
        }

        for (int i = 0; i < b.size(); i++) {
            if (list3.contains(b.get(i))){
                list3.remove(b.get(i));
            }
        }
        System.out.println(list3);
        return list3;
    }

//    static ArrayList<Integer> numbersNotInSecondList(list1, list2){
//        list1.removeAll(list2);
//        return list1;
//    }



    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 4, 5, 9));


        listDifference(list1, list2);
//        System.out.println(numbersNotInSecondList(list1, list2));
    }
}
