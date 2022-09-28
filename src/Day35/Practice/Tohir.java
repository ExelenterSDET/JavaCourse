package Day35.Practice;

import java.util.*;

public class Tohir {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("a", "candy");
        map.put("b", "dirt");
        map.put("c", "meh");
        String [] str = {"aa","av","avc","av","dasda"};
        System.out.println(Map_2(str));
        System.out.println(hasvalue(map));
        System.out.println(mapAB3(map));
    }
   public static Map<String,String> hasvalue(Map<String, String> map)
   {
        if(map.containsKey("a"))
       {
           map.put("b", map.get("a"));
           map.put("a","");
       }
       return map;

   }
   public static Map<String,String> mapAB3(Map<String, String> map)
   {
       boolean containsa = map.containsKey("a");
       boolean containsb = map.containsKey("b");
       if((containsa==true)&&(containsb==false))
       {
           map.put("b", map.get("a"));
       } else if ((containsa==false)&&(containsb==true)) {
           map.put("a", map.get("b"));
       }
       return map;
   }
    public static Map<String,Integer> Map_2(String[] str)
    {
        Map<String,Integer> map = new HashMap<>();
        for (String stringz : str) {
        map.computeIfAbsent(stringz, k->0);
        map.computeIfPresent(stringz,(k,v)->v=stringz.length());
        }
       return map;
    }
    public static HashMap<String, String> Map_2_firstchar(String[] str)
    {
        HashMap<String,String> map=new HashMap<>();
        for (String strings : str) {
            map.put(strings.substring(0,1), map.getOrDefault(strings.substring(0,1), "")+str);
        }
        return map;
    }
    /*public static Map<String,String> mapAB3_1(Map<String, String> map)
    {
        map.computeIfPresent("b",(k,v)->v= map.get("a"));
        map.computeIfAbsent("b",k->map.get("a"));
        map.computeIfPresent("a",(k,v)->v= map.get("b"));
        map.computeIfAbsent("a",k->map.get("b"));
        return map;
    }*/
}