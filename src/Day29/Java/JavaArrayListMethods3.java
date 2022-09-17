package Day29.Java;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        boolean b = list1 == list2; // always returns false
        System.out.println(b);

        boolean b1 = list1.equals(list2); // right way to compare to arraylists
        System.out.println(b1);

        ArrayList<Integer> list3 = list1;
        list3.set(0,100);
        list3.set(1, 200);
        System.out.println(list1);
        System.out.println(list3);

        System.out.println("========================");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(list1);
        list4.set(0,6);
        list4.set(1, 6);
        System.out.println(list1);
        System.out.println(list4);

        int i = list4.indexOf(6);
        System.out.println(i);
        int i1 = list4.lastIndexOf(6);
        System.out.println(i1);

        boolean empty = list4.isEmpty();
        System.out.println(empty);
        list4.clear();
        empty = list4.isEmpty();
        System.out.println(empty);

    }
}
