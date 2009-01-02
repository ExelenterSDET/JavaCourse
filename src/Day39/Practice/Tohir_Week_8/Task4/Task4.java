package Day39.Practice.Tohir_Week_8.Task4;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        String[] str = {"samsa","kansha","mans","Mans","maans","jango"};
        //Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        System.out.println(toSort(str));
    }
    public static Map<String,Integer> toSort(String[] str)
    {
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            map.put(str[i],(int)(str[i].substring(0,1).charAt(0)));
        }

        Map<String,Integer> tosort =new HashMap<>();
        for(Map.Entry<String,Integer> map0:map.entrySet())
        {
            int max = 0;

            tosort.put(map0.getKey(),Integer.valueOf(map0.getValue()));

        }
        return map;
    }
}
