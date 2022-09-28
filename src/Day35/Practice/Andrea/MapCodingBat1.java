package Day35.Practice.Andrea;

import java.util.HashMap;
import java.util.Map;

public class MapCodingBat1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "candy");
        map.put("b", "dirt");
        map.put("c", "meh");

        System.out.println(map);
        System.out.println(mapBully(map));
    }
    static public Map<String, String> mapBully(Map<String, String> map) {

        if (map.get ("a") != null){
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }
}
