package Day34.Practice.SaturdayProject7Andrea;

import java.util.*;

public class Task6 {

//    Task 6.
//
//    Given an ArrayList<Characters> as a parameter.
//    {a b c e f a t d a l m u v x a e b d}
//         1. Create a method to return ArrayList<Character> with the unique values and in the descending order.
//
//            2. Create a method to return HashMap<Character, Integer>.
//    The Parameter is ArrayList<Character>. (The list must be sorted in descending order have only unique values.)
//    Add each character as a key to the map and its ASCII code as a value.
//
//            3. Create a method which will have HashMap<Character, Integer> as a parameter and will return a double.
//    Return the average of all values of a map. double number must have only 2 decimals. (Example: 10.25)
    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'e', 'f', 'a', 't', 'd', 'a', 'l', 'm', 'u', 'v', 'x', 'a', 'e', 'b', 'd'));
        System.out.println(chars);
        ArrayList<Character> uniqueChars = uniqueValues(chars);
        System.out.println(uniqueChars);
        HashMap<Character, Integer> map = getHashMap(uniqueChars);
        System.out.println(map);
        System.out.println(averageOfMap(map));
    }
    static ArrayList<Character> uniqueValues (ArrayList<Character> list) {
        ArrayList<Character> temp = new ArrayList<>(list);
        ArrayList<Character> uniqueChars = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            list.removeIf(n -> n != ch);
            if (list.size() == 1) {
                uniqueChars.add(list.get(0));
            }
            list = new ArrayList<>(temp);
        }
            uniqueChars.sort(Collections.reverseOrder());
            return uniqueChars;
    }
    static HashMap<Character, Integer> getHashMap (ArrayList<Character> charList){
        HashMap<Character, Integer> map = new HashMap<>();
        int value = 122;
        for (char ch = 'z'; ch >= 'a'; ch--) {
            if (charList.contains(ch)) {
                map.put(ch, value);
            }
            value--;
        }
        return map;
    }
    static double averageOfMap(HashMap<Character, Integer> MapArr)
    {
        double total = 0.00;
        int size = 0;
        for(Map.Entry<Character, Integer> row: MapArr.entrySet())
        {
            total += (double) row.getValue();
            size++;
        }
        return (total/size);
    }
}
