package Day32.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class JavaCollectionForEachLoop {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 1, 0, 9, 7, 6, 4, 3, -2));

        LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(5,2,1,0,9,7,6,5,4,3,-2));

        list.forEach((number) -> { number = number + 100; System.out.print(number + " ");} );
        System.out.println();
        System.out.println("================");
        set.forEach((a) -> {
            if(a>5){
                a += 120;
            } else
            {
                a+=500;
            }
            System.out.print(a + " ");
        });
    }
}
