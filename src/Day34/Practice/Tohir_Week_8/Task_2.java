package Day34.Practice.Tohir_Week_8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task_2 {
    public static void main(String[] args) {
        Task_2 asg = new Task_2();
        String str = "mgmmmfffeeefgababdd";
        System.out.println(str);
        System.out.println(asg.uniquelist(str));
        System.out.println(" = " + asg.sumofchars(str));
        System.out.println(" = " + asg.returnfirst(asg.sumofchars(str),str));

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

        String[] strsplit = str.split("");

        HashMap<String, Integer> charHash = new HashMap<>();
        for (int i = 0; i < strsplit.length; i++) {
            charHash.computeIfPresent(strsplit[i], (k, v) -> v += 1);
            charHash.computeIfAbsent(strsplit[i], k -> 1);
        }
        return charHash;
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
    char returnfirst(HashMap<String, Integer> sumofchars, String uniquelist)
    {
        String retrn = "$";
        String[] splituniq = uniquelist(uniquelist).split("");
      outreloop:
        for (String s : splituniq) {
            Innerloop:
            for (Map.Entry<String,Integer> row:sumofchars.entrySet())
            {
                if (s.equals(row.getKey())&&row.getValue()==1)
                {
                    retrn = row.getKey();
                    break outreloop;
                }

            }
        }
        return retrn.charAt(0);
        //return splituniq;
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