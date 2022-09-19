package Day29.Practice.Saturday_Project;

import java.util.ArrayList;
import java.util.Arrays;

public class Task6 {
     /*
      Task 6
            Create a void method that has an Arraylists of Integer as a parameter

            Count how many each Integer object repeats. Print the result.

            Example:
            [1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1]

            output should be:
            1 = 3; 2 = 2; 3 = 2, 4 = 2, 5 = 2, 6 = 1;

     */

    public static void main(String[] args) {
        ArrayList<Integer> intList=new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1));

        howManyIntegerObjRepeats(intList);
    }

    static void howManyIntegerObjRepeats(ArrayList<Integer> list) {

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int i1 = 0; i1 < list.size(); i1++) {
                if (list.get(i).equals(list.get(i1))) {
                    count++;
                }

            }
            System.out.println(list.get(i)+"="+count+";");

            count=0;

        }


    }

}
