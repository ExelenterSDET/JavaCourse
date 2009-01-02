package Day39.Practice.Tohir_Week_8.Task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String [] strSplit = str.split("");
        Map<Character,Integer> map = new HashMap<>();
        for (String s : strSplit) {
            map.computeIfPresent(s.charAt(0),(k,v)->v+1);
            map.computeIfAbsent(s.charAt(0),v->1);
        }
        System.out.println(map);
        System.out.println(Mostrepeatedcharkey(map));
    }
    public static char Mostrepeatedcharkey(Map<Character,Integer> map)
    {
        char keymax = 'a';
        int valuemax = 0;
        for(Map.Entry<Character,Integer> map0:map.entrySet())
        {
           if(map0.getValue()>valuemax)
           {
               keymax = map0.getKey();
               valuemax = map0.getValue();
           }
        }
        return keymax;
    }
}
