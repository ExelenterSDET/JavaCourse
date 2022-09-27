package Day34.Practice.Malika;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task2 {
                     //TASK2
    /* Create a method with the parameter and return type of List of List of Character.
    Method should return the characters in desc order
    */
        static void reverseList (ArrayList<ArrayList<Character>> list){
            for (ArrayList<Character> characters : list) {
                Collections.sort(characters);
                Collections.reverse(characters);
            }
        }

        public static void main(String[] args) {
            ArrayList<ArrayList<Character>> list = new ArrayList<>();
            list.add(new ArrayList<Character>(Arrays.asList('m','a','l','i','k','a')));
            list.add(new ArrayList<Character>(Arrays.asList('a','l','i','h','a','n')));
            list.add(new ArrayList<Character>(Arrays.asList('i','m','r','a','n')));

            reverseList(list);
            System.out.println(list);
    }
}
