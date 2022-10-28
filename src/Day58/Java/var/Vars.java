package Day58.Java.var;

import java.util.ArrayList;
import java.util.HashMap;

public class Vars {
//    var number = 0; you can not use var as global variables

    public static void main(String[] args) {
        int aa = 5;
        var a = 5;

        var str = "Hello";
        String str2 = "Hello";

        var number = 0.5;
        var fl = 0.6F;
        var b = true;

        System.out.println(a == a);
        System.out.println(str.equals(str2));
        System.out.println(str);
        System.out.println(number);
        System.out.println(fl);
        System.out.println(b);

        var list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);

        for (Integer integer : list) {
            System.out.println(integer);
        }

        String str3 = null;
//        var str4 = null; you can not set var for null objects.
        var map = new HashMap<Integer, String>();

        var list2 = new ArrayList<>();
        list2.add("String");
        list2.add(5);
        list2.add(true);
        list2.add(0.5);

        for (Object o : list2) {
            System.out.println(o);
        }
    }
}
