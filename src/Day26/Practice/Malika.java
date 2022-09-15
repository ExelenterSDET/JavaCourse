package Day26.Practice;

import java.util.Arrays;

public class Malika {
    public static void main(String[] args) {

        String s = "JAVA";

        String[] arr = {"J", "A", "V", "A"};
        String s1 = "";

        for (String s2 : arr) {
            s1 = s1 + s2;
        }

        System.out.println(s);
        System.out.println(s1);

        System.out.println(s == s1);
        System.out.println(s.equals(s1));

        String[][] arr1 = {{"a"}};
        String[][] arr2 = {{"a"}};

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr1[0] == arr2[0]);
        System.out.println(Arrays.deepEquals(arr1, arr2));

    }
}