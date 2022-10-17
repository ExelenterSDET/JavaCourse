package Day29.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SaturdayUfukTask6 {
    /*Task 6
            Create a void method that has an Arraylists of Integer as a parameter

            Count how many each Integer object repeats. Print the result.

            Example:
            [1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1]

            output should be:
            1 = 3; 2 = 3; 3 = 2, 4 = 2, 5 = 2, 6 = 1;
     */
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1));
        SaturdayUfukTask6 ut6= new SaturdayUfukTask6();

        ut6.countInt(arr);
    }

    void countInt(ArrayList<Integer> list){
        Collections.sort(list);
        int sum=0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
              sum += list.get(i).equals(list.get(j))?1:0;
            }
            System.out.print(list.get(i)+"="+sum+"; ");

            sum=0;
        }
    }

}
