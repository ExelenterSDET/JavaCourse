package Day38.Practice._09_30_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task10 {
    /* Given a following Map:
          HashMap<String, ArrayList<String>> map = new HashMap<>();
          map.put("USA", new ArrayList(Arrays.asList("Boston","NewYork","San-Francisco")));

          map.put("INDIA", new ArrayList(Arrays.asList("Bangalore","Mumbai","Delhi")));
          map.put("UK", new ArrayList(Arrays.asList("Leicester","London","Birmingham")));

          1. Create a method, which has ArrayList<String> and a Character as a parameters and a ArrayList<String> return type.
          The method should modify list, so that it will remove all Cities from the list, which start with the Character.

          2. Create a method, which has HashMap<String, ArrayList<String>> as a parameter and a return type.
          The method should modify the map as follow:
          if the country is USA, remove all cities from the list, that starts with S.
          if the country is INDIA, remove all cities from the list, that starts with M.
          if the country is UK, remove all cities from the list, that starts with B
     */


static ArrayList<String> modifyList (ArrayList<String> list, char ch){

   /* for (int i = 0; i < list.size(); i++) {
        if((list.get(i).charAt(0) == (ch))){
            list.remove(list.get(i));
        }
    }

    */
    list.removeIf(n -> n.charAt(0) == ch);


    return list;

}

static HashMap<String, ArrayList<String>> modifyMap(HashMap<String, ArrayList<String>> map){

    for (Map.Entry<String, ArrayList<String>> eachString : map.entrySet()) {
        if (eachString.getKey().equals("USA")){
            map.put(eachString.getKey(), modifyList(eachString.getValue(), 'S'));
        } else if (eachString.getKey().equals("INDIA")) {
            map.put(eachString.getKey(), modifyList(eachString.getValue(), 'M'));
        } else if (eachString.getKey().equals("UK")) {
            map.put(eachString.getKey(), modifyList(eachString.getValue(), 'B'));
        }
    }


    return map;
}
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();
        map.put("USA", new ArrayList(Arrays.asList("Boston","NewYork","San-Francisco")));
        map.put("INDIA", new ArrayList(Arrays.asList("Bangalore","Mumbai","Delhi")));
        map.put("UK", new ArrayList(Arrays.asList("Leicester","London","Birmingham")));

        modifyMap(map);
        System.out.println(map);


    }
}
