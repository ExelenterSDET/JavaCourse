package Day20.Practice.Mustafa;

import java.util.Arrays;

public class Stask6 {
    public static void main(String[] args) {
 /* Task6:
        Given a String array as ["bird", "dog", "cat", "door"]
        Create a new array named as arrRev.
                Reverse the order of the elements of the String array and store in the arrRev.
        Print the arrRev
        Sample:
        Given ["bird", "dog", "cat", "door"] -> prints ["door", "cat", "dog" , "bird"]*/


        String [] arr = {"bird", "dog", "cat", "door"};

        String []arrRev = new String[arr.length];

        for (int i = arr.length-1,j = 0; i >0 ; i--,j++) {
            arrRev[j] = arr[i] ;

        }
        System.out.println("arrRev = " + Arrays.toString(arrRev));
    }
}
