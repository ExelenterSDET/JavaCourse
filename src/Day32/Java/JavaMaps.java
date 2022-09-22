package Day32.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class JavaMaps {
    public static void main(String[] args) {
        // Three types of maps.
        // HashMap, LinkedHashMap, TreeMap

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        // key = a,  value = 10; key = b, value = 20; key = c, value = 30; key = d, value = 40;
        // values can be any wrapper classes, or any Objects (list, set, map)

        // key = school1, value = list of students of school1, key = school2, value = list of students of school2.

        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
        map.put("d", 40);


        System.out.println(map);
        map.put("a", 100);
        System.out.println(map);

        HashMap<Integer, String> cities = new HashMap<>();
        cities.put(11230, "Brooklyn");
        cities.put(10003, "New York");
        cities.put(10311, "Richmond County");

        System.out.println(cities);

        HashMap<String, ArrayList<String>> employees = new HashMap<>();
        ArrayList<String> group1 = new ArrayList<>(Arrays.asList("A", "A1", "A2", "A3"));
        ArrayList<String> group2 = new ArrayList<>(Arrays.asList("B", "B1", "B2", "B3"));
        ArrayList<String> group3 = new ArrayList<>(Arrays.asList("C", "C1", "B2", "A3"));

        employees.put("John", group1);
        employees.put("Michael", group2);
        employees.put("Duncan", group3);

        System.out.println(employees);

        HashMap<String, Double> salaries = new HashMap<>();
        salaries.put("John", 120000D); // D is used for Double
        salaries.put("Mike", 80000.0);
        salaries.put("Lewis", 130000d); // d is used for double

        System.out.println(salaries);


    }
}
