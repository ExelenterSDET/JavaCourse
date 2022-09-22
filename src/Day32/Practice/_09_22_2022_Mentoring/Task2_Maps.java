package Day32.Practice._09_22_2022_Mentoring;

import java.util.HashMap;

public class Task2_Maps {
    /*The classic word-count algorithm:
    given an array of strings, return a Map<String, Integer>
    with a key for each different string, with the value the number of times that string appears in the array.

wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}*/

    public static void main(String[] args) {
        String [] arr1 = {"a", "b", "a", "c", "b"};
        String [] arr2 = {"c", "b", "a"};
        String [] arr3 = {"c", "c", "c", "c"};

        System.out.println(wordCount(arr1));
    }
    static HashMap<String, Integer> wordCount(String [] arr){

        HashMap<String, Integer> map = new HashMap<>();

        for (String s : arr) {
            Integer counter = map.get(s);
            if (counter == null){
                map.put(s, 1);
            }
            else {
                map.put(s, counter+1);
            }
        }
        return map;
    }
}
