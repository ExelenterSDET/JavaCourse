package Day31.Practice.Ibrahim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
       Create a method with the parameter and return type of List of Lists of Character.
       Method should return the characters in desc order.

       Example:
       {c, a, b, e, y} => output = > {y, e, c, b, a}

    */
public class Task2 {

    static ArrayList<ArrayList<Character >> descOrder (ArrayList<ArrayList<Character >> list){

        for (ArrayList<Character> characters : list) {
            Collections.sort(characters);
            Collections.reverse(characters);
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Character>> list = new ArrayList<>();
        list.add(new ArrayList<Character>(Arrays.asList('n','e','w','y','o','r','k')));
        list.add(new ArrayList<Character>(Arrays.asList('t','o','r','o','n','t','o')));
        list.add(new ArrayList<Character>(Arrays.asList('m','o','s','c','o','w')));

        System.out.println(descOrder(list));
    }
}
