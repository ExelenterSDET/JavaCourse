package Day31.Practice.Andrea;

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
        set.add(1); //will not accept duplicates

        System.out.println(set);

    }


}
