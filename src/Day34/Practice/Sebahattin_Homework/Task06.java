package Day34.Practice.Sebahattin_Homework;

import java.util.*;

public class Task06 {
/*
        Given an ArrayList<Characters> as a parameter.
         {a b c e f a t d a l m u v x a e b d}
         1. Create a method to return ArrayList<Character> with the unique values and in the descending order.

         2. Create a method to return HashMap<Character, Integer>.
            The Parameter is ArrayList<Character>. (The list must be sorted in descending order have only unique values.)
            Add each character as a key to the map and its ASCII code as a value.

         3. Create a method which will have HashMap<Character, Integer> as a parameter and will return a double.
            Return the average of all values of a map. double number must have only 2 decimals. (Example: 10.25)
*/
    public static void main(String[] args) {
        ArrayList<Character> chr = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'e', 'f', 'a', 't', 'd', 'a', 'l', 'm', 'u', 'v', 'x', 'a', 'e', 'b', 'd'));
        ArrayList<Character> chrUniqueDescending = new ArrayList<>(getUniqueDescending(chr));
        System.out.println(chrUniqueDescending);
        HashMap<Character, Integer> mapUniquDescending = new HashMap<>(getHashMap(chrUniqueDescending));
        System.out.println(mapUniquDescending);
        System.out.println("Average = "+getAverage(mapUniquDescending));

}
    static ArrayList<Character> getUniqueDescending (ArrayList<Character> chr){
//        ArrayList<Character> newChr = new ArrayList<>();
//        for (int i = 0; i < chr.size(); i++) {
//            if (newChr.contains(chr.get(i)) == false){
//                newChr.add(chr.get(i));
//            }
//        }
//        System.out.println(newChr);
//        for (int i = 0; i < newChr.size(); i++) {
//            for (int j = newChr.size()-1; i < j; j--) {
//                if (newChr.get(i) < newChr.get(j)){
//                    char ch = newChr.get(j);
//                    newChr.set(j,newChr.get(i));
//                    newChr.set(i,ch);
//                }
//            }
//        }
        HashSet<Character> charset=new HashSet<>((chr));
        ArrayList<Character> chlist = new ArrayList<Character>();
        chlist.addAll(charset);
        Collections.reverse(chlist);
        return chlist;
    }
    static HashMap<Character, Integer> getHashMap (ArrayList<Character> chr2){
        HashMap<Character, Integer> map = new HashMap<>();
        int value = 97;
        for (char key = 'a'; key <= 'z'; key++) {
            if (chr2.contains(key)) {
                map.put(key, value);
            }
            value--;
        }
        return map;
    }
    static double getAverage (HashMap<Character, Integer> mapUniquDescending){
        double total = 0.00;
        for(Map.Entry<Character, Integer> row: mapUniquDescending.entrySet()){
            total += (double) row.getValue();
        }
        return (((int)((total/mapUniquDescending.size()) *100))/100.00);
    }
}
