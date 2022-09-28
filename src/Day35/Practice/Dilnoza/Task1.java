package Day35.Practice.Dilnoza;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    /*

Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value,
and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.

mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"
     */



   static Map<String, String> mapBully(Map<String, String > map){
              if(map.get("a")!=null){
              map.put("b",map.get("a"));
              map.put("a"," ");
       }

       return map;
       
        }

    public static void main(String[] args) {
        HashMap<String, String> newMap= new HashMap<>();
        newMap.put("a","candy");
        newMap.put("b","dirt");
        newMap.put("c", "meh");
        System.out.println("newMap = " + newMap);

        System.out.println( mapBully(newMap));
    }

    }

