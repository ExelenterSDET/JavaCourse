package Day35.Practice.Ibrahim_35;

import java.util.HashMap;
import java.util.HashSet;

/*
Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen,
with the value of all the strings starting with that character appended together in the order they appear in the array.


firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) → {}
 */
public class Task4 {

    static HashMap<String, String > wordlen (String[] str){
        HashMap<String, String> map = new HashMap<>();
        HashSet<String> key = new HashSet<>();


        for (String value : str) {
            map.computeIfPresent(value.substring(0,1), (k,v) -> v.concat(value));
            map.computeIfAbsent(value.substring(0,1), k-> value);

        }
        return map;
    }

    public static void main(String[] args) {
        String[] str = {"salt", "tea", "soda", "toast"};

        HashMap<String, String> wordlen = wordlen(str);
        System.out.println("str = " + wordlen);
    }

}
