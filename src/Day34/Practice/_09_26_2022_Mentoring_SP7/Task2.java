package Day34.Practice._09_26_2022_Mentoring_SP7;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {
        /*    Task 2

        Create a method, which will return a character and parameter is a String.
        Given a string consisting of lowercase Latin Letters.
        Return the first non-repeating character in the string.
        If there is no non-repeating character, return '$'.

        Example:
        String = zxvczbtxyzvy // sadlkfjsad sdfkjsdk daksdfjksd SDFDfjkk

        Result: c
        */
    static char firstNonRepeatingCharacter(String str){
        str = str.toLowerCase().replaceAll("[^\\w]", "");
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.computeIfAbsent(ch, k -> 0);
            map.computeIfPresent(ch, (k, v) -> v+1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        char ch = firstNonRepeatingCharacter("kdsjASDFDS dkfjdASDF4");
        System.out.println("ch = " + ch);
    }
}
