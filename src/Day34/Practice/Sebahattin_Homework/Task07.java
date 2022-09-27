package Day34.Practice.Sebahattin_Homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Task07 {
/*    Create 2 HashSet<Characters> objects.
    Keep adding random lowercase letters to the set until the size of each set is 10.

            1. Create a method to return the ArrayList of unique characters both of the sets have.
            2. Create a method to return the ArrayList of shared characters both of the sets have.
            3. Create a method to return the ArrayList of characters which are only in the first set.
*/
    public static void main(String[] args) {
        Random rnd = new Random();
        HashSet<Character> lowerCase1 = new HashSet<>();
        HashSet<Character> lowerCase2 = new HashSet<>();
//        for (int i = 0; i < 100; i++) {
//            char chr1 = (char) rnd.nextInt(97,122);
//            char chr2 = (char) rnd.nextInt(97,122);
//            lowerCase1.add(chr1);
//            lowerCase2.add(chr2)
//            if (lowerCase1.size() == 10){
//                break;
//            }
//        }
        while (lowerCase1.size() < 10){
            lowerCase1.add((char) rnd.nextInt(97,122));
        }
        System.out.println("List first  = "+lowerCase1);
        while (lowerCase2.size() < 10){
            lowerCase2.add((char) rnd.nextInt(97,122));
        }
        System.out.println("List second = "+lowerCase2);

        System.out.println("Unique characters both of the sets have = "+getUnique(lowerCase1,lowerCase2));
        System.out.println("Shared characters both of the sets have = "+getShared(lowerCase1, lowerCase2));
        System.out.println("Characters which are only in the first set = "+getOnlyFirst(lowerCase1, lowerCase2));
    }
    static ArrayList<Character> getUnique (HashSet<Character> lowerCase1, HashSet<Character> lowerCase2){
        ArrayList<Character> list = new ArrayList<>(lowerCase1);
        list.addAll(lowerCase2);
        return list;

    }
    static ArrayList<Character> getShared (HashSet<Character> lowerCase1, HashSet<Character> lowerCase2){
        ArrayList<Character> arr = new ArrayList<>(lowerCase1);
        arr.retainAll(lowerCase2);
        return arr;

    }
    static ArrayList<Character> getOnlyFirst (HashSet<Character> lowerCase1, HashSet<Character> lowerCase2){
        lowerCase1.removeAll(lowerCase2);
        ArrayList<Character> arr = new ArrayList<>(lowerCase1);
        return arr;
    }
}
