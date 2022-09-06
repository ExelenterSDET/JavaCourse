package Day20.Practice.Sebahattin;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
/*      Task6:
        Given a String array as ["bird", "dog", "cat", "door"]
        Create a new array named as arrRev.
        Reverse the order of the elements of the String array and store in the arrRev.
        Print the arrRev
        Sample:
        Given ["bird", "dog", "cat", "door"] -> prints ["door", "cat", "dog" , "bird"]
*/
        String []str = {"bird", "dog", "cat", "door"};
        System.out.println(Arrays.toString(str));

        for(int i=0; i<str.length/2; i++) {
            String rev = str[i];
            str[i] = str[str.length-i-1];
            str[str.length-i-1] = rev;
        }
        System.out.println(Arrays.toString(str));
    }
}
