package Day31.Practice.Andrea;

import java.util.Arrays;
import java.util.HashSet;

public class JavaSetMethods {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,6));

        int size = set.size();
        System.out.println(size);

        System.out.println(set);
        //set.clear();
        boolean empty = set.isEmpty();
        System.out.println(empty);

        boolean contains = set.contains(6);
        System.out.println(contains);

        set.removeIf(number -> number>=4);
        System.out.println(set);
        set.add(5);
        set.add(6);
        set.add(3);
        System.out.println(set);

        //avoid working with indexes with hashset - it has its own logic in where it adds stuff
    }
}
