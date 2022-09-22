package Day32.Java;

import java.util.*;

public class JavaTreeSet {
    public static void main(String[] args) {
        /*
        If you want to sort the elements
        according to some Comparator then
        use TreeSet
        objects will be placed in their natural
        ascending order
         */
        HashSet<Integer> set = new HashSet<>(Arrays.asList(5,2,1,0,9,7,6,5,4,3,-2));
        TreeSet<Integer> ls = new TreeSet<>(set);
        ls.add(-10);
        set.add(-10);
        ls.add(100);
        set.add(100);

        System.out.println(set);
        System.out.println(ls);

    }
}
