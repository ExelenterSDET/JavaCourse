package Day31.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JavaCollectionMethods {
    public static void main(String[] args) {

        int[] arr = new int[2];

        Arrays.sort(arr);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,2,-4,1,0,10,32,15));
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.copy(list1, list); // Copies one list object to another. Both objects should have equal size
        System.out.println(list);
        System.out.println(list1);

        int max = Collections.max(list); // returns the maximum value in the list
        System.out.println(max);

        int min = Collections.min(list); // returns the minimum value in the list
        System.out.println(min);


        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java", "Is", "Fun", "Zero"));
        String max1 = Collections.max(list2);
        System.out.println(max1);

        String min1 = Collections.min(list2);
        System.out.println(min1);


        ArrayList<Character> list3 = new ArrayList<>(Arrays.asList('a', 'b', 'c'));
        Character max2 = Collections.max(list3);
        System.out.println(max2);

        Character min2 = Collections.min(list3);
        System.out.println(min2);

        Collections.reverse(list); // Reverses the existing list
        System.out.println(list);

        Collections.sort(list); // Method that sorts List in ascending order
        System.out.println(list);

        Collections.fill(list, 10); // sets the objects in the list. List must have some objects inside.
        System.out.println(list);

    }

}
