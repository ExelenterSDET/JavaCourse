package Day34.Practice;

import java.util.HashMap;
import java.util.Scanner;

public class Ufuktask2 {
    /* Task 2
        Create a method, which will return a character and parameter is a String.
        Given a string consisting of lowercase Latin Letters.
        Return the first non-repeating character in the string.
        If there is no non-repeating character, return '$'.

        Example:
        String = zxvczbtxyzvy

        Result: c
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String str=scan.next();
        findRepeat(str);

    }

    static char findRepeat(String str){
        char ch='$';
        char[] chliste=str.toLowerCase().toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for (char item: chliste){
            map.put(item,map.getOrDefault(item,0)+1);
        }
        System.out.println(map);
        for (int i = 0; i < chliste.length; i++) {
            if(map.get(chliste[i])==1){
                ch = chliste[i];
                break;
            }
        }
        System.out.println(ch);
        return ch;
    }
}
