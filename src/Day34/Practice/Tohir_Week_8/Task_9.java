package Day34.Practice.Tohir_Week_8;

import java.util.HashMap;
import java.util.Map;

public class Task_9 {
    public static void main(String[] args) {
        Task_9 asg = new Task_9();
        HashMap<String, String> map = new HashMap<>();
        map.put("spinach","dirt");
        map.put("ice cream","cherry");
        System.out.println(asg.changeName(map));
    }

    HashMap<String, String> changeName(HashMap<String, String> map)
    {
        HashMap<String, String> map0 = new HashMap<>();
        for(Map.Entry<String,String> row: map.entrySet())
        {
            if (row.getKey().equals("ice cream"))
            {
                map0.put(row.getKey(), row.getValue());
                map0.put("yogurt",row.getValue());
            }
            if (row.getKey().equals("spinach"))
            {
                map0.put(row.getKey(), "nuts");
            }
        }
        return map0;
    }

}
/*
Task 9

          Given a HashMap<String, String>.
          The map has keys and values as follow:
          {"spinach": "dirt", "ice cream": "cherry"}


          Create a method with HashMap<String, String> parameter, return same type of map.
          The method should modify the map as follow:

          if the key is "ice cream", create a new key as "yogurt" and value should be the same as for "ice cream".
          If the key is "spinach", change that value to "nuts".

          Example:
          {"spinach": "dirt", "ice cream": "cherry"}

          Result:
          {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}

 */