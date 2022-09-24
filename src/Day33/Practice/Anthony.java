package Day33.Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Anthony {
    public static void main(String[] args) {
        HashMap<Integer,String> errorCode = new HashMap<>();
        errorCode.put(401,"Unauthorized");
        errorCode.put(402,"Payment Required");
        errorCode.put(403,"Forbidden");
        errorCode.put(403,"Not Found");
        errorCode.put(500,"Internal Server Error");

        Set<Integer> integers = errorCode.keySet();
        System.out.println("integers = " + integers);

        Set<Map.Entry<Integer, String>> entries = errorCode.entrySet();
        System.out.println("entries = " + entries);

        for (Integer key : errorCode.keySet()){
            if(key==401){
                errorCode.put(401, "OK OK");
            }
            System.out.println("key is:  " + key + "; value is : " +errorCode.get(key));

        }
        System.out.println("================ TASK 1 =================================");
        HashMap<Integer, String> errorCodes = new HashMap<>();
        errorCodes.put(200, "OK");
        errorCodes.put(201, "Created");
        errorCodes.put(202, "Accepted");
        errorCodes.put(203, "Non-Authoritative Information");
        errorCodes.put(204, "No Content");

        //Task1
        //if the value of the map is Accepted, change the value to Confirmed

        Set<Integer> integers2 = errorCodes.keySet();
        System.out.println("integers = " + integers2);


        Set<Map.Entry<Integer, String>> entries2 = errorCodes.entrySet();
        System.out.println("entries = " + entries2);

        for (Integer key : errorCodes.keySet()){
            if(errorCodes.get(key).equals("Accepted")){
                errorCodes.replace(key,"Confirmed");
            }
        }
        System.out.println(errorCodes);
        System.out.println("================ TASK 2 =================================");

        //Task2
        //modify all values in the map to UpperCase

        Set<Integer> integers3 = errorCodes.keySet();
        System.out.println("integers = " + integers3);


        Set<Map.Entry<Integer, String>> entries3 = errorCodes.entrySet();
        System.out.println("entries = " + entries3);

        for (Integer key : errorCodes.keySet()) {
            errorCodes.put(key, errorCodes.get(key).toUpperCase());
        }
        System.out.println(errorCodes);
        System.out.println("================ TASK 3 =================================");

        HashMap<String,Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 10);
        map.put("c", 10);
        map.put("d", 10);
        map.put("e", 10);
        map.put("f", 10);
        map.put("g", 10);
        System.out.println("map = " + map);

        for(String key : map.keySet()){
            int addValue = 0;
            switch (key){
                case "a": addValue = 10; break;
                case "b": addValue = 20; break;
                case "c": addValue = 30; break;
                case "d": addValue = 40; break;
                case "e": addValue = 50; break;
                case "f": addValue = 60; break;
                case "g": addValue = 70; break;
            }
            map.put(key,map.get(key)+addValue);
        }
        System.out.println(map);

    }
}
