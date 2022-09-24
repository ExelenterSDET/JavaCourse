package Day33.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class arthur33prac {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> compensation = new HashMap<>();
        compensation.put("Manager", new ArrayList<>(Arrays.asList(100000, 120000, 50000)));
        compensation.put("CEO", new ArrayList<>(Arrays.asList(300000, 150000, 750000)));
        compensation.put("Admin", new ArrayList<>(Arrays.asList(70000, 90000, 30000)));
        compensation.put("Accountant", new ArrayList<>(Arrays.asList(110000, 95000, 25000)));

        System.out.println(me(compensation));
    }

    static HashMap<String, Integer> me(HashMap<String, ArrayList<Integer>> inp){
        int sum = 0;
        HashMap<String, Integer> holder = new HashMap<>();
        for (Map.Entry<String, ArrayList<Integer>> person : inp.entrySet()) {
            person.getValue().forEach(n-> System.out.println(n));
            sum = getTot(person.getValue());
            holder.put(person.getKey(), sum);

        }

        return holder;
    }

    static int getTot(ArrayList<Integer> x){
        int sum = 0;
        for (int i = 0; i < x.size(); i++) {


            sum=sum+x.get(i);

        }
        return sum;

    }

}
