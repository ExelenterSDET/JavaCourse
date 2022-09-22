package Day32.Practice._09_22_2022_Mentoring;

import java.util.HashMap;

public class Task1_Maps {
    /* /*
Modify and return the given map as follows:
 if the key "a" has a value, set the key "b" to have that same value.
 In all cases remove the key "c", leaving the rest of the map unchanged.

mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
*/

    static HashMap<String, String> mapShare(HashMap<String, String> map){
        if (map.containsKey("a")){
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }

    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "bbb");
        map1.put("c", "ccc");
        System.out.println(map1);

        System.out.println(mapShare(map1));
    }
}
