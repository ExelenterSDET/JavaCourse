package Day41.Practice.Anthony;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ExampleWithFinalAttributes {
//remove final if you want to change the starting object
    static final int[] arr = new int[3];
    final int[] arr2 = new int[5];//
    static final ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
    static final HashMap<Integer,Integer> map = new HashMap<>();
    static final String str = "Hello";
    static final int num = 10;

    public static void main(String[] args) {
        //arr = new int[2];
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

        //cant re-declare
        //map = new HashMap<>();

        //str = str.toLowerCase(); can not change due to it being final
        //num = 15; can not change it

        ExampleWithFinalAttributes obj = new ExampleWithFinalAttributes();
        obj.arr2[0] = 15;
        obj.arr2[1] = 10;
        System.out.println(Arrays.toString(obj.arr2));

    }
}
