package Malika;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Tasks_Map_EntrySet {
    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
        map.put("d", 40);
        map.put("e", 50);
        map.put("f", 60);
        map.put("g", 70);

        //TASK1
        /* Print all values */

        for (Map.Entry<String, Integer> row : map.entrySet()){
            System.out.println(" value => " + row.getValue() + " ");
        }
        System.out.println();
        
    }
}
