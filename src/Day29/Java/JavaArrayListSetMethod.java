package Day29.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArrayListSetMethod {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        arr[4] = 15;
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list1.set(4,15);
        System.out.println(list1);

        list1.clear(); // clears all the values within arraylist
        System.out.println(list1);



    }
}
