package Day31.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JavaSets {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(1);

        System.out.println(set);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,6));
        System.out.println("list =>" + list);
        set1.addAll(list);

        System.out.println("set => " + set1);


    }
}
