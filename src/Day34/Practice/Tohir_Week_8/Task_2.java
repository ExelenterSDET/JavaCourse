package Day34.Practice.Tohir_Week_8;

import java.util.HashMap;
import java.util.Map;

public class Task_2 {
    public static void main(String[] args) {
        Task_2 asg = new Task_2();
        String str = "eababd";
        System.out.println(str);
        System.out.println(asg.uniquelist(str));
        System.out.println(" = " + asg.sumofchars(str));
       // System.out.println(" = " + asg.nonRepeated(asg.sumofchars(str)));

    }

    char nonRepeated(HashMap<String, Integer> charHash) {
        char c = '\0';
        for (Map.Entry<String, Integer> row : charHash.entrySet()) {
            if (row.getValue() == 1) {
                c = row.getKey().charAt(0);
                break;
            } else {
                c = '$';
            }
        }
        return c;
    }

    HashMap<String, Integer> sumofchars(String str) {
        HashMap<String, Integer> charHash0 = new HashMap<>();
        String[] strsplit = str.split("");
        String unique = uniquelist(str);
        String[] uniqlist = unique.split("");
        for (int i = 0; i <uniqlist.length; i++) {
            charHash0.put(uniqlist[uniqlist.length-i-1],0);
        }
        /*HashMap<String, Integer> charHash = new HashMap<>();
        for (int i = 0; i < strsplit.length; i++) {
            charHash.computeIfPresent(strsplit[i], (k, v) -> v += 1);
            charHash.computeIfAbsent(strsplit[i], k -> 1);
        }*/
        return charHash0;
    }

    String uniquelist(String str)
    {
        String[] strsplit = str.split("");
        String str0 = "";
        for (int i = 0; i < strsplit.length; i++) {
            if (str0.contains(strsplit[i])==false)
            {
                str0=str0.concat(strsplit[i]);;
            }
        }
        return str0;
    }
}
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