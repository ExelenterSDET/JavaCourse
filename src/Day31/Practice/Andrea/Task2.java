package Day31.Practice.Andrea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task2 {

    public static void main(String[] args) {
        ArrayList<ArrayList<Character>> listOfLists = new ArrayList<>();


        ArrayList<Character> list1 = new ArrayList<>(Arrays.asList('c','d','t'));
        ArrayList<Character> list2 = new ArrayList<>(Arrays.asList('r','l','z'));
        ArrayList<Character> list3 = new ArrayList<>(Arrays.asList('a','v','r','e'));

        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);

        System.out.println(descendingOrder(listOfLists));
    }

    static ArrayList<ArrayList<Character>> descendingOrder (ArrayList<ArrayList<Character>> list){
        for (ArrayList<Character> characters : list) {
            Collections.sort(characters);
            Collections.reverse(characters);

        }
        return list;
        }

    }
