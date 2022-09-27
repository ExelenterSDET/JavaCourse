package Day34.Practice._09_26_2022_Mentoring_SP7;

import java.util.HashMap;

public class Task9 {
        /*    Task 9

          Given a HashMap<String, String>.
          The map has keys and values as follow:
          {"spinach": "dirt", "ice cream": "cherry"}


          Create a method with HashMap<String, String> parameter, return same type of map.
          The method should modify the map as follow:

          if the key is "ice cream", create a new key as "yogurt" and value should be the same as for "ice cream".
          If the key is "spinach", change that value to "nuts".

          Example:
          {"spinach": "dirt", "ice cream": "cherry"}

          Result:
          {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
          */

    static HashMap<String, String> modifyFood(HashMap<String, String> map){
        if (map.containsKey("ice cream")){
            map.computeIfAbsent("yogurt", k -> map.get("ice cream"));
        }
        if (map.containsKey("spinach")){
            map.computeIfPresent("spinach", (k, v) -> "nuts");
        }
        return map;
    }
}
