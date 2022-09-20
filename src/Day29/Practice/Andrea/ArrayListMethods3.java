package Day29.Practice.Andrea;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods3 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        boolean b = list1 == list2; //can't use this way to compare - always false
        System.out.println(b);

        int i = list1.indexOf(4);
        System.out.println("i = " + i);

        int i1 = list1.lastIndexOf(6);
        System.out.println("i1 = " + i1);

        boolean b1 = list1.equals(list2); //right way to compare array lists
        System.out.println("b1 = " + b1);

        ArrayList<Integer> list3 = list1;
        list3.set(0,100);
        list3.set(1, 200);
        System.out.println("list1 = " + list1);
        System.out.println("list3 = " + list3); // both are the same now

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(list1); //right way to copy one array list to another
        System.out.println("list4 = " + list4);

        boolean empty = list4.isEmpty();
        System.out.println("empty = " + empty);
        list4.clear();
        System.out.println("empty = " + empty);






    }

}
