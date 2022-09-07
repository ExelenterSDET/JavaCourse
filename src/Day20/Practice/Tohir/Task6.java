package Day20.Practice.Tohir;
import java.util.Arrays;
public class Task6 {    public static void main(String[] args) {
    //Task6:
    //        Given a String array as ["bird", "dog", "cat", "door"]
    //        Create a new array named as arrRev.
    //        Reverse the order of the elements of the String array and store in the arrRev.
    //        Print the arrRev
    //        Sample:
    //        Given ["bird", "dog", "cat", "door"] -> prints ["door", "cat", "dog" , "bird"]
    String [] str = {"bird", "dog", "cat", "door"};
    String [] strrev = new String[str.length];
    System.out.println("Arrays.toString(str) = " + Arrays.toString(str));
    for (int i = 0; i < str.length; i++) {
        strrev[str.length-1-i] = str [i];
    }
    System.out.println("Arrays.toString(strrev) = " + Arrays.toString(strrev));
}
}
