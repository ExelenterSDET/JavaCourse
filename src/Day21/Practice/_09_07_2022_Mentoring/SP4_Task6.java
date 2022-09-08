package Day21.Practice._09_07_2022_Mentoring;

import java.util.Arrays;

public class SP4_Task6 {
            /*Task6:
        Given a String array as ["bird", "dog", "cat", "door"]
        Create a new array named as arrRev.
        Reverse the order of the elements of the String array and store in the arrRev.
        Print the arrRev
        Sample:
        Given ["bird", "dog", "cat", "door"] -> prints ["door", "cat", "dog" , "bird"]
        */

    public static void main(String[] args) {
        String [] animals= {"bird", "dog", "cat", "door"};
        String [] arrRev= new String[animals.length];

        for (int i = animals.length-1, j = 0; i >=0; i--) {
            arrRev[j++] = animals[i];
        }
        System.out.println(Arrays.toString(animals));
        System.out.println(Arrays.toString(arrRev));
    }

}
