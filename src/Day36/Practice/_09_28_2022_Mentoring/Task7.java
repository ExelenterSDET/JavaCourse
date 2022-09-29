package Day36.Practice._09_28_2022_Mentoring;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Task7 {
    /*     Task 7.

           Create 2 HashSet<Characters> objects.
           Keep adding random lowercase letters to the set until the size of each set is 10.

           1. Create a method to return the ArrayList of unique characters both of the sets have.
           2. Create a method to return the ArrayList of shared characters both of the sets have.
           3. Create a method to return the ArrayList of characters which are only in the first set.
           */

    static HashSet<Character> randomSet(){
        HashSet<Character> set = new HashSet<>();
        Random rnd = new Random();
        while (set.size() < 10){
            int ch = rnd.nextInt('z' - 'a'+1) + 'a'; // (max-min +1) + min
            set.add((char)ch);
        }
        return set;
    }

    static ArrayList<Character> getUniqueCharsOfTwoSets(HashSet<Character> set1, HashSet<Character> set2){
        HashSet<Character> temp = new HashSet<>(set2);
        ArrayList<Character> listOfChars = new ArrayList<>();
        temp.removeAll(set1);
        set1.removeAll(set2);
        temp.addAll(set1);
        listOfChars.addAll(temp);
        return listOfChars;
    }

    static ArrayList<Character> getSharedChars(HashSet<Character> set1, HashSet<Character> set2){
        ArrayList<Character> listOfChars = new ArrayList<>();
        set1.retainAll(set2);
        listOfChars.addAll(set1);
        return listOfChars;
    }

    static ArrayList<Character> getOnlyFirstSetChars(HashSet<Character> set1, HashSet<Character> set2){
        ArrayList<Character> listOfChars = new ArrayList<>();
        set1.removeAll(set2);
        listOfChars.addAll(set1);
        return listOfChars;
    }


    public static void main(String[] args) {
        HashSet<Character> set1 = randomSet();
        HashSet<Character> set2 = randomSet();
        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);
        ArrayList<Character> arrayList = getSharedChars(set1, set2);
        System.out.println("arrayList = " + arrayList);
        System.out.println();

        HashSet<Character> set3 = randomSet();
        HashSet<Character> set4 = randomSet();
        System.out.println("set3 = " + set3);
        System.out.println("set4 = " + set4);
        ArrayList<Character> arrayList2 = getUniqueCharsOfTwoSets(set3, set4);
        System.out.println("arrayList2 = " + arrayList2);
        System.out.println();

        HashSet<Character> set5 = randomSet();
        HashSet<Character> set6 = randomSet();
        System.out.println("set5 = " + set5);
        System.out.println("set6 = " + set6);
        ArrayList<Character> arrayList3 = getOnlyFirstSetChars(set5, set6);
        System.out.println("arrayList3 = " + arrayList3);
    }
}
