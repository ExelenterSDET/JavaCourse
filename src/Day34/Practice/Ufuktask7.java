package Day34.Practice;

import java.util.*;
import java.util.stream.Collectors;

public class Ufuktask7 {
    /*Task 7.
           Create 2 HashSet<Characters> objects.
           Keep adding random lowercase letters to the set until the size of each set is 10.

           1. Create a method to return the ArrayList of unique characters both of the sets have.
           2. Create a method to return the ArrayList of shared characters both of the sets have.
           3. Create a method to return the ArrayList of characters which are only in the first set.
     */
    public static void main(String[] args) {
        HashSet<Character> set1=new HashSet<>();
        while (set1.size()<10){
            set1.add((char)('a'+Math.random()*('z'-'a')));
        }
        System.out.println("set1 = " + set1);

        HashSet<Character> set2=new HashSet<>();
        while (set2.size()<10){
            set2.add((char)('a'+Math.random()*('z'-'a')));
        }
        System.out.println("set2 = " + set2);

        uniqueFirst(set1,set2);
        both(set1,set2);
        shared(set1,set2);

    }

    static ArrayList<Character> both(HashSet<Character> hash1, HashSet<Character> hash2){
        hash1.addAll(hash2);
        ArrayList<Character> charList = new ArrayList<>(hash1);
        System.out.println("unique characters both of the sets have: "+charList);
        return charList;
    }
    static ArrayList<Character> shared(HashSet<Character> hash1, HashSet<Character> hash2){
        hash1.retainAll(hash2);
        ArrayList<Character> charList = new ArrayList<>(hash1);
        System.out.println("shared characters both of the sets have: "+charList);
        return charList;
    }

    static ArrayList<Character> uniqueFirst(HashSet<Character> hash1, HashSet<Character> hash2){
        hash1.removeAll(hash2);
//        hash1.removeIf(character -> hash2.contains(character));
//        hash1.stream().filter(e -> !hash2.contains(e)).collect(Collectors.toSet());
        ArrayList<Character> charList = new ArrayList<>(hash1);
        System.out.println("characters which are only in the first set: "+charList);
        return charList;
    }

}
