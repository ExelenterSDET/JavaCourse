package Day33.Practice.Andrea;

import java.util.HashMap;

public class JavaMapLoops {
    public static void main(String[] args) {

        HashMap<Integer, String> errorCodes = new HashMap<>();

        errorCodes.put(200, "OK");
        errorCodes.put(201, "Created");
        errorCodes.put(202, "Accepted");
        errorCodes.put(203, "Non-Authoritative Information");
        errorCodes.put(204, "No Content");

        //only enhanced for loops, since Map doesn't have indexes

        //Task 1

        for (Integer key : errorCodes.keySet()) { //initialized Integer in for loop
            if(errorCodes.get(key).equals("Accepted")){
                errorCodes.put(key, "Confirmed");
            }
            System.out.println("key is = " + key + ": value is " + errorCodes.get(key));
        }

        //Task 2
        for (Integer key : errorCodes.keySet()) { //initialized Integer in for loop
            errorCodes.put(key, errorCodes.get(key).toUpperCase());
            System.out.println("key is = " + key + ": value is " + errorCodes.get(key));
        }

        //Task 3
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 10);
        map.put("c", 10);
        map.put("d", 10);
        map.put("e", 10);
        map.put("f", 10);
        map.put("g", 10);

        for (String key : map.keySet()){
            if (key.equals("a")){
                map.put(key, map.get(key)+10);
            }
            else if (key.equals("b")){
                map.put(key, map.get(key)+20);
            }
            else if (key.equals("c")){
                map.put(key, map.get(key)+30);
            }
            else if (key.equals("d")){
                map.put(key, map.get(key)+40);
            }
            else if (key.equals("e")){
                map.put(key, map.get(key)+50);
            }
            else if (key.equals("f")){
                map.put(key, map.get(key)+60);
            }
            else if (key.equals("g")){
                map.put(key, map.get(key)+70);
            }

            System.out.println("key is = " + key + ": value is " + map.get(key));

        }



}
}
