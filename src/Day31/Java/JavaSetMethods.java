package Day31.Java;

import java.util.Arrays;
import java.util.HashSet;

public class JavaSetMethods {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,6));

        int size = set.size();
        System.out.println(size);

        System.out.println(set);

        boolean empty = set.isEmpty();
        System.out.println(empty);

        boolean contains = set.contains(3);
        System.out.println(contains);

        set.remove(3);
        System.out.println(set);

        set.removeIf(number -> number>=4);
        System.out.println(set);

        set.add(5);
        set.add(6);
        set.add(3);
        System.out.println(set);

        set.clear();
        System.out.println(set);

    }
}
