package Day29.Practice.Andrea;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSet {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list1.set(4, 15);
        System.out.println("list1 = " + list1);

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("cat","dog"));
        list2.set(1, "bunny");
        System.out.println("list2 = " + list2);


        list1.clear();
        System.out.println("list1 = " + list1);

    }
}
