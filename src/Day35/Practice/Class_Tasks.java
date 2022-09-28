package Day35.Practice;

import java.util.HashMap;
import java.util.Map;

public class Class_Tasks {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("a", "candy");
        map.put("b", "dirt");
        map.put("c", "meh");

        System.out.println(map);
        Map<String, String> stringStringMap = mapBully(map);
        System.out.println(stringStringMap);

    }

    public static Map<String, String> mapBully(Map<String, String> map) {
        if(map.get("a") != null){
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    public static Map<String, String> mapBully2(Map<String, String> map) {
        map.computeIfPresent("b", (k,v)-> v=map.get("a"));
        map.computeIfAbsent("b", (k) -> map.get("a"));
        map.put("a", "");

        return map;
    }
}
