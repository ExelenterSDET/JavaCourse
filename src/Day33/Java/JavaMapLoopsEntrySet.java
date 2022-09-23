package Day33.Java;

import java.util.*;

public class JavaMapLoopsEntrySet {
    public static void main(String[] args) {
        HashMap<String, Integer> map =  new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
        map.put("d", 40);
        map.put("e", 50);
        map.put("f", 60);
        map.put("g", 70);

        for(Map.Entry<String, Integer> row: map.entrySet()){
            System.out.println("key -> " + row.getKey() + ": value -> " + row.getValue());
        }
        // Task 1
        // print all values
        for(Map.Entry<String, Integer> row: map.entrySet()){
            int addValue = 0;
            switch(row.getKey()){
                case "a": addValue = 10; break;
                case "b": addValue = 20; break;
                case "c": addValue = 30; break;
                case "d": addValue = 40; break;
                case "e": addValue = 50; break;
                case "f": addValue = 60; break;
                case "g": addValue = 70; break;
            }
            System.out.println(": value -> " + row.setValue(row.getValue()+addValue));
        }

        System.out.println(map);




    }
}
