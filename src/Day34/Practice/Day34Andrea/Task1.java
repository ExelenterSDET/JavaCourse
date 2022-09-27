package Day34.Practice.Day34Andrea;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map =  new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
        map.put("d", 40);
        map.put("e", 50);
        map.put("f", 60);
        map.put("g", 70);

        map.forEach((key,value) -> System.out.print(key + " = " + value + ": "));
        System.out.println();
        System.out.println("=================================================");

        map.keySet().forEach((key) -> System.out.print(key + " = " + map.get(key) + "; " ));
        System.out.println();
        System.out.println("=================================================");

        map.values().forEach((value) ->System.out.print(value + "; "));
        System.out.println();
        System.out.println("=================================================");

        map.forEach((key,value) -> {
            if (key.equals("a")) {
                map.put(key, map.get(key) + 10);
            } else if (key.equals("b")) {
                map.put(key, map.get(key) + 20);
            } else if (key.equals("c")) {
                map.put(key, map.get(key) + 30);
            } else if (key.equals("d")) {
                map.put(key, map.get(key) + 40);
            } else if (key.equals("e")) {
                map.put(key, map.get(key) + 50);
            } else if (key.equals("f")) {
                map.put(key, map.get(key) + 60);
            } else if (key.equals("g")) {
                map.put(key, map.get(key) + 70);
            }
            System.out.println("key is = " + key + ": value is " + map.get(key));

        });



    }
}
