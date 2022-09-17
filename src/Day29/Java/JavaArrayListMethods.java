package Day29.Java;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("aba", "ddd", "oop"));

       list.add("xyz");
       list.add(0, "yob");
       list.add(5, "test");
       list.add(list.size(), "test2"); // max index should be the size of the list
                                       // min index should be 0
        System.out.println(list);


        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list);

        list2.add("difference");
        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>();

        for (String s : list) {
            list3.add(s);
        }

    }
}
