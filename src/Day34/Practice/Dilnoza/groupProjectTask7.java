package Day34.Practice.Dilnoza;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class groupProjectTask7 {
    /*
    Task 7.

           Create 2 HashSet<Characters> objects.
           Keep adding random lowercase letters to the set until the size of each set is 10.

           1. Create a method to return the ArrayList of unique characters both of the sets have.
           2. Create a method to return the ArrayList of shared characters both of the sets have.
           3. Create a method to return the ArrayList of characters which are only in the first set.
     */
    public static void main(String[] args) {


        Random random = new Random();
        HashSet<Character> object1 = new HashSet<>();
        while (object1.size() < 4) {// change to 10
            char c = (char) random.nextInt(97, 123);
            object1.add(c);
        }
        System.out.println("===================Two HashSets======================");
        System.out.println("object1 = " + object1);

        HashSet<Character> object2 = new HashSet<>();
        while (object2.size() < 4) {// change to 10
            char ch = (char) random.nextInt(97, 123);
            object2.add(ch);
        }
        System.out.println("object2 = " + object2);
        ArrayList<Character> uniquesChar = getUniquesChar(object1, object2);
        System.out.println("=========================================");
        System.out.println("sameChar " + getSameChar(object1, object2));
        System.out.println("uniquesChar = " + uniquesChar);

        System.out.println("First char" + getFirstChar(object1, object2));


    }

    static ArrayList<Character> getUniquesChar(HashSet<Character> hash1, HashSet<Character> hash2) {

        HashSet<Character> object1 = new HashSet<>(hash1);
        HashSet<Character> object2 = new HashSet<>(hash2);
        object2.removeAll(object1);
        object1.removeAll(object2);

        return new ArrayList<>(object1);
    }

    static ArrayList<Character> getSameChar(HashSet<Character> hash1, HashSet<Character> hash2) {
        hash1.retainAll(hash2);
        return new ArrayList<>(hash1);
    }

    static ArrayList<Character> getFirstChar(HashSet<Character> hash1, HashSet<Character> hash2) {

        return new ArrayList<>(hash1);
    }
}







