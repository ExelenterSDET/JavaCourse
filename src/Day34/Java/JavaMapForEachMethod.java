package Day34.Java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaMapForEachMethod {
    public static void main(String[] args) {
        HashMap<String, Integer> map =  new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
        map.put("d", 40);
        map.put("e", 50);
        map.put("f", 60);
        map.put("g", 70);

        for(String key : map.keySet()){
            System.out.print(key + " = " + map.get(key) + "; ");
        }
        System.out.println();
        System.out.println("===================");
        for(Map.Entry<String, Integer> row : map.entrySet()){
            System.out.print(row.getKey() + " = " + row.getValue()+ "; ");
        }

        System.out.println();
        System.out.println("=====================");

        // foreach | entry set
        map.forEach((key,value) -> {System.out.print(key + " = " + value + "; ");});

        System.out.println();
        System.out.println("=====================");

        // foreach | keySet
        map.keySet().forEach((k) -> System.out.print(k + " = " + map.get(k) + "; "));

        System.out.println();
        System.out.println("=====================");

        // foreach | values
        map.values().forEach((value) -> System.out.print(value + "; "));

    }
}
