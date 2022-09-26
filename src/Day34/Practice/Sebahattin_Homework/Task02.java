package Day34.Practice.Sebahattin_Homework;

import java.util.ArrayList;

public class Task02 {
/*
        Create a method, which will return a character and parameter is a String.

        Given a string consisting of lowercase Latin Letters.
        Return the first non-repeating character in the string.
        If there is no non-repeating character, return '$'.

        Example:
        String = zxvczbtxyzvy

        Result: c
 */
    public static void main(String[] args) {
    String str = "zxvczbtxyzvy";
        System.out.println(str);
        System.out.println(getNonRepeatingChar(str));
    }
    static char getNonRepeatingChar (String str) {
        ArrayList<Character> charList = new ArrayList<>();
        for (char c : str.toCharArray()) {
            charList.add(c);
        }
        System.out.println(charList);

        ArrayList<Character> backupCharList = new ArrayList<>(charList);
        for (int i = 0; i < backupCharList.size(); i++) {
            char ch = backupCharList.get(i);
            backupCharList.removeIf(n -> (n != ch));
            if (backupCharList.size() == 1) {
                return backupCharList.get(0);
            }
            backupCharList = new ArrayList<>(charList);
        }
        return '$';
    }
}
