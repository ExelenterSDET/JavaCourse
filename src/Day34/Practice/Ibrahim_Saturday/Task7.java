package Day34.Practice.Ibrahim_Saturday;

import java.util.HashSet;
import java.util.Random;

/*
        Task 7.

       Create 2 HashSet<Characters> objects.
       Keep adding random lowercase letters to the set until the size of each set is 10.

       1. Create a method to return the ArrayList of unique characters both of the sets have.
       2. Create a method to return the ArrayList of shared characters both of the sets have.
       3. Create a method to return the ArrayList of characters which are only in the first set.
 */
public class Task7 {

    public static void main(String[] args) {
        Random random = new Random();

        HashSet<Character> list1 = new HashSet<>();
        HashSet<Character> list2 = new HashSet<>();

        int size = 11;
        for (int i = 0; i < size; i++) {
            list1.add((char)random.nextInt(97, 123));
            list2.add((char)random.nextInt(97, 123));
        }
        System.out.println(list1);
        System.out.println(list2);

        uniqueChars(list1, list2);
//        sharedChars(list1, list2);
//        onlyInFirstSet(list1, list2);

    }
    static void uniqueChars(HashSet<Character> list1, HashSet<Character> list2){
        list1.removeAll(list2);
        System.out.println(list1);
    }
    static void sharedChars(HashSet<Character> list1, HashSet<Character> list2){
        list1.retainAll(list2);
        System.out.println(list1);
    }
    static void onlyInFirstSet(HashSet<Character> list1, HashSet<Character> list2){
        list1.removeAll(list2);
        System.out.println(list1);
    }
}
