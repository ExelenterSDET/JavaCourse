package Day32.Practice.Andrea;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {

        //Three types of maps: HashMap, LinkedHashMap, TreeMap
        HashMap<Integer, String> errorCodes = new HashMap<>();
        errorCodes.put(100, "Continue");
        errorCodes.put(101, "Switching Protocols");
        errorCodes.put(102, "Processing (WebDAV)");
        errorCodes.put(103, "Early Hints");
        errorCodes.put(200, "OK");
        System.out.println(errorCodes);

        HashMap<Integer, String> errorCodes2 = new HashMap<>();
        errorCodes2.putAll(errorCodes);

        System.out.println(errorCodes2);

        HashMap<Integer, String> errorCodes3 = new HashMap<>(errorCodes);
        errorCodes2.putAll(errorCodes3);

        errorCodes.remove(200);
        System.out.println(errorCodes);

        String s = errorCodes2.get(200);
        System.out.println(s);

        Set<Integer> integers = errorCodes.keySet();
        System.out.println(integers);

        Set<Map.Entry<Integer, String>> entries = errorCodes.entrySet();
        System.out.println(entries);

        int size = errorCodes.size();
        System.out.println(size);

        errorCodes.replace(200, "OK");
        System.out.println(errorCodes);

        errorCodes.put(200, "OK");
        System.out.println(errorCodes);

        errorCodes.replace(200, "OK2");
        System.out.println(errorCodes);

    }
}
