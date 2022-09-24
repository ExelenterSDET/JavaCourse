package Day33.Practice.Andrea;

import java.util.HashMap;

public class Mentoring3 {
    public static void main(String[] args) {
        String[] arr1 = {"a","c","a","c","b"};
        System.out.println(wordCount(arr1));
    }

    static HashMap<String, Integer> wordCount(String[] arr){
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : arr) {
            Integer counter = map.get(s);
            if (counter == null){
                map.put(s,1);
            }
            else {
                map.put(s, counter+1);
            }

        }
        return map;
    }
}
