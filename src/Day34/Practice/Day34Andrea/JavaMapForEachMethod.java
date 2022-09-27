package Day34.Practice.Day34Andrea;

import java.util.Collection;
import java.util.HashMap;

public class JavaMapForEachMethod {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
        map.put("d", 40);
        map.put("e", 50);
        map.put("f", 60);
        map.put("g", 70);

        for (String key : map.keySet()){


        }
        //forEach entry set
        map.forEach((key,value) -> System.out.println(key + " = " + value + ": "));

        //        map.forEach((key,value) -> {
//            if (key.equals("a")) {
//                map.put(key, 100);
//                System.out.println(key + " = " + value + ": ");
//            }
//        });


        //forEach keySet (returns a set
        map.keySet().forEach((key) -> System.out.print(key + " = " + map.get(key) + "; " ));

        //forEach values
        Collection<Integer> values = map.values();
        System.out.println(values);

        map.values().forEach((value) ->System.out.println(value + "; "));



    }
}
