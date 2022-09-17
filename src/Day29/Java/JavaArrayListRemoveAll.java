package Day29.Java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class JavaArrayListRemoveAll {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,11,13,15));
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        list1.removeAll(list2);

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);




    }
}
