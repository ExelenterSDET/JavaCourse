package Day32.Practice.Andrea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class JavaForEach {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,2,1,0,7,6,5,-2));
        LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(5,2,1,0,7,6,5,-2));

        list.forEach((number) ->{number = number+100; System.out.print(number + " " );});
        set.forEach((number) ->{number = number+120; System.out.print(number + " " );});


    }
}
