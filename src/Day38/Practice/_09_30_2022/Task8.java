package Day38.Practice._09_30_2022;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task8 {

    /*Task 8
    Create a method which will have as a parameter an array of strings.
    Return a Map<String, Boolean> where each different string is a key and
    its value is true if that string appears 2 or more times in the array.

    Example:
     i = 1    a
            ["a", "b", "a", "c", "b"]
     j = 0    a
    Result:
    {"a": true, "b": true, "c": false}*/

    static Map<String,Boolean> checkMap (String[] str){

        Map<String, Boolean> map = new HashMap<>();

        for (int i = 0; i <str.length ; i++) {
            for (int j = 0; j < str.length ; j++) {
                //     a             c
                if(str[i].equals(str[j]) && (i != j)){
                    map.put(str[i], true);
                    break;
                }else if (!str[i].equals(str[j]) && (i !=j)){

                    map.put(str[i], false);
                }
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String[]arr = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> stringBooleanMap = checkMap(arr);
        System.out.println(stringBooleanMap);
    }
}
