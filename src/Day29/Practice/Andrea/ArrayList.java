package Day29.Practice.Andrea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class JavaArrayList {
    public static void main(String[] args) {

        int[] arr = {1,2,3};
        int[] arr1 = new int[]{1,2,3};
        int[] arr2;
        arr2 = new int[2];
        arr2[0] = 1;
        arr2[1] = 2;

        ArrayList<Integer> listA;
        listA = new ArrayList<Integer>();

        //List is the parent class, ArrayList is the child
        List<Integer> list2 = new ArrayList<>();

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3));

        System.out.println("list3 = " + list3);

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,3,5));

        List<Integer> list5 = Arrays.asList(1,5,4,5);

        ArrayList<Integer> list;
        list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(2);
        System.out.println("list = " + list);

       //
        // convert array to ArrayList - ArrayList<Integer> list6 = new ArrayList<>(Arrays.asList(arr);

    }


}
