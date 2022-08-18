package Day8.Java;

import java.util.Arrays;

public class StringSplitMethod {
    //split() Splits a string into an array of substrings
    public static void main(String[] args) {

        // String array (String[]) is the topic for future. Just focus on the method itself.
        String str = "myemail@gmail.com";
        String[] split = str.split("@");
        System.out.println(Arrays.toString(split));

        String str2 = "I love java. Java is Fun. I will be a good software engineer";
        String[] s = str2.split(" ");
        System.out.println(Arrays.toString(s));

    }
}
