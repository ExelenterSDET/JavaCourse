package Day29.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class JavaRemoveIfMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(
                "Java",
                "Happy",
                "New York",
                "New Jersey",
                "Toronto"

        ));
        System.out.println(list);
        // Task: remove if a string starts with N

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).startsWith("N")){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);

        // same task with removeIf ==> with Predicate

        list.add("New York");
        list.add("New Jersey");

        list.removeIf((str) -> str.startsWith("N"));
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(
                1,2,3,5,6,8,0,669,5,6,4,6,2,3,47,55,32
        ));
        System.out.println(list2);
        list2.removeIf((number) -> number<30);
        System.out.println(list2);


    }
}
