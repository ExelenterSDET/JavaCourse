package Day29.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArtDay29tsk5 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(new ArrayList<>(Arrays.asList(
                "1", "3", "5", "7"
        )));

        ArrayList<String> list2 = new ArrayList<>(new ArrayList<>(Arrays.asList(
                "2", "4", "6"
        )));

        System.out.println("walterNate(list1,list2) = " + walterNate(list1, list2));

    }


    static ArrayList<String> walterNate(ArrayList<String> list1, ArrayList<String> list2) {
        int lst1size = list1.size();
        int lst2size = list2.size();

        if (lst1size >= lst2size) {
            for (int i = 0; i < list2.size(); i++) {
                if (i < lst2size) {
                    list1.add(2*i + 1, list2.get(i));
                }

            }
            return list1;
//(isIndexOutOfBounds(list, index)
        } else {
            for (int i = 0; i < list2.size(); i++) {
                if (2*i<=lst1size) {
                    list1.add(2*i + 1, list2.get(i));

                } else {
                    list1.add(list2.get(i));
                }
            }
            return list1;

        }
    }

}
