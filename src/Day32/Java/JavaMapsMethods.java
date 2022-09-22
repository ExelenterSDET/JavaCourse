package Day32.Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaMapsMethods {

    public static void main(String[] args) {
        HashMap<Integer, String> errorCodes = new HashMap<>();
        errorCodes.put(200, "OK");
        errorCodes.put(201, "Created");
        errorCodes.put(202, "Accepted");
        errorCodes.put(203, "Non-Authoritative Information");
        errorCodes.put(204, "No Content");

        System.out.println(errorCodes);

        // public void putAll(Map map): This method is used to insert the specified map in this map
        HashMap<Integer, String> errorCodes2 = new HashMap<>();
        errorCodes2.putAll(errorCodes);

        System.out.println(errorCodes2);

        HashMap<Integer, String> errorCodes3 = new HashMap<>(errorCodes);
        System.out.println(errorCodes3);

        //public Object remove(Object key): This method is used to delete an entry for the specified key.
        errorCodes.remove(200);
        System.out.println(errorCodes);

        //public Object get(Object key):This method is used to return the value for the specified key
        String s = errorCodes.get(200);
        System.out.println(s);

        // getOrDefault will check if we have the key and return its value. if key doesnt exist, it will return our defaultValue
        String s1 = errorCodes.getOrDefault(201, "Entry does not exist");
        System.out.println(s1);

        //public boolean containsKey(Object key): This method is used to search the specified key from this map.
        boolean b = errorCodes.containsKey(201);
        System.out.println(b);

        //public boolean containsValue(Object key): This method is used to search the specified value from this map.
        boolean created = errorCodes.containsValue("Created");
        System.out.println(created);

        //  public Set keySet(): This method is used to return the Set view containing all the keys.
        Set<Integer> integers = errorCodes.keySet();
        System.out.println(integers);

        // public Set entrySet(): This method is used to return the Set view containing all the keys and values.
        Set<Map.Entry<Integer, String>> entries = errorCodes.entrySet();
        System.out.println(entries);

        int size = errorCodes.size(); // returns the size of the map
        System.out.println(size);

        int size1 = errorCodes.entrySet().size();
        System.out.println(size1);

        int size2 = errorCodes.keySet().size();
        System.out.println(size2);

        // Difference between replace and put
        errorCodes.put(200, "OK"); // will change the value if the key present. if not, it will create a new key with the value.
        System.out.println(errorCodes);

        errorCodes.replace(200, "OK2"); // only can change existing keys value.
        System.out.println(errorCodes);

        errorCodes.put(200, "OK");
        System.out.println(errorCodes);

        // map.isEmpty() will check if the map is empty or not
        boolean empty = errorCodes.isEmpty();
        System.out.println(empty);

        // map.clear() will erase all data in the map
        errorCodes.clear();

        empty = errorCodes.isEmpty();
        System.out.println(empty);

    }
}
