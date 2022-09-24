package Day34.Java;

import java.util.HashMap;

public class Task1 {
    /*
     Task1

       Create a method to print all the keys and values
       using entry set and key set approaches with forEach method.

    Task 2

        if key = a, add to value 10;
        if key = b, add to value 20;
        if key = c, add to value 30;
        if key = d, add to value 40;
        if key = e, add to value 50;
        if key = f, add to value 60;
        if key = g, add to value 70;

     */

    public static void main(String[] args) {
        HashMap<String, Integer> map =  new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
        map.put("d", 40);
        map.put("e", 50);
        map.put("f", 60);
        map.put("g", 70);

        printMap2(map);

    }
    static void printMap(HashMap<String, Integer> map){
        map.forEach((k, v) -> {
            int addValue = addValue(k);
            System.out.print(k + " = " + (v+addValue) + "; ");
        });
    }
    static void printMap2(HashMap<String, Integer> map){
        map.forEach((k, v) -> {
            v += addValue(k);
            map.replace(k, v);
            System.out.print(k + " = " + v + "; "); // map.get(k) == v
        });
    }

    static int addValue(String str){
        switch(str){
            case "a": return 10;
            case "b": return 20;
            case "c": return 30;
            case "d": return 40;
            case "e": return 50;
            case "f": return 60;
            case "g": return 70;
        }
        return 0;
    }

}
