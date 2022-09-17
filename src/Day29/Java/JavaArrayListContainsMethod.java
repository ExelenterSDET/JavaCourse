package Day29.Java;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaArrayListContainsMethod {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int length = arr.length;
        System.out.println(length);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        int size = list.size();
        System.out.println(size);

        boolean contains5 = list.contains(5); // returns true, since we have object 5 in the list
        System.out.println(contains5);

        boolean contains11= list.contains(11); // returns false, since we dont have object 11 in the list
        System.out.println(contains11);

        Integer integer = list.get(list.size() - 2);
        System.out.println(integer);




    }
}
