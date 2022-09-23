package Day32.Practice.Andrea;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetsExample {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>(Arrays.asList(5,2,1,0,7,6,5,-2));
        LinkedHashSet<Integer> ls = new LinkedHashSet<>(Arrays.asList(5,2,1,0,7,6,5,-2));

        System.out.println("hs = " + hs);
        System.out.println("ls = " + ls);

        
    }
}
