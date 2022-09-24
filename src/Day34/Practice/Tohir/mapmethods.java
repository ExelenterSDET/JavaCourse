package Day34.Practice.Tohir;

import java.util.HashMap;

public class mapmethods {
    public static void main(String[] args) {
        HashMap<String, Integer> map =  new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
        map.put("d", 40);
        map.put("e", 50);
        map.put("f", 60);
        map.put("g", 70);
        map.compute("a",(key,value)->value+10);
        System.out.println("map = " + map);
        map.computeIfPresent("d",(key,value)->value+50);
        System.out.println("map = " + map);
        map.computeIfAbsent("ab",key->15);
        System.out.println("map = " + map);
    }
}
