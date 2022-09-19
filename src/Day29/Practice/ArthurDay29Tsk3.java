package Day29.Practice;

import java.util.ArrayList;

public class ArthurDay29Tsk3 {
    public static void main(String[] args) {

    }
    static ArrayList<String> notInTwo(ArrayList<String> list1, ArrayList<String> list2){


        list1.removeAll(list2);
        return list1;
    }
}
