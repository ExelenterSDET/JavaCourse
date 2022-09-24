package Day33.Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class day33HashmapExercise {
    public static void main(String[] args) {
        HashMap<Integer,String> hash_map = new HashMap<>();
        hash_map.put(1,"Red");
        hash_map.put(2,"Green");
        hash_map.put(3,"Black");
        hash_map.put(4,"White");
        hash_map.put(5,"Blue");

        System.out.println("hash_map = " + hash_map);

        System.out.println("1. Associate the specified value with the specified key in a HashMap.");

        for (Map.Entry x: hash_map.entrySet()){
            System.out.println(x.getKey()+"="+x.getValue());
        }

        System.out.println("2. To count the number of key-value (size) mappings in a map.");
        System.out.println(hash_map.size());

        System.out.println("3. Copy all of the mappings from the specified map to another map.");
        //put all values in a secondmap
        HashMap<Integer,String> hash_map2 = new HashMap<>();
        hash_map2.putAll(hash_map);
        System.out.println("hash_map2 = " + hash_map2);

        System.out.println("4. Remove all of the mappings from a map.");
        hash_map2.clear();
        System.out.println("hash_map2 = " + hash_map2);

        System.out.println("5. Check whether a map contains key-value mappings (empty) or not.");
        boolean result1=hash_map.isEmpty();
        System.out.println(result1);

        System.out.println("7. To test if a map contains a mapping for the specified key.");
        if (hash_map.containsKey(2)){
            System.out.println("hash_map key 2 value is: "+ hash_map.get(2));}
            else{
                System.out.println("hash_map does not contain key2");
            }

        System.out.println("8. If a map contains a mapping for the specified value.");
            if (hash_map.containsValue("Gray")){
                System.out.println("the hash_map contains Green");
            }else System.out.println("No, it does not contains");

        System.out.println("9. To create a set view of the mappings contained in a map.");
        Set ent_set = hash_map.entrySet();
        System.out.println("ent_set = " + ent_set);

        System.out.println("10. To get the value of a specified key in a map.");
        System.out.println("The value for the key 3 is: "+ hash_map.get(3));

        System.out.println("11. To get a set view of the keys contained in this map.");
        Set key_set = hash_map.keySet();
        System.out.println("key_set = " + key_set);

        System.out.println("12. To get a collection view of the values contained in this map.");
        System.out.println("the values set is: "+hash_map.values());

        // How do you add given key-value pair to HashMap if and only if it is not present in the HashMap?
        hash_map.putIfAbsent(6,"Gray");
        System.out.println("hash_map is: "+hash_map);

       //remove if the pair exists
        hash_map.remove(1,"Red");
        hash_map.remove(2,"Red");
        System.out.println("New hash_map: "+hash_map);

        //replace if the pair exists
        hash_map.replace(3,"Black","Siyah");
        hash_map.replace(2,"Black","Siyah");
        hash_map.replace(1,"Red","Kirmizi");

        System.out.println("The new hash_map: "+ hash_map);



    }
}
