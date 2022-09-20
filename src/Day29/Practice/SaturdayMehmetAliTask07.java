package Day29.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SaturdayMehmetAliTask07 {
    /*Task 7
        Create a method that has an Arraylists of Integer as a parameter.
        Remove all duplicates and return new ArrayList of Integer
        Example:
        [1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1]
        output should be:
        [1,2,3,4,5,6]
 */
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 3, 5, 2, 2, 2, 7, 6, 7, 6, 7, 6, 7, 6, 7, 9, 2, 3, 1, 2, 6, 2, 5, 1));
        SaturdayMehmetAliTask07 ut7 = new SaturdayMehmetAliTask07();

        System.out.println(ut7.removeDub(arr));
    }

    ArrayList<Integer> removeDub(ArrayList<Integer> list) {
        Collections.sort(list);
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i).equals(list.get(i - 1))) {
                list.remove(i);
            }
        }
//        System.out.println(list);
        return list;
    }
}