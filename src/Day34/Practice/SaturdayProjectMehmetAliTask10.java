package Day34.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SaturdayProjectMehmetAliTask10 {
    /*Task 10
      Given a following Map:
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
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        map.put("USA", new ArrayList<>(Arrays.asList("Boston","NewYork","San-Francisco")));
        map.put("INDIA", new ArrayList<>(Arrays.asList("Bangalore","Mumbai","Delhi")));
        map.put("UK", new ArrayList<>(Arrays.asList("Leicester","London","Birmingham")));
        System.out.println("map = " + map);

    //        removeCitiesFromList(arrlist,'n');
        removeCitiesFromMap(map);
    }
    static void removeCitiesFromList(ArrayList<String> list, Character ch){
        list.removeIf(n->n.toUpperCase().charAt(0)==Character.toUpperCase(ch));
//        System.out.println("list = " + list);
    }

    static void removeCitiesFromMap(HashMap<String, ArrayList<String>> hashMap){
        for( Map.Entry<String,ArrayList<String>> row: hashMap.entrySet()){
            if(row.getValue().equals("USA")){
                removeCitiesFromList(row.getValue(),'s');
            } else if (row.getValue().equals("INDIA")) {
                removeCitiesFromList(row.getValue(),'m');
            }else {
                removeCitiesFromList(row.getValue(),'b');
            }
        }
        System.out.println("new hashMap = " + hashMap);
    }
}
