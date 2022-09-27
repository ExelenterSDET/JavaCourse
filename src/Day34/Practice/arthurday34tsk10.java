package Day34.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class arthurday34tsk10 {

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        map.put("USA", new ArrayList(Arrays.asList("Boston","NewYork","San-Francisco")));
        map.put("INDIA", new ArrayList(Arrays.asList("Bangalore","Mumbai","Delhi")));
        map.put("UK", new ArrayList(Arrays.asList("Leicester","London","Birmingham")));
        System.out.println(lizzy(map));

    }


    //          1. Create a method, which has ArrayList<String> and a Character as a parameters and a ArrayList<String> return type.
//          The method should modify list, so that it will remove all Cities from the list, which start with the Character.

    static ArrayList<String> r(ArrayList<String> a, Character b){

        a.removeIf(k->k.substring(0,1).equals(String.valueOf(b)));
        return a;
    }

//        2. Create a method, which has HashMap<String, ArrayList<String>> as a parameter and a return type.
//          The method should modify the map as follow:
//          if the country is USA, remove all cities from the list, that starts with S.
//          if the country is INDIA, remove all cities from the list, that starts with M.
//          if the country is UK, remove all cities from the list, that starts with B

    static HashMap<String, ArrayList<String>> lizzy(HashMap<String, ArrayList<String>> b){

        for (Map.Entry<String, ArrayList<String>> Entry : b.entrySet()) {
            if (Entry.getKey().equals("USA")){
                r(Entry.getValue(),'S');
            } else if (Entry.getKey().equals("INDIA")) {
                r(Entry.getValue(), 'M');
            } else if(Entry.getKey().equals("UK")) {
                r(Entry.getValue(), 'B');
            }
        }
        return b;

    }

}
