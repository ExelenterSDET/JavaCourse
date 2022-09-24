package Day34.Practice.Day34Andrea;

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

        map.compute("a",  (k,v) -> v+3); //will throw and error is key is not there**
        map.replace("b", map.get("b")+3); //use replace and put instead of compute
        map.put("c", map.get("c")+30);
        System.out.println(map);

        map.computeIfPresent("a",  (k,v) -> v+3); //solves the error-throwing issue - use this instead of computer
        System.out.println(map);

        map.computeIfAbsent("h", (k) -> 100);
    }
}
