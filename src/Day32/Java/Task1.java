package Day32.Java;

import java.util.HashMap;

public class Task1 {
    /*
    Create a map which holds the error status codes.

    5 min.
    200 OK
    201 Created
    202 Accepted
    203 Non-Authoritative Information
    204 No Content

     */

    public static void main(String[] args) {
        HashMap<Integer, String> errorCodes = new HashMap<>();
        errorCodes.put(200, "OK");
        errorCodes.put(201, "Created");
        errorCodes.put(202, "Accepted");
        errorCodes.put(203, "Non-Authoritative Information");
        errorCodes.put(204, "No Content");

        System.out.println(errorCodes);
    }
}
