package Day34.Practice.SaturdayProject7Andrea;

import java.util.HashMap;
import java.util.Map;

public class Task8 {
//    Task 8
//
//    Create a method which will have as a parameter an array of strings.
//    Return a Map<String, Boolean> where each different string is a key and
//    its value is true if that string appears 2 or more times in the array.
//
//    Example:
//            ["a", "b", "a", "c", "b"]
//    Result:
//    {"a": true, "b": true, "c": false}

    public static void main(String[] args) {
        Task8 t8 = new Task8();

        String[] arr = new String[]{"a", "b", "a", "c", "b"};
        Map<String, Boolean> stringBooleanMap = t8.hasDuplicatedValues(arr);
        System.out.println("stringBooleanMap = " + stringBooleanMap);
    }


    Map<String, Boolean> hasDuplicatedValues(String[] array) {
        HashMap<String, Boolean> map = new HashMap<>();
        for (String s : array) {
            if (!map.containsKey(s)) {
                map.put(s, false);
            } else {
                map.put(s, true);
            }
        }
        return map;

    }
}
