package Day31.Practice.Andrea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Example {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6));
        HashSet<Integer> set = new HashSet<>(list);
        list = new ArrayList<>(set);
        System.out.println(list );
    }
}
