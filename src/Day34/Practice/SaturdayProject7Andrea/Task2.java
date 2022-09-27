package Day34.Practice.SaturdayProject7Andrea;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Task2 {

//    Task 2
//
//    Create a method, which will return a character and parameter is a String.
//    Given a string consisting of lowercase Latin Letters.
//    Return the first non-repeating character in the string.
//    If there is no non-repeating character, return '$'.
//
//    Example:
//    String = zxvczbtxyzvy
//
//    Result: c

    public static void main(String[] args) {

        String letters = "zxvczbtxyzvy"; //output should be c
        String letters2 = "fofokwkkweecuuc"; //output should be $
        String letters3 = "zrrllrllioopp"; //output should be z

        System.out.println(getChar2(letters));
        System.out.println(getChar2(letters2));
        System.out.println(getChar2(letters3));
    }

    static Character getChar(String str) {
        HashMap<Character, Integer> chMap = new LinkedHashMap<Character, Integer>();
        Character ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (chMap.containsKey(ch)) {
                chMap.put(ch, chMap.get(ch) + 1);
            } else {
                chMap.put(ch, 1);
            }
        }
        for (Entry<Character, Integer> entry : chMap.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return '$';
    }
    static Character getChar2(String str) {
        ArrayList<Character> chList = new ArrayList<>();
        char uniqueChar = ' ';

        for (char c : str.toLowerCase().toCharArray()) {
            chList.add(c);
        }
        ArrayList<Character> temp = new ArrayList<>(chList);
        for (int i = 0; i < chList.size(); i++) {
            char ch = chList.get(i);
            chList.removeIf(n -> n != ch);
            if (chList.size() == 1) {
                return ch;
            }
            chList = new ArrayList<>(temp);
        }
        return '$';
    }

}
