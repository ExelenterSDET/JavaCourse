package Day39.Practice._10_04_2022_Mentoring;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Task4 {
    /*Task 4
        Given an array of Strings.
        Create a method, that will sort this array of Strings in ascending order.

       !!!!!!!! NOTE: Do not use any of built-in sort methods => (Arrays.sort, Collection.sort etc.) !!!!!!!!!
       */
    static String [] sortStringArray(String [] arr){  // {"abc", "ab", "x", "abc"}  {k, 4}
        TreeMap<String, Integer> map = new TreeMap<>();
        int size = 0;
        for (String s : arr) {
            map.computeIfAbsent(s, k -> 0);
            map.computeIfPresent(s, (k, v) -> v+1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            size += entry.getValue();
        }
        String [] sortedArr = new String[size];
        int index = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1){
                int counter = 1;
                while (counter <= entry.getValue()){
                    sortedArr[index++] = entry.getKey();
                    counter++;
                }
            } else {
                sortedArr[index++] = entry.getKey();
            }
        }
        return sortedArr;
    }

    public static void main(String[] args) {
        String[] strings = {"dfs", "x", "ab", "ll89o", "x", "bbww", "ab", "x", "89", "ab", "ooo", "axz", "ab"};
        System.out.println(Arrays.toString(sortStringArray(strings)));
    }
}
