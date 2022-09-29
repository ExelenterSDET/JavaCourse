package Day36.Practice._09_28_2022_Mentoring;

import java.util.*;

public class Task6 {
        /*     Task 6.

         Given an ArrayList<Characters> as a parameter.
         {a b c e f a t d a l m u v x a e b d}
         1. Create a method to return ArrayList<Character> with the unique values and in the descending order.

         2. Create a method to return HashMap<Character, Integer>.
            The Parameter is ArrayList<Character>. (The list must be sorted in descending order have only unique values.)
            Add each character as a key to the map and its ASCII code as a value.

         3. Create a method which will have HashMap<Character, Integer> as a parameter and will return a double.
            Return the average of all values of a map. double number must have only 2 decimals. (Example: 10.25)
            */

    static ArrayList<Character> descOrderOfUniqueChars(ArrayList<Character> list){
        TreeSet<Character> treeSet = new TreeSet<>(list);
        ArrayList<Character> sortedList = new ArrayList<>(treeSet);
        Collections.reverse(sortedList);
        return sortedList;
    }
    static ArrayList<Character> descOrderOfUniqueChars2(ArrayList<Character> list){
        ArrayList<Character> sortedList = new ArrayList<>();
        ArrayList<Character> arrayList = new ArrayList<>(list);
        for (int i = 0; i < arrayList.size(); i++) {
            char ch = arrayList.get(0);
            sortedList.add(ch);
            arrayList.removeIf(c -> c == ch);
            i--;
        }
        Collections.sort(sortedList);
        Collections.reverse(sortedList);
        return sortedList;
    }

    static HashMap<Character, Integer> getASCII(ArrayList<Character> characterArrayList){
        LinkedHashMap<Character, Integer> asciiMap = new LinkedHashMap<>();
        ArrayList<Character> charList = descOrderOfUniqueChars(characterArrayList);
        for (Character character : charList) {
            asciiMap.put(character, (int) character);
        }
        return asciiMap;
    }

    static double getAverage(HashMap<Character, Integer> map){
        double total = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            total += entry.getValue();
        }
        return total/map.size(); // 12.12123213
    }

    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'e', 'f', 'a', 't', 'd', 'a', 'l', 'm', 'u', 'v', 'x', 'a', 'e', 'b', 'd'));
        ArrayList<Character> arrayList = descOrderOfUniqueChars(chars);
        System.out.println(getASCII(arrayList));
        System.out.println(String.format("%.2f", getAverage(getASCII(arrayList))));
    }
}
