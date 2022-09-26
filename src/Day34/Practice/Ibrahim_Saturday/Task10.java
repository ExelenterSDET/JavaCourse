package Day34.Practice.Ibrahim_Saturday;

import java.util.*;

/*
Task 10

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
public class Task10 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        map.put("USA", new ArrayList<>(Arrays.asList("Boston","NewYork","San-Francisco")));
        map.put("INDIA", new ArrayList<>(Arrays.asList("Bangalore","Mumbai","Delhi")));
        map.put("UK", new ArrayList<>(Arrays.asList("Leicester","London","Birmingham")));

        
        ArrayList<String> allCities = new ArrayList<>(map.get("USA"));
        allCities.addAll(map.get("INDIA"));
        allCities.addAll(map.get("UK"));

        System.out.println("All Country and Cities : " + map);
        System.out.println();
//        removeCities(allCities, 'B');
        modifyCountries(map);
        System.out.println("Modified Map = " + map);


    }

    static ArrayList<String> removeCities(ArrayList<String> list, Character ch){
        
        list.removeIf(str -> str.startsWith(String.valueOf(ch)));

        return list;  
    }
    static HashMap<String, ArrayList<String>> modifyCountries(HashMap<String, ArrayList<String>> list){


        list.forEach((county, cities) ->{

            if(county.equalsIgnoreCase("USA")){
                removeCities(list.get(county), 'B');
            }
            else if (county.equalsIgnoreCase("INDIA")){
                removeCities(list.get(county), 'M');
            }
            else if (county.equalsIgnoreCase("UK")){
                removeCities(list.get(county), 'B');
            }
        });

        return list;
    }
}
