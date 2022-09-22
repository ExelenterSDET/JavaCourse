package Day32.Practice.Andrea;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class JavaTreeSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(Arrays.asList(5,2,1,0,7,6,5,-2));
        TreeSet<Integer> ls = new TreeSet<>(hs);
        ls.add(-10);
        hs.add(-10);
        ls.add(100);
        hs.add(100);

        System.out.println(hs);
        System.out.println(ls);

    }
}
