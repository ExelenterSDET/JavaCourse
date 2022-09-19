package Day29.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArtDay29tsk4 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(new ArrayList<>(Arrays.asList(
                "1","2","3","4"
        )));

        ArrayList<String> list2= new ArrayList<>(new ArrayList<>(Arrays.asList(
                "1","4","5","9"
        )));

        System.out.println("inNotBoth(list1,list2) = " + inNotBoth(list1,list2));

    }

    static ArrayList<String> inNotBoth(ArrayList<String> list1, ArrayList<String> list2){
        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(list1);
        list1.removeAll(list2);
        list2.removeAll(list3);

        list2.addAll(list1);
        return list2;
    }
}
