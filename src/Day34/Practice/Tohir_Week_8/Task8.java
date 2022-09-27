package Day34.Practice.Tohir_Week_8;

import Day10.Saturday_Sebahattin.Task_08;

import java.util.HashMap;
import java.util.Map;

public class Task8 {
    public static void main(String[] args) {
        Task8 asg = new Task8();
        String str[] = {"a", "a", "b", "c", "c", "b", "e"};
        System.out.println(asg.returndoubleappearance(str));
    }

    Map<String,Boolean> returndoubleappearance(String[] str)
    {
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            map.computeIfAbsent(str[i],k-> 0);
            map.computeIfPresent(str[i],(k,v)->v+=1);
        }
        Map<String,Boolean> map0 = new HashMap<>();
        for (Map.Entry<String,Integer> row :map.entrySet())
        {
            if (row.getValue()==1)
            {
                map0.put(row.getKey(),false);
            }
            else
            {
                map0.put(row.getKey(),true);
            }
        }
        return map0;
    }
    /*
    Task 8

           Create a method which will have as a parameter an array of strings.
           Return a Map<String, Boolean> where each different string is a key and
           its value is true if that string appears 2 or more times in the array.

           Example:
           ["a", "b", "a", "c", "b"]
           Result:
           {"a": true, "b": true, "c": false}
     */
}
