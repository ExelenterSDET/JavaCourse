package Day34.Practice.Ibrahim_Saturday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;

/*
    Task 6.

     Given an ArrayList<Characters> as a parameter.
     {a b c e f a t d a l m u v x a e b d}
     1. Create a method to return ArrayList<Character> with the unique values and in the descending order.

     2. Create a method to return HashMap<Character, Integer>.
        The Parameter is ArrayList<Character>. (The list must be sorted in descending order have only unique values.)
        Add each character as a key to the map and its ASCII code as a value.

     3. Create a method which will have HashMap<Character, Integer> as a parameter and will return a double.
        Return the average of all values of a map. double number must have only 2 decimals. (Example: 10.25)

 */
public class Task6 {

    static ArrayList<Character> getUniqueValues(ArrayList<Character> list){
        ArrayList <Character> uniqueChars = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int counter = 0;
            for (Character character : list) {
                counter += list.get(i) == character ? 1 : 0;
            }
            if(counter == 1){
                uniqueChars.add(list.get(i));
            }
        }
        list.clear();
        Collections.reverse(uniqueChars);
        list.addAll(uniqueChars);
        System.out.println("list = " + list);
        return list;
    }

    static LinkedHashMap<Character, Integer> getASCII(ArrayList<Character> list){
        LinkedHashMap<Character, Integer> asciiCodes =new LinkedHashMap<>();

        for (Character character : list) {
            asciiCodes.put(character, (int)character);
        }
        System.out.println("asciiCodes = " + asciiCodes);
        return asciiCodes;
    }

    static double getAverage(LinkedHashMap<Character, Integer> list){

        double total = 0.0;
        ArrayList<Character> ch = new ArrayList<>(Arrays.asList(list.keySet().toArray(new Character[0])));

        for (Character character : ch) {
            total += list.get(character);
        }

        double average = total / list.size();
        System.out.format("Average = " + "%.2f", average);

        return average;
    }


    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'e', 'f', 'a', 't', 'd', 'a', 'l',
                                                                    'm', 'u', 'v', 'x', 'a', 'e', 'b', 'd'));

        getAverage(getASCII(getUniqueValues(list)));

    }
}
