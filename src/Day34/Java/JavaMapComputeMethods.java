package Day34.Java;

import java.util.HashMap;

public class JavaMapComputeMethods {
    public static void main(String[] args) {
        HashMap<String, Integer> map =  new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
        map.put("d", 40);
        map.put("e", 50);
        map.put("f", 60);
        map.put("g", 70);

//        map.compute("h", (k,v) -> v+10);
//        map.replace("b", map.get("b") + 20);
//        map.put("c", map.get("c")+ 30);
//
        map.computeIfPresent("a", (k,v) -> v+10);
        map.computeIfAbsent("h", (k) -> 100);

        System.out.println(map);
    }
}
