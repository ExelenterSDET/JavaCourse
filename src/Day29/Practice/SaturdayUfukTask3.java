package Day29.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class SaturdayUfukTask3 {
    /* Task 3
             Create a method which will take two lists as parameter and return a new list with all values of the first list that are not in the second list.
             Return ArrayList
             Example:
             Input:
             [1, 2, 3, 4] and [1, 4, 5, 9]
             Output:
             [2, 3] */
    public static void main(String[] args) {
        ArrayList<Integer> liste1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> liste2 = new ArrayList<>(Arrays.asList(1,4,5,9));
        System.out.println(liste1);
        System.out.println(liste2);

        SaturdayUfukTask3 ut3=new SaturdayUfukTask3();
        System.out.println(ut3.difference(liste1,liste2));
    }

    ArrayList<Integer> difference(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> list3 = new ArrayList<>();
//        for (int i = 0; i < list1.size(); i++) {
//            for (int j = 0; j < list2.size(); j++) {
//               if (list1.get(i).equals(list2.get(j))){
//                   list3.add(list1.get(i));
//               }
//            }
//
//        }   ///   If we want to select common elements, we can use above code.
        list1.removeAll(list2);
        list3=list1;
        return list3;
    }
}
