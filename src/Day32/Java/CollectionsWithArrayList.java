package Day32.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsWithArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 1, 0, 9, 7, 6, 4, 3, -2));

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        int min = Collections.min(list);
        int max = Collections.max(list);
        System.out.println(min + " " + max);
    }
}
