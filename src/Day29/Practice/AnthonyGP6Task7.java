package Day29.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class AnthonyGP6Task7 {
    public static void main(String[] args) {
        /*
        Task 7
            Create a method that has an Arraylists of Integer as a parameter.

            Remove all duplicates and return new ArrayList of Integer

            Example:
            [1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1]

            output should be:
            [1,2,3,4,5,6]
         */
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1));
        System.out.println("Original list: " + intList);
        System.out.println("Removed duplicates: " + removeDuplicates(intList));
    }
    static ArrayList<Integer> removeDuplicates (ArrayList<Integer> list) {
        list.sort(null);
        System.out.println("Sorted list: " + list);
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                    j--;
                }
            }
        }
        return list;
    }
}
