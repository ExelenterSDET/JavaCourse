package Day31.Practice.Andrea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JavaCollectionMethods {

    public static void main(String[] args) {

        int[] arr = new int[2];
        Arrays.sort(arr);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7,2,4,1,0,10,3,15));
        ArrayList<Integer> list1 = new ArrayList<>();

        Collections.copy(list, list1);

        System.out.println(list);
        System.out.println(list1);

        int max = Collections.max(list);
        System.out.println(max);

        int min = Collections.min(list);
        System.out.println(min);

        Collections.reverse(list);
        System.out.println(list);







//
//        Collections.fill(list, 10); //
//
//        System.out.println(list);


    }
}
