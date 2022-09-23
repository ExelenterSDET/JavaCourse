package Day33.Practice;

import java.util.HashMap;

public class Sebahattin {
    public static void main(String[] args) {
        HashMap<Integer, String> errorCodes = new HashMap<>();
        errorCodes.put(200, "OK");
        errorCodes.put(201, "Created");
        errorCodes.put(202, "Accepted");
        errorCodes.put(203, "Non-Authoritative Information");
        errorCodes.put(204, "No Content");

        System.out.println(errorCodes);
        for (Integer key : errorCodes.keySet()){
            if (errorCodes.get(key).equals("Accepted")){
                errorCodes.replace(key, "Confirmed");
            }
        }
        System.out.println(errorCodes);
        for (Integer key : errorCodes.keySet()){
            errorCodes.replace(key , errorCodes.get(key).toUpperCase());
        }
        System.out.println(errorCodes);

        System.out.println("========================================");

        HashMap<String, Integer> map =  new HashMap<>();
        map.put("a", 10);
        map.put("b", 10);
        map.put("c", 10);
        map.put("d", 10);
        map.put("e", 10);
        map.put("f", 10);
        map.put("g", 10);

        for (String key : map.keySet()){
            switch (key){
                case  "a":
                    map.replace("a", 10);
                    break;
                case  "b":
                    map.replace("b", 20);
                    break;
                case  "c":
                    map.replace("c", 30);
                    break;
                case  "d":
                    map.replace("d", 40);
                    break;
                case  "e":
                    map.replace("e", 50);
                    break;
                case  "f":
                    map.replace("f", 60);
                    break;
                case  "g":
                    map.replace("g", 70);
                    break;
            }
        }
        System.out.println(map);
    }
}
