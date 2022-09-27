package Day34.Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaturdayProjectMehmetAliTask08 {
    /*Task 8
       Create a method which will have as a parameter an array of strings.
       Return a Map<String, Boolean> where each different string is a key and
       its value is true if that string appears 2 or more times in the array.
       Example:
       ["a", "b", "a", "c", "b"]
       Result:
       {"a": true, "b": true, "c": false}
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length number of the array: ");
        int len = scan.nextInt();
        System.out.println("Please enter a strings: ");

        String[] strArr = new String[len];
        for (int i = 0; i < len; i++) {
            String str = scan.next();
            strArr[i] = str;
        }
        System.out.println("strArr = " + Arrays.toString(strArr));

        notDoubled(strArr);
    }

    static HashMap<String, Boolean> notDoubled(String[] str) {
        HashMap<String, Integer> count = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            count.put(str[i], count.getOrDefault(str[i], 0) + 1);
        }
        System.out.println("count = " + count);
        HashMap<String, Boolean> result = new HashMap<>();
        for (Map.Entry<String, Integer> row : count.entrySet()) {
            if (row.getValue() > 1) {
                result.put(row.getKey(), true);
            } else {
                result.put(row.getKey(), false);
            }
        }
        System.out.println("result = " + result);
        return result;
    }
}