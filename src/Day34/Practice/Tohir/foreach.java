package Day34.Practice.Tohir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class foreach {

    public static void main(String[] args) {

        foreach asg = new foreach();
        java.util.HashMap<String,ArrayList<Integer>> compensation = new HashMap<>();
        compensation.put("Manager", new ArrayList<>(Arrays.asList(100000, 120000, 50000)));
        compensation.put("CEO", new ArrayList<>(Arrays.asList(300000, 150000, 750000)));
        compensation.put("Admin", new ArrayList<>(Arrays.asList(70000, 90000, 30000)));
        compensation.put("Accountant", new ArrayList<>(Arrays.asList(110000, 95000, 25000)));
        //compensation.forEach((key,value) ->System.out.println(" "+value.size()));
        //System.out.println(getcompensate(compensation));
        java.util.HashMap<String, Integer> map =  new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
        map.put("d", 40);
        map.put("e", 50);
        map.put("f", 60);
        map.put("g", 70);
        printmap(adding10(map));
        printmap(adding(map));

    }

    static void printmap(HashMap<String,Integer> map)
    {
        map.forEach((key,value)-> System.out.println(key+"="+value));
    }
    static HashMap<String,Integer> adding10(HashMap<String,Integer> map)
    {
        HashMap<String, Integer> map1 = new HashMap<>();

        map.forEach((key,value)->{
            if(key.equals("a")){map1.put(key,map.get(key)+10);}
            if(key.equals("b")){map1.put(key,map.get(key)+20);}
            if(key.equals("c")){map1.put(key,map.get(key)+30);}
            if(key.equals("d")){map1.put(key,map.get(key)+40);}
            if(key.equals("e")){map1.put(key,map.get(key)+50);}
            if(key.equals("f")){map1.put(key,map.get(key)+60);}
            if(key.equals("g")){map1.put(key,map.get(key)+70);}
        });
        return map1;
    }
    static HashMap<String,Integer> adding(HashMap<String,Integer> map)
    {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("a", 10);
        map2.put("b", 20);
        map2.put("c", 30);
        map2.put("d", 40);
        map2.put("e", 50);
        map2.put("f", 60);
        map2.put("g", 70);
        map.forEach((key,value)->{
            map2.forEach((key2,value2)->{
                if(key.equals(key2)){map1.put(key,map.get(key)+map2.get(key2));} });});
        return map1;
    }
}
