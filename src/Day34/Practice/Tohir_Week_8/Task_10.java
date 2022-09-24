package Day34.Practice.Tohir_Week_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task_10 {
    public static void main(String[] args) {
        Task_10 asg = new Task_10();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> strArr = new ArrayList<>(Arrays.asList("Boston","NewYork","San-Francisco"));
        System.out.println(asg.removecities('B',strArr));
        map.put("USA", new ArrayList(Arrays.asList("Boston","NewYork","San-Francisco")));
        map.put("INDIA", new ArrayList(Arrays.asList("Bangalore","Mumbai","Delhi")));
        map.put("UK", new ArrayList(Arrays.asList("Leicester","London","Birmingham")));
        System.out.println(map);
        System.out.println(asg.removecitiesfromcountrylist(map));
    }
    ArrayList<String> removecities(Character c,ArrayList<String> strArr)
    {
        for (int i = 0; i < strArr.size(); i++) {
           if (strArr.get(i).startsWith(String.valueOf(c)))
            {
             strArr.remove(i);
             i--;
            }
        }
        return strArr;
    }
    HashMap<String, ArrayList<String>> removecitiesfromcountrylist(HashMap<String, ArrayList<String>> map)
    {
        HashMap<String, ArrayList<String>> map0 = new HashMap<>();
        for (Map.Entry<String, ArrayList<String>> row:map.entrySet())
        {
            if (row.getKey().equals("USA"))
            {
                map0.put(row.getKey(), removecities('S',row.getValue()));
            }
            if (row.getKey().equals("INDIA"))
            {
                map0.put(row.getKey(), removecities('M',row.getValue()));
            }
            if (row.getKey().equals("UK"))
            {
                map0.put(row.getKey(), removecities('B',row.getValue()));
            }
        }
        return map0;
    }

}
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