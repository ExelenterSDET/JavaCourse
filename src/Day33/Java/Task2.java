package Day33.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {

        HashMap<String, ArrayList<Integer>> compensation = new HashMap<>();
        compensation.put("Manager", new ArrayList<>(Arrays.asList(100000, 120000, 50000)));
        compensation.put("CEO", new ArrayList<>(Arrays.asList(300000, 150000, 75000)));
        compensation.put("Admin", new ArrayList<>(Arrays.asList(70000, 90000, 30000)));
        compensation.put("Accountant", new ArrayList<>(Arrays.asList(110000, 95000, 25000)));

        HashMap<String, Integer> compensation1 = getCompensation(compensation);

        System.out.println(compensation1);

        HashMap<String, Integer> compensation2 = getCompensation2(compensation);
        System.out.println(compensation2);

        // Task 1
        /*
        Create a method, which will return a map with position as a key, and total compensation as value
        Manager = 270000
        Ceo = 525000
        etc...
         */

    }

    static int getTotal(ArrayList<Integer> list){
        int total = 0;
        for (Integer integer : list) {
            total += integer;
        }
        return total;
    }

    static HashMap<String, Integer> getCompensation(HashMap<String, ArrayList<Integer>> map){
        HashMap<String, Integer> totalCompensation = new HashMap<>();
        for(Map.Entry<String, ArrayList<Integer>> row : map.entrySet()){
            totalCompensation.put(row.getKey(),getTotal(row.getValue()));
        }
        return totalCompensation;
    }

    static HashMap<String, Integer> getCompensation2(HashMap<String, ArrayList<Integer>> map){
        HashMap<String, Integer> totalCompensation = new HashMap<>();
        for(String key : map.keySet()){
            totalCompensation.put(key,getTotal(map.get(key)));
        }
        return totalCompensation;
    }

}
