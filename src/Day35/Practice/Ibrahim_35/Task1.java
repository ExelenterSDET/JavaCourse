package Day35.Practice.Ibrahim_35;

import java.util.HashMap;

public class Task1 {

/*
Modify and return the given map as follows:
if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "".
Basically "b" is a bully, taking the value and replacing it with the empty string.


mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
 */


    static HashMap<String , String> modifyMap(HashMap<String , String> map){

        if (!map.get("a").isEmpty()){
            map.computeIfAbsent("b", k-> map.get("a"));
            map.computeIfPresent("b", (k,v)-> v = map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "candy");
        map.put("b", "dirt");
        map.put("c", "meh");


        modifyMap(map);
        System.out.println("map = " + map);
    }


}


