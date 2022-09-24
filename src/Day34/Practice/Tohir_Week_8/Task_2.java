package Day34.Practice.Tohir_Week_8;

import java.util.HashMap;
import java.util.Map;

public class Task_2 {
    public static void main(String[] args) {
        Task_2 asg = new Task_2();
        String str = "madom";
        System.out.println(" = " + asg.sumofchars(str));
       // System.out.println(" = " + asg.nonRepeated("merosadsadadz"));

    }

    char nonRepeated(HashMap<String,Integer> charHash)
    {
        char c = '\0';
        for (Map.Entry<String,Integer> row:charHash.entrySet())
        {
            if (row.getValue()==1)
            {
                c = row.getKey().charAt(0);
                break;
            }
            else
            {
            c = '$';
            }
        }
        return c;
    }
    HashMap<String,Integer> sumofchars(String str)
    {
        String[] strsplit = str.split("");
        HashMap<String,Integer> charHash = new HashMap<>();
        for (int i = 0; i < strsplit.length; i++) {
            charHash.computeIfPresent(strsplit[i],(k,v)->v+=1);
            charHash.computeIfAbsent(strsplit[i],k->1);
        }
        return charHash;
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