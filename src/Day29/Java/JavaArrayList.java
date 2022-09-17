package Day29.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArrayList {
    public static void main(String[] args) {

        // Difference between Array and ArrayList

        int[] arr = {1,2,3};
        int[] arr1 = new int[]{1,2,3};
        int[] arr2;
        arr2 = new int[2];
        arr2[0] = 1;
        arr2[1] = 2;

        // List => ArrayList (List class is the parent class of ArrayList)
        List<Integer> list2 = new ArrayList<>();

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3));

        System.out.println(list3);

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,3,5));
        System.out.println(list4);

        List<Integer> list5 = Arrays.asList(1,3,5,4);
        System.out.println(list5);

        ArrayList<Integer> list;
        list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(2);
        System.out.println(list);
    }
}
