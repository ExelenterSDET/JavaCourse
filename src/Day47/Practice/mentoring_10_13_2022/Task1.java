package Day47.Practice.mentoring_10_13_2022;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    // find first non repeating char in a string and return its index else return -1
    static int nonRepeatedCharIndex(String str){
        HashMap<Character, Integer>map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
        }
        // mom
        for (int i = 0; i < str.length(); i++) {
            if(map.get(str.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "leetcode";
        int i = nonRepeatedCharIndex3(str);
        System.out.println(i);
    }
    static int nonRepeatedCharIndex2(String str){
        HashMap<Character, Integer>map = new HashMap<>();
       int min = Integer.MAX_VALUE;

        for (int i = 0; i < str.length(); i++) {
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),i);
            }else {
                map.put(str.charAt(i), -1);
            }
        }

        for (Character eachChar:map.keySet()) {
                if(map.get(eachChar) > -1 && map.get(eachChar) < min){
                    min = map.get(eachChar);
                }
        }
        if(min < Integer.MAX_VALUE){
            return min;
        }
        return -1;
       // return min == Integer.MAX_VALUE ? -1 : min;
    }
    static int nonRepeatedCharIndex3(String str){
        int result = Integer.MAX_VALUE;;
        int firstOccurrence = -1;
        for (char i = 'a';  i<= 'z' ; i++) {
             firstOccurrence = str.indexOf(i);
            if(firstOccurrence != -1 && firstOccurrence == str.lastIndexOf(i)){
                result = Math.min(firstOccurrence, result);
            }
        }
        if(result == Integer.MAX_VALUE){
            return -1;
        }
        return result;
    }
}

// Find smallest number in array and find the largest number in the same array (using loop)
