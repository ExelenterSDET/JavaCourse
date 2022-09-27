package Day34.Practice.Tohir_Week_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.round;

public class Task_6 {
    public static void main(String[] args) {
        Task_6 asg = new Task_6();
        ArrayList<Character> charArr = new ArrayList<>(Arrays.asList('a','b','c','d','a','b','c'));
        System.out.println(asg.UniqChar(charArr));
        System.out.println(asg.chartoASCII(asg.UniqChar(charArr)));
        System.out.println(asg.AverageofMap(asg.chartoASCII(asg.UniqChar(charArr))));

    }
    ArrayList<Character> UniqChar(ArrayList<Character> charArr)
    {
        ArrayList<Character> charList = new ArrayList<>();
        for (int i = 0; i < charArr.size(); i++) {
            if (charList.contains(charArr.get(i))==false)
            {
                charList.add(charArr.get(i));
            }
        }
        return charList;
    }
    HashMap<Character, Integer> chartoASCII(ArrayList<Character> charArr)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < charArr.size(); i++) {
            map.put(charArr.get(i),Integer.valueOf(charArr.get(i)));
        }
        return map;
    }
    double AverageofMap(HashMap<Character, Integer> MapArr)
    {
        double total = 0.00;
        int size = 0;
        for(Map.Entry<Character, Integer> row: MapArr.entrySet())
        {
            total += (double) row.getValue();
            size++;
        }
        double average = total/size;
        return (average);
    }


/*
Task 6.
         3. Create a method which will have HashMap<Character, Integer> as a parameter and will return a double.
            Return the average of all values of a map. double number must have only 2 decimals. (Example: 10.25)
         Given an ArrayList<Characters> as a parameter.
         {a b c e f a t d a l m u v x a e b d}
         1. Create a method to return ArrayList<Character> with the unique values and in the descending order.

         2. Create a method to return HashMap<Character, Integer>.
            The Parameter is ArrayList<Character>. (The list must be sorted in descending order have only unique values.)
            Add each character as a key to the map and its ASCII code as a value.



 */
}
