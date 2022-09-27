package Day34.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arthurday34tsk3 {
    public static void main(String[] args) {

        ArrayList<Integer> me = new ArrayList<>(Arrays.asList(1, 2, 3, 21, 34, 200, 23, 64, 66, 67));

        System.out.println(me(me));


    }

    static ArrayList<Integer> me(ArrayList<Integer> arr) {
        ArrayList<Integer> dummyList = new ArrayList<>();
        Collections.sort(arr);
        return arr;

    }
}
