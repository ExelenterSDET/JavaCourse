package Day34.Practice;

import java.util.Arrays;
import java.util.HashMap;

public class arthurday34tsk2 {
    public static void main(String[] args) {

        System.out.println(me2("daabbcc"));

    }
    static String me2(String str) {

        String[] arr = str.split("");
        HashMap<String, Integer> dummyHash = new HashMap<>();
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {

            dummyHash.computeIfPresent(arr[i], (k, v) -> v = v + 1);
            dummyHash.computeIfAbsent(arr[i], k -> 1);
        }
        for (String character : dummyHash.keySet()) {
            if (dummyHash.get(character).equals(1)){
                return character;
            }

        }
        return "$";
    }

}
