package Day35.Practice.Ibrahim_35;

import java.util.HashMap;

/*
 Given an array of strings, return a Map<String, Integer> containing a
 key for every different string in the array, and the value is that string's length.


wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
 */
public class Task3 {

    static  HashMap<String, Integer> wordlen (String[] str){
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : str) {
            map.computeIfAbsent(s, k -> s.length());
        }
        return map;
    }

    public static void main(String[] args) {
       String[] str = {"a", "bb", "a", "bb"};
       System.out.println(" wordlen(str) = " +  wordlen(str));
    }
}
