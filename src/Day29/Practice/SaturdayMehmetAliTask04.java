package Day29.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class SaturdayMehmetAliTask04 {
    public static void main(String[] args) {
         /*Task 4
    Create a method that takes two lists as parameter and return a new list with all values that
    are only in one of both lists
    Return ArrayList
    Example:
    Input:
            [1, 2, 3, 4] and [1, 4, 5, 9]
    Output:
            [2, 3, 5, 9]
      */
            ArrayList<Integer> liste1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
            ArrayList<Integer> liste2 = new ArrayList<>(Arrays.asList(1, 4, 5, 9));


            System.out.println("liste1 " + liste1);
            System.out.println("liste2 " + liste2);

            SaturdayMehmetAliTask04 ut4 = new SaturdayMehmetAliTask04();
            System.out.println(ut4.diffComb(liste1, liste2));
        }
        ArrayList<Integer> diffComb (ArrayList < Integer > list1, ArrayList < Integer > list2){
            ArrayList<Integer> temp = new ArrayList<>(list1); // list1

            list1.removeAll(list2);
            list2.removeAll(temp);
            list1.addAll(list2);

            return list1;
        }
    }
