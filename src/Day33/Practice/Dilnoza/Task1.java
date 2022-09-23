package Day33.Practice.Dilnoza;

import java.util.HashMap;

public class Task1 {

/*
If the valiue of the map is accepted change the value to Confirmed
 */
        public static void main(String[] args) {


            HashMap<Integer, String> errorCodes = new HashMap<>();
            errorCodes.put(200, "OK");
            errorCodes.put(201, "Created");
            errorCodes.put(202, "Accepted");
            errorCodes.put(203, "Non-Authoritative Information");
            errorCodes.put(204, "No Content");

            System.out.println("errorCodes = " + errorCodes);
            System.out.println("=================================================");
            for (Integer key : errorCodes.keySet()) {
                if (errorCodes.get(key).equals("Accepted")) {
                    errorCodes.put(key, "Confirmed");
                }

            }
            System.out.println("errorCodes = " + errorCodes);
            System.out.println("=================================================");
            for (Integer key : errorCodes.keySet()) {
                if (errorCodes.containsKey(202)) {
                    errorCodes.replace(202, "TestTest");
                }
            }
            System.out.println("errorCodes = " + errorCodes);

            System.out.println("___________________________________________________");
            for (Integer key : errorCodes.keySet()) {
                if (errorCodes.get(key).equals("No Content")) {
                    errorCodes.replace(204, "SOMETHING NEW");
                }
            }
            System.out.println("errorCodes = " + errorCodes);


/*
Modify all values to uppercase
 */

            for (Integer key : errorCodes.keySet()) {
                errorCodes.replace(key, errorCodes.get(key).toUpperCase());

            }
            System.out.println("errorCodes = " + errorCodes);

/*Task 3

         if key = a, add to value 10;
         if key = b, add to value 20;
         if key = c, add to value 30;
         if key = d, add to value 40;
         if key = e, add to value 50;
         if key = f, add to value 60;
         if key = g, add to value 70;
 */


            HashMap<String, Integer> map = new HashMap<>();
            map.put("a", 10);
            map.put("b", 10);
            map.put("c", 10);
            map.put("d", 10);
            map.put("e", 10);
            map.put("f", 10);
            map.put("g", 10);

            System.out.println("map = " + map);

            for (String key : map.keySet()) {
                if (key.equals("a")) {
                    map.put(key, map.get(key) + 10);
                } else if (key.equals("b")) {
                    map.replace(key, map.get(key) + 20);
                } else if (key.equals("c")) {
                    map.replace(key, map.get(key) + 30);
                } else if (key.equals("d")) {
                    map.replace(key, map.get(key) + 40);
                } else if (key.equals("e")) {
                    map.replace(key, map.get(key) + 50);
                } else if (key.equals("f")) {
                    map.replace(key, map.get(key) + 60);
                } else if (key.equals("g")) {
                    map.replace(key, map.get(key) + 70);
                }
            }
            System.out.println("map = " + map);

        }
    }

