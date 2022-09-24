package Day34.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ExampleForEach {
    public static void main(String[] args) {

        // Task is to print a new map with position as a key, and total compensation as value
        HashMap<String, ArrayList<Integer>> compensation = new HashMap<>();
        compensation.put("Manager", new ArrayList<>(Arrays.asList(100000, 120000, 50000)));
        compensation.put("CEO", new ArrayList<>(Arrays.asList(300000, 150000, 75000)));
        compensation.put("Admin", new ArrayList<>(Arrays.asList(70000, 90000, 30000)));
        compensation.put("Accountant", new ArrayList<>(Arrays.asList(110000, 95000, 25000)));

        HashMap<String, Integer> totalCompensation1 = getTotalCompensation1(compensation);
        System.out.println(totalCompensation1);
        HashMap<String, Integer> totalCompensation2 = getTotalCompensation2(compensation);
        System.out.println(totalCompensation2);
    }

    static HashMap<String, Integer> getTotalCompensation1(HashMap<String, ArrayList<Integer>> map){
        HashMap<String, Integer> result = new HashMap<>();

        map.forEach((key, value) -> {
            result.put(key, getTotal(value));
        });
        return result;
    }

    static HashMap<String, Integer> getTotalCompensation2(HashMap<String, ArrayList<Integer>> map){
        HashMap<String, Integer> result = new HashMap<>();
        map.keySet().forEach((key) -> {
            result.put(key, getTotal(map.get(key)));
        } );
        return result;
    }

    static int getTotal(ArrayList<Integer> list){
        int total = 0;
        for (Integer integer : list) {
            total += integer;
        }
        return total;
    }
}
