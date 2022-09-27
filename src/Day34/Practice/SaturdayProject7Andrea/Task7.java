package Day34.Practice.SaturdayProject7Andrea;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Task7 {

//    Task 7.
//
//    Create 2 HashSet<Characters> objects.
//    Keep adding random lowercase letters to the set until the size of each set is 10.
//
//            1. Create a method to return the ArrayList of unique characters both of the sets have.
//            2. Create a method to return the ArrayList of shared characters both of the sets have.
//            3. Create a method to return the ArrayList of characters which are only in the first set.
    public static void main(String[] args) {
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();


        Random random = new Random();
        for (int i = 0; i <= 10; i++) {
            char c = (char) (random.nextInt(97,123));
            set1.add(c);
        }
        System.out.println("Set1 = " + set1);

        for (int i = 0; i <= 10; i++) {
            char c = (char) (random.nextInt(97,123));
            set2.add(c);
        }
        System.out.println("Set2 = " + set2);

        HashSet<Character> temp1 = new HashSet<>(set1);
        HashSet<Character> temp2 = new HashSet<>(set2);

        System.out.println("Unique characters = " + uniqueChars(set1, set2));
        set1.addAll(temp1);
        set2.addAll(temp2);
        System.out.println("Shared characters = " + sharedChars(set1, set2));
        set1.addAll(temp1);
        set2.addAll(temp2);
        System.out.println("Only in Set1 = " + onlySet1(set1, set2));
    }

    static ArrayList<Character> uniqueChars (HashSet<Character> setA,HashSet<Character> setB){
        HashSet<Character> one = new HashSet<>(setA);
        HashSet<Character> two = new HashSet<>(setB);
        one.removeAll(setB);
        two.removeAll(setA);
        return new ArrayList<>(two);
    }

    static ArrayList<Character> sharedChars (HashSet<Character> setA,HashSet<Character> setB){
        setA.retainAll(setB);
        return new ArrayList<>(setA);
    }

    static ArrayList<Character> onlySet1 (HashSet<Character> setA,HashSet<Character> setB){
        setA.removeAll(setB);
        return new ArrayList<>(setA);
    }
}
