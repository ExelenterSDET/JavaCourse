package Day31.Practice.Andrea;

import java.util.Arrays;
import java.util.HashSet;

public class JavaSetAddAll{
    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,3,5,7,9));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(11,2,3,4,5,6,7));

//       set1.addAll(set2); //combine with no duplicates
//       System.out.println(set1);

//       set1.retainAll(set2); //elements in both
//       System.out.println(set1);

        set2.removeAll(set1);
        System.out.println(set2);



    }
}
