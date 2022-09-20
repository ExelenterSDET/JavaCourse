package Day29.Practice.Andrea;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListContains {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        int size = list.size();
        System.out.println("size = " + size);
        
        boolean contains = list.contains(5);
        System.out.println("contains = " + contains);

    }
}
