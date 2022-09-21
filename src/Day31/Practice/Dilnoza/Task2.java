package Day31.Practice.Dilnoza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task2 {


    /*
    Create a method with the parameter and return type of List of the list of Characters
    Method should return Characters in decending order
    {c,a,b,e,y}= {y,e,c,b,a}
     */

        public static void main(String[] args) {


            ArrayList<ArrayList<Character>>charList=new ArrayList<>();
            charList.add(new ArrayList<>(Arrays.asList('n','e','w', 'y','o','r','k')));
            charList.add(new ArrayList<>(Arrays.asList('t','o','r','o','n','t','o')));
            charList.add(new ArrayList<>(Arrays.asList('m','o','s','c','o','w')));
            ArrayList<ArrayList<Character>> aChar = getChar(charList);
            System.out.println("aChar = " + aChar);

            ArrayList<ArrayList<Character>>charList2=new ArrayList<>();
            charList2.add(new ArrayList<>(Arrays.asList('c', 'a', 'b', 'e', 'y')));
            getChar(charList2);
            System.out.println("charList2 = " + charList2);

        }



        static  ArrayList<ArrayList<Character>> getChar(ArrayList<ArrayList<Character>> charsList){


            for (ArrayList<Character> characters : charsList) {
                //  Collections.sort(characters);
                Collections.reverse(characters);


            }
            return charsList;
        }
}
