package Day8.Java;

import java.util.Arrays;

public class StringToStringMethod {

    // toString() Returns the value of a String object

    public static void main(String[] args) {

        String str = "Hello World";
        String s = str.toString();
        System.out.println("s = " + s);

        // array topic to see in the next sessions.
        int arr[] = {1,2,4};
        System.out.println("arr = " + arr);
        System.out.println("arr.toString() = " + Arrays.toString(arr));
    }
}
