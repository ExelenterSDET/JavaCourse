package Day34.Practice.Dilnoza;

import java.util.HashMap;

public class groupProjectTask9 {
    /*
    Task 9

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

   static HashMap<String, String> modifyMap(HashMap<String , String> list){
        if(list.containsKey("yogurt")){
            list.computeIfAbsent("yogurt", k->list.get("ice cream"));}
        if(list.containsKey("spinach")){
            list.computeIfPresent("spinach",(k,v)-> v="cherry" );
        }
        return list;

    }

    public static void main(String[] args) {
       HashMap<String, String>newMap= new HashMap<>();
       newMap.put("spinach","dirt");
       newMap.put("ice-cream", "cherry");
        System.out.println(modifyMap(newMap));
    }





}
