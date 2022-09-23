package Day33.Practice.Andrea;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaMapLoopsEntrySet {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
        map.put("d", 40);
        map.put("e", 50);
        map.put("f", 60);
        map.put("g", 70);

      // example ->  Set<Map.Entry<String, Integer>> entries = map.entrySet();

        for(Map.Entry<String, Integer> row : map.entrySet()){
            System.out.println("key -> " + row.getKey() + ": value -> " + row.getValue());
        }

        //print only values:
        for(Map.Entry<String, Integer> row : map.entrySet()){
            System.out.println("value -> " + row.getValue());
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println(entries);

        for(Map.Entry<String, Integer> row : map.entrySet()){
            System.out.println("value -> " + row.setValue(100)); //not doing what it's supposed to do
        }

    }
}
