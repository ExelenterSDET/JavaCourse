package Day33.Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaMapLoops {
    public static void main(String[] args) {

        HashMap<Integer, String> errorCodes = new HashMap<>();
        errorCodes.put(200, "OK");
        errorCodes.put(201, "Created");
        errorCodes.put(202, "Accepted");
        errorCodes.put(203, "Non-Authoritative Information");
        errorCodes.put(204, "No Content");


        //  public Set keySet(): This method is used to return the Set view containing all the keys.
        Set<Integer> integers = errorCodes.keySet();
        System.out.println(integers);

        // public Set entrySet(): This method is used to return the Set view containing all the keys and values.
        Set<Map.Entry<Integer, String>> entries = errorCodes.entrySet();
        System.out.println(entries);

        System.out.println("=================================");

//        for (Integer key : errorCodes.keySet()) {
//            if (key > 202){
//                errorCodes.put(key, "OK-OK");
//            }
//            System.out.println("key is = " + key + ": value is " + errorCodes.get(key) );
//        }

        // Task1
        // if the value of the map is Accepted, change the value to Confirmed

        for(Integer key: errorCodes.keySet()){
            if(errorCodes.get(key).equals("Accepted")){
                errorCodes.replace(key, "Confirmed");
            }
        }

        // Task2
        // modify all values in the map to the Upper Case.

        System.out.println(errorCodes);

        for(Integer key: errorCodes.keySet()){
            errorCodes.replace(key, errorCodes.get(key).toUpperCase());
        }
        System.out.println(errorCodes);

        // Task3

        HashMap<String, Integer> map =  new HashMap<>();
        map.put("a", 10);
        map.put("b", 10);
        map.put("c", 10);
        map.put("d", 10);
        map.put("e", 10);
        map.put("f", 10);
        map.put("g", 10);

        /*
         Task 4
         if key = a, add to value 10;
         if key = b, add to value 20;
         if key = c, add to value 30;
         if key = d, add to value 40;
         if key = e, add to value 50;
         if key = f, add to value 60;
         if key = g, add to value 70;
*/
        for(String key : map.keySet()){
            int addValue = 0;
            switch(key){
                case "a": addValue = 10; break;
                case "b": addValue = 20; break;
                case "c": addValue = 30; break;
                case "d": addValue = 40; break;
                case "e": addValue = 50; break;
                case "f": addValue = 60; break;
                case "g": addValue = 70; break;
            }
            map.put(key, map.get(key)+addValue);
        }

        System.out.println(map);

        for(String key : map.keySet()){
            switch(key){
                case "a": map.put(key, map.get(key)+10); break;
                case "b": map.put(key, map.get(key)+20); break;
                case "c": map.put(key, map.get(key)+30); break;
                case "d": map.put(key, map.get(key)+40); break;
                case "e": map.put(key, map.get(key)+50); break;
                case "f": map.put(key, map.get(key)+60); break;
                case "g": map.put(key, map.get(key)+70); break;
            }
        }
        System.out.println(map);
    }
}
