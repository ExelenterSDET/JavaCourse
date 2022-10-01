package Malika;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
                        //TASK1
        /* Create a map that holds an error status codes */

        HashMap<Integer,String> errorCodes = new HashMap<>();
        errorCodes.put(200, "OK");
        errorCodes.put(201, "CREATED");
        errorCodes.put(202, "ACCEPTED");
        errorCodes.put(204, "NO CONTENT");
        errorCodes.put(208, "ALREADY REPORTED");

        System.out.print(errorCodes);
    }

}
