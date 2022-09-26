package Day34.Practice.Dilnoza;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class groupProjectTask2 {
    /*
     Task 2

        Create a method, which will return a character and parameter is a String.
        Given a string consisting of lowercase Latin Letters.
        Return the first non-repeating character in the string.
        If there is no non-repeating character, return '$'.
        Example:
        String = zxvczbtxyzvy
        Result: c

     */
    public static void main (String[]args){
        groupProjectTask2 t2 = new groupProjectTask2();
        String text = "zxvczcbbttxyzvy";
        System.out.println("firstUnique = " + t2.getFirstUnique(text));

    }
            Character getFirstUnique (String str) {
                HashMap<Character, Integer> charList = new LinkedHashMap<>();
                Character ch;

                for (int i = 0; i < str.length(); i++) {
                    ch = str.charAt(i);
                    if (charList.containsKey(ch)) {
                        charList.put(ch, charList.get(ch) + 1);
                    } else {
                        charList.put(ch, 1);
                    }  }
                    for (Entry<Character, Integer> entry : charList.entrySet()) {
                        if (entry.getValue() == 1)
                            return entry.getKey();
                    }
                    return '$';

            }

    }

