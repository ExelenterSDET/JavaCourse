package Day39.Practice.Tohir_Week_8.Task4;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        String[] str = {"samsa","kansha","mans","tango","jango","fog"};
        //Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        System.out.println(StringtoInteger(str));
        System.out.println(MaxValue(StringtoInteger(str)));
        System.out.println(SortDesending(StringtoInteger(str)));
        System.out.println(SortAssending(StringtoInteger(str)));
    }
    public static Map<String,Integer> StringtoInteger(String[] str)
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

    public static List<String> SortDesending(Map<String,Integer> map)
    {
        List<String> sortedStrings = new ArrayList<>();

        while (map.isEmpty()==false)
        {
            int max = MaxValue(map);
            String key = "";

            for(Map.Entry<String,Integer> map0:map.entrySet())
            {
                if (max == map0.getValue())
                {
                    sortedStrings.add(map0.getKey());
                    key = map0.getKey();
                }
            }
            map.remove(key);
        }
        return sortedStrings;
    }
    public static List<String> SortAssending(Map<String,Integer> map)
    {
        List<String> sortedStrings = new ArrayList<>();

        while (map.isEmpty()==false)
        {
            int min = MinValue(map);
            String key = "";

            for(Map.Entry<String,Integer> map0:map.entrySet())
            {
                if (min == map0.getValue())
                {
                    sortedStrings.add(map0.getKey());
                    key = map0.getKey();
                }
            }
            map.remove(key);
        }
        return sortedStrings;
    }
    public static int MaxValue(Map<String,Integer> map)
    {
        int max = Integer.MIN_VALUE;
        for(Map.Entry<String,Integer> map0:map.entrySet())
        {
         if(max<map0.getValue())
         {
             max = map0.getValue();
         }
        }
        return max;
    }
    public static int MinValue(Map<String,Integer> map)
    {
        int min = Integer.MAX_VALUE;
        for(Map.Entry<String,Integer> map0:map.entrySet())
        {
            if(min>map0.getValue())
            {
                min = map0.getValue();
            }
        }
        return min;
    }
}
