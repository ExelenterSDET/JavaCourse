package Day18.Java;

import java.util.Arrays;

public class JavaArrays4 {
    public static void main(String[] args) {

        char c[] = {'J','A','V', 'A'};

        System.out.println(Arrays.toString(c));

        String str = "JAVA";
        String[] split = str.split("");
        System.out.println(Arrays.toString(split));

        String str2 = "Java is fun. I love java. I am going to be a sdet";
        String[] s = str2.split(" ");
        System.out.println(Arrays.toString(s));

    }
}
