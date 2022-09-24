package Day34.Practice.Tohir_Week_8;

import javax.xml.stream.events.Characters;
import java.util.HashSet;
import java.util.Random;

public class Task_7 {
    public static void main(String[] args) {

        Task_7 asg = new Task_7();
        System.out.println(asg.addChar());
    }

        HashSet<Character> addChar()
        {
            Random ran = new Random();
            HashSet<Character> returnCharr_1 = new HashSet<>();
            for (int i = 0; i < 11; i++) {
                char c = (char) ran.nextInt(97,122);
                returnCharr_1.add(c);
            }
         return returnCharr_1;
        }
/*        HashSet<Character> Uniquelist(HashSet<Character> charArr_1,HashSet<Character> charArr_2)
        {
            HashSet<Character> returnArr = new HashSet<>();
            for (int i = 0; i < charArr_1.toArray().length; i++) {
                for (int i1 = 0; i1 < charArr_2.toArray().length; i1++) {
                    charArr_1.toArray().
                }
            }
        }*/
    }
    /*
    Task 7.

           Create 2 HashSet<Characters> objects.
           Keep adding random lowercase letters to the set until the size of each set is 10.

           1. Create a method to return the ArrayList of unique characters both of the sets have.
           2. Create a method to return the ArrayList of shared characters both of the sets have.
           3. Create a method to return the ArrayList of characters which are only in the first set.

     */

