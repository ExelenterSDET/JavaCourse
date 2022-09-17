package Day29.Java;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaArrayListMethods2 {
    public static void main(String[] args) {

        double[] arr = {0.5,1.25,2.5};
        arr[0] = 0;
        System.out.println(Arrays.toString(arr));

        ArrayList<Double> list = new ArrayList<>(Arrays.asList(12.2,25.0,235.22));
        list.add(100.55);
        list.add(25.47);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove(100.55);
        System.out.println(list);



    }
}
