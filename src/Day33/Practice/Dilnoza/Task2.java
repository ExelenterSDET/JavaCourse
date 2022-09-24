package Day33.Practice.Dilnoza;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task2 {
    /*

        Print all values
        */
    public static void main(String[] args) {


        HashMap<String, Integer> map =  new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
        map.put("d", 40);
        map.put("e", 50);
        map.put("f", 60);
        map.put("g", 70);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println("entries = " + entries);
        System.out.println("______________________Values________________");
        for(Map.Entry<String, Integer> rows: map.entrySet()){
            System.out.println("values = " + rows.getValue());
        }
        System.out.println("______________________Keys________________");
        for(Map.Entry<String, Integer> row: map.entrySet()){
            System.out.println("keys = " + row.getKey());
        }
        System.out.println("______________________SetValue________________");

        for(Map.Entry<String, Integer> row: map.entrySet()){
            System.out.println("SetValue = " + row.setValue(200));
        }
    }

}
