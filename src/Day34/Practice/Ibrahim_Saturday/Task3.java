package Day34.Practice.Ibrahim_Saturday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/*
        Task 3

        Create a method, which will return a ArrayList<Integer> and parameter is a ArrayList<Integer>.
        The method should sort the ArrayList.

        Note: Don`t use any of built-in sort methods.

        Example:
        {5,4,2,1,0,3}

        Result: {0,1,2,3,4,5}
 */
public class Task3 {

    static ArrayList<Integer> sortList(ArrayList<Integer> list){

        TreeSet<Integer> sortedList = new TreeSet<>(list);
        list.clear();
        list.addAll(sortedList);
        return list;
    }


//    static ArrayList<Integer> sortInts (ArrayList<Integer> list){
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = list.size() - 1; j > i; j--) {
//                if (list.get(i) > list.get(j)) {
//
//                    int temp = list.get(i);
//                    list.set(i, list.get(j));
//                    list.set(j, temp);
//                }
//            }
//        }
//        return list;
//    }

    public static void main(String[] args) {
        ArrayList<Integer> iArr = new ArrayList<>(Arrays.asList(5,4,2,1,0,3,0));
        System.out.println(sortList(iArr));

    }
}
