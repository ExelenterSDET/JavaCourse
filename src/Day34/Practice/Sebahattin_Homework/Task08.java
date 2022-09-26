package Day34.Practice.Sebahattin_Homework;

import java.util.HashMap;
import java.util.Map;

public class Task08 {
/*
            Create a method which will have as a parameter an array of strings.
           Return a Map<String, Boolean> where each different string is a key and
           its value is true if that string appears 2 or more times in the array.

           Example:
           []
           Result:
           {"a": true, "b": true, "c": false}
 */
    public static void main(String[] args) {
        String []str = {"a", "b", "a", "c", "b","z","b"};
        System.out.println(getMap(str));
    }
    static Map<String,Boolean> getMap (String[] str){
        HashMap<String, Boolean> map = new HashMap<>();
        for (String s : str) {
            if (!map.containsKey(s)) {
                map.put(s, false);
            } else {
                map.put(s, true);
            }
        }
        return map;
    }
}
