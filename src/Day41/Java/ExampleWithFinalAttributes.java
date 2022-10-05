package Day41.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ExampleWithFinalAttributes {
    static final int[] arr = new int[3];
    final int[] arr2 = new int[5];
    static final ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    static final HashMap<Integer, Integer> map = new HashMap<>();
    static final String str = "Hello";
    static final int num = 10;

    public static void main(String[] args) {
        arr[0] = 1;
        arr[2] = 2;
        arr[1] = 10;
        System.out.println(Arrays.toString(arr));

        list.add(10);
        list.remove(0);
        System.out.println(list);

        map.put(1,1);
        map.put(2,20);
        System.out.println(map);

        ExampleWithFinalAttributes obj = new ExampleWithFinalAttributes();
        obj.arr2[0] = 15;
        obj.arr2[1] = 10;

        System.out.println(Arrays.toString(obj.arr2));


//        str = str.toLowerCase();
//        num = 15;
    }

}
