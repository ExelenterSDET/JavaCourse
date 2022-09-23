package Day32.Practice.Andrea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class JavaMaps {
    public static void main(String[] args) {

        //Three types of maps: HashMap, LinkedHashMap, TreeMap
        HashMap<Integer, String> cities = new HashMap<>();
        cities.put(11230, "Brooklyn");
        System.out.println(cities);

        HashMap<String, ArrayList<String>> employees = new HashMap<>();
        ArrayList<String> group1 = new ArrayList(Arrays.asList("A", "A2", "A3"));
        ArrayList<String> group2 = new ArrayList(Arrays.asList("B2", "A2", "B3"));

        employees.put("John", group1);

        System.out.println(employees);



    }
}
