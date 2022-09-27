package Day34.Practice;

import java.util.HashMap;

public class SaturdayProjectMehmetAliTask09 {
    /*Task 9
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
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("spinach", "dirt");
        map1.put("ice cream", "cherry");

        modify(map1);
    }

    static HashMap<String, String> modify(HashMap<String, String> map) {

//        map.computeIfPresent("ice cream", (k,v) -> {map.put("yogurt",map.get(k));});
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }

        map.computeIfPresent("spinach", (k, v) -> v = "nuts");

        System.out.println("map1 = " + map);
        return map;
    }
}