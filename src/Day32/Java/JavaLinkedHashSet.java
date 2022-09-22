package Day32.Java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class JavaLinkedHashSet {
    public static void main(String[] args) {

        /*
        If you want to maintain insertion order of elements
        then you can use LinkedHashSet
        maintains insertion order of objects
         */

        HashSet<Integer> hs = new HashSet<>(Arrays.asList(5,2,1,0,9,7,6,5,4,3,-2));
        LinkedHashSet<Integer> ls = new LinkedHashSet<>(Arrays.asList(5,2,1,0,9,7,6,5,4,3,-2));

        System.out.println(hs);
        System.out.println(ls);

        for (Integer l : ls) {
            if(l<5){
                System.out.print(l + " ");
            }
        }

        System.out.println("===============");
        ls.forEach(num -> {if(num<5){
            System.out.print(num + " ");
        }});


    }
}
