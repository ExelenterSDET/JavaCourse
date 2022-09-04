package Day20.Practice.DilnozaTasks;

import java.util.Arrays;

public class Task6 {
    /*    Task6:
    Given a String array as ["bird", "dog", "cat", "door"]
       Create a new array named as arrRev.
       Reverse the order of the elements of the String array and store in the arrRev.
       Print the arrRev
       Sample:
       Given ["bird", "dog", "cat", "door"] -> prints ["door", "cat", "dog" , "bird"]
       */
    public static void main(String[] args) {
        String origArray [] = {"bird", "dog", "cat", "door"};
        String revArray[] =new String [origArray.length];

        for (int i = origArray.length-1, j = 0; i>=0;i--, j++) {
            revArray[j]=origArray[i];

        }
        System.out.println("origArray = " + Arrays.toString(origArray));
        System.out.println("revArray = " + Arrays.toString(revArray));

    }
}
