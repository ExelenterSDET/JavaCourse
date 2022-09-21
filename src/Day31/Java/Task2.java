package Day31.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task2 {

    /*
    Create a method with the parameter and return type of List of Lists of Character.
    Method should return the characters in desc order.

    Example:
    {c, a, b, e, y} => output = > {y, e, c, b, a}
     9.00 - 9.10
     */

    static void reverseList(ArrayList<ArrayList<Character>> list){
        for (ArrayList<Character> characters : list) {
            Collections.sort(characters);
            Collections.reverse(characters);
        }
    }

    static ArrayList<Character> reverseList2(ArrayList<ArrayList<Character>> list){
        ArrayList<Character> list2 = new ArrayList<>();
        for (ArrayList<Character> characters : list) {
            list2.addAll(characters);
        }
        Collections.sort(list2);
        Collections.reverse(list2);
        return list2;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Character>> list = new ArrayList<>();
        list.add(new ArrayList<Character>(Arrays.asList('n','e','w','y','o','r','k')));
        list.add(new ArrayList<Character>(Arrays.asList('t','o','r','o','n','t','o')));
        list.add(new ArrayList<Character>(Arrays.asList('m','o','s','c','o','w')));

        reverseList(list);
        System.out.println(list);

        ArrayList<Character> characters = reverseList2(list);
        System.out.println(characters);


    }
}
