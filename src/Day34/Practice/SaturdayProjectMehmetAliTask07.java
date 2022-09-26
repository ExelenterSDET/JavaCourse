package Day34.Practice;

import java.util.ArrayList;
import java.util.HashSet;

public class SaturdayProjectMehmetAliTask07 {
    /*Task 7.
       Create 2 HashSet<Characters> objects.
       Keep adding random lowercase letters to the set until the size of each set is 10.
       1. Create a method to return the ArrayList of unique characters both of the sets have.
       2. Create a method to return the ArrayList of shared characters both of the sets have.
       3. Create a method to return the ArrayList of characters which are only in the first set.
 */
    public static void main(String[] args) {
        HashSet<Character> array1 = new HashSet<>();
        while (array1.size() < 10) {
            array1.add((char) ('a' + Math.random() * ('z' - 'a')));
        }
        System.out.println("array1 = " + array1);

        HashSet<Character> array2 = new HashSet<>();
        while (array2.size() < 10) {
            array2.add((char) ('a' + Math.random() * ('z' - 'a')));
        }
        System.out.println("array2 = " + array2);

        uniqueFirst(array1, array2);
        both(array1, array2);
        shared(array1, array2);

    }

    static ArrayList<Character> both(HashSet<Character> hash1, HashSet<Character> hash2) {
        hash1.addAll(hash2);
        ArrayList<Character> charList = new ArrayList<>(hash1);
        System.out.println("unique characters are both in arrays: " + charList);
        return charList;
    }

    static ArrayList<Character> shared(HashSet<Character> hash1, HashSet<Character> hash2) {
        hash1.retainAll(hash2);
        ArrayList<Character> charList = new ArrayList<>(hash1);
        System.out.println("characters are in both arrays: " + charList);
        return charList;
    }

    static ArrayList<Character> uniqueFirst(HashSet<Character> hash1, HashSet<Character> hash2) {
        hash1.removeAll(hash2);
//        hash1.removeIf(character -> hash2.contains(character));
//        hash1.stream().filter(e -> !hash2.contains(e)).collect(Collectors.toSet());
        ArrayList<Character> charList = new ArrayList<>(hash1);
        System.out.println("characters only in the first array: " + charList);
        return charList;
    }
}