package Day29.Practice.Andrea;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("aba","ddd","oop"));

        list.add("xyz"); //don't need to say list == list.add()
        list.add(0, "yob");
        list.add(5, "test"); //maximum index should be size of list (min is 0)
        System.out.println("list = " + list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list);

        System.out.println("list2 = " + list2);
        list2.add("difference");
        System.out.println("list2 = " + list2);

        ArrayList<String> list3 = new ArrayList<>();

        for (String s : list) {
            list3.add(s); //Iteration can be replaced with bulk 'Collection.addAll()' call

        }


    }
}
