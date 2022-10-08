package Day33.Practice.Malika;

import java.util.HashMap;

public class Tasks_Map_KeySet {
    public static void main(String[] args) {
//TASK1
        /* If the value of the map is Accepted, change the value to confirmed*/

        HashMap<Integer, String> errorCodes = new HashMap<>();
        errorCodes.put(200, "OK");
        errorCodes.put(201, "Created");
        errorCodes.put(202, "Accepted");
        errorCodes.put(203, "Non-Authoritative Information");
        errorCodes.put(204, "No Content");


        for (Integer key : errorCodes.keySet()) {
            if (errorCodes.get(key).equals("Accepted")){
                errorCodes.replace(key,"Confirmed");
            }
        }
        System.out.println(errorCodes);

        //TASK2
        /* Modify all values in the map to UpperCase */

        for (Integer key : errorCodes.keySet()){
            errorCodes.replace(key,errorCodes.get(key).toUpperCase());
        }
        System.out.println(errorCodes);


        //TASK3
        /* if key = "a", add to value 10;
           if key = "b", add to value 20;
           if key = "c", add to value 30;
           if key = "d", add to value 40;
           if key = "e", add to value 50;
           if key = "f", add to value 60;
           if key = "g", add to value 70;
        */

        HashMap<String,Integer>map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 10);
        map.put("c", 10);
        map.put("d", 10);
        map.put("e", 10);
        map.put("f", 10);
        map.put("g", 10);



        for (String s : map.keySet()) {
            int addValue = 0;
            switch(s){
                case "a":
                    addValue = 10;
                    break;
                case "b":
                    addValue = 20;
                    break;
                case "c":
                    addValue = 30;
                    break;
                case "d":
                    addValue = 40;
                    break;
                case "e":
                    addValue = 50;
                    break;
                case "f":
                    addValue = 60;
                    break;
                case "g":
                    addValue = 70;
                    break;
            }
            map.put(s, map.get(s)+addValue);
        }
        System.out.println(map);
    }
}
