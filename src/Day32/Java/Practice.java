package Day32.Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map1 = new HashMap<>();


        int a = 10;
        int b = 11;
        int c = 11;
        int d = 12;
        int e = 12;

        map.put("a",10);
        map.put("b",11);

        map1.putAll(map);

        System.out.println(map1);
        map1.remove("a");
        System.out.println(map1);

        System.out.println( map.get("b"));

        System.out.println(map1.getOrDefault("a",0));

        System.out.println(map1.containsValue(11));
        System.out.println(map1.containsKey("b"));

        Set<String> strings = map.keySet();
        map.entrySet();


    }
}
