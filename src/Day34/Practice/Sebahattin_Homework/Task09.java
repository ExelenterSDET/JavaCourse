package Day34.Practice.Sebahattin_Homework;

import java.util.HashMap;

public class Task09 {
/*
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
public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    map.put("spinach", "dirt");
    map.put("ice cream", "cherry");
    System.out.println(map);
    System.out.println(modifyMap(map));
}
    static HashMap<String, String> modifyMap (HashMap<String, String> map1){
        HashMap<String, String> newMap = new HashMap<>(map1);
        String temp = newMap.get("ice cream");
        newMap.put("yogurt", temp);
        newMap.replace("spinach", "nuts");
        return newMap;
    }

}
