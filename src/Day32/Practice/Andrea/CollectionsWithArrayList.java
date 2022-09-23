package Day32.Practice.Andrea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsWithArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,2,1,0,7,6,5,-2));

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

    }
}
