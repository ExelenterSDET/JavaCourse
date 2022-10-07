package Day34.Practice.Anthony.GP7;

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
     public static void main(String[] args) {
         HashMap<String, String> map1 = new HashMap<>();
         map1.put("spinach", "dirt");
         map1.put("ice cream", "cherry");

         modifyFood(map1);
     }

    static HashMap<String, String> modifyFood(HashMap<String, String> map){
        if (map.containsKey("ice cream")){
            map.computeIfAbsent("yogurt", k -> map.get("ice cream"));
        }
        if (map.containsKey("spinach")){
            map.computeIfPresent("spinach", (k, v) -> "nuts");
        }

        System.out.println("map = " + map);
        return map;
    }


}
