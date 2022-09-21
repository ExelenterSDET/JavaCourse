package Day31.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class JavaSet2 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>(Arrays.asList("new", "york", "toronto", "london", "york", "london"));
        set.add("moscow");

        ArrayList<String> list =  new ArrayList<>(Arrays.asList("dog", "cat", "mouse", "frog"));

        HashSet<String> set2 = new HashSet<>(list);

        System.out.println(set);
        System.out.println(set2);



    }
}
