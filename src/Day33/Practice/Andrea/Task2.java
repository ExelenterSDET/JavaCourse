package Day33.Practice.Andrea;

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

        HashMap<String, Integer> compensation1 = getComp(compensation);

        System.out.println(compensation1);
    }

    static int getTotal (ArrayList<Integer> list){
            int total = 0;
            for (Integer integer : list) {
                total += integer;
            }
           return total;
    }

    static HashMap<String, Integer> getComp (HashMap<String, ArrayList<Integer>> map){
        HashMap<String, Integer> totalComp = new HashMap<>();
        for (Map.Entry<String, ArrayList<Integer>> row: map.entrySet()) {
            totalComp.put(row.getKey(), getTotal(row.getValue()));
        }
        return totalComp;
    }
}