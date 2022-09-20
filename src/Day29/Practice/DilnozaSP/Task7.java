package Day29.Practice.DilnozaSP;

import java.util.ArrayList;
import java.util.Arrays;

public class Task7 {
    /*

           Task 7
           Create a method that has an Arraylists of Integer as a parameter.

           Remove all duplicates and return new ArrayList of Integer

           Example:
           [1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1]

           output should be:
           [1,2,3,4,5,6]

    */
    public static void main(String[] args) {
        Task7 t7 = new Task7();
        ArrayList<Integer> numList=new ArrayList<Integer>(Arrays.asList(1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1));
        ArrayList<Integer> result = t7.removeDuplicates(numList);
        System.out.println("result = " + result);

    }

    ArrayList<Integer> removeDuplicates(ArrayList<Integer>numbers){
        ArrayList<Integer> newNumList = new ArrayList<>();
        for (Integer number : numbers) {
            if(!newNumList.contains(number)){
                newNumList.add(number);
            }

        }return newNumList;
    }


}
