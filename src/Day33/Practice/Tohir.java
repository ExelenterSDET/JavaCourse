package Day33.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Tohir {
    public static void main(String[] args) {
    Tohir asg = new Tohir();
   /*     int a = 10;
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

        System.out.println(salaries);*/

    HashMap<Integer, String> errorCodes = new HashMap<>();
    errorCodes.put(200, "OK");
    errorCodes.put(201, "Created");
    errorCodes.put(202, "Accepted");
    errorCodes.put(203, "Non-Authoritative Information");
    errorCodes.put(204, "No Content");

        /*Task 2
        for (Integer key : errorCodes.keySet()) {
            errorCodes.put(key, errorCodes.get(key).toUpperCase());
        }
        System.out.println(errorCodes);*/
        /*Task 3
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 10);
        map.put("c", 10);
        map.put("d", 10);
        map.put("e", 10);
        map.put("f", 10);
        map.put("g", 10);
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("a", 10);
        map1.put("b", 20);
        map1.put("c", 30);
        map1.put("d", 40);
        map1.put("e", 50);
        map1.put("f", 60);
        map1.put("g", 70);
        for (String key : map.keySet()) {
            for (String key1 : map1.keySet()) {
                if (key.equals(key1)) {
                    map.put(key, map.get(key) + map1.get(key1));
                    break;
                }
            }

        //Task 1
        for (Integer key: errorCodes.keySet()) {
            if (errorCodes.get(key).equals("Accepted"))
            {
                errorCodes.put(key,"Confirmed");
            }
        }
        System.out.println(errorCodes);
    }

        }
        System.out.println(map);*/
    HashMap<String, Integer> map2 = new HashMap<>();
    map2.put("a", 0);
    map2.put("b", 10);
    map2.put("c", 20);
    map2.put("d", 30);
    map2.put("e", 40);
    map2.put("f", 50);
    map2.put("g", 60);
    for(Map.Entry<String, Integer> row: map2.entrySet())
    {
        System.out.println("key-->" + row.getKey()+", arg--->"+row.getValue());
    }
    HashMap<String, ArrayList<Integer>> compensation = new HashMap<>();
    compensation.put("Manager", new ArrayList<>(Arrays.asList(100000, 120000, 50000)));
    compensation.put("CEO", new ArrayList<>(Arrays.asList(300000, 150000, 750000)));
    compensation.put("Admin", new ArrayList<>(Arrays.asList(70000, 90000, 30000)));
    compensation.put("Accountant", new ArrayList<>(Arrays.asList(110000, 95000, 25000)));
    System.out.println(getcompensate(compensation));
        /*HashMap<String,Integer> totals = new HashMap<>();
        for (Map.Entry<String, ArrayList<Integer>> row: compensation.entrySet())
        {
            int sum = 0;
            for (int i = 0; i < row.getValue().size(); i++) {
                sum = sum + row.getValue().get(i);
            }
            totals.put(row.getKey(),sum);
        }
        System.out.println(totals);*/
}
    static HashMap<String,Integer> getcompensate (HashMap<String, ArrayList<Integer>> compensation)
    {
        HashMap<String,Integer> totals = new HashMap<>();
        for (Map.Entry<String, ArrayList<Integer>> row: compensation.entrySet())
        {
            int sum = 0;
            for (int i = 0; i < row.getValue().size(); i++) {
                sum = sum + row.getValue().get(i);
            }
            totals.put(row.getKey(),sum);
        }
        return totals;
    }
}
