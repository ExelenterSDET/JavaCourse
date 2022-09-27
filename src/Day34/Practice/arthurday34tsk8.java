package Day34.Practice;

import java.util.HashMap;

public class arthurday34tsk8 {
    public static void main(String[] args) {
        String[] str = {"a", "b", "a", "c", "b"};
        System.out.println(r(str));


    }

    static HashMap<String, Boolean> r(String[] arr) {
        HashMap<String, Boolean> map = new HashMap<>();
        for (String a : arr) {
            map.computeIfPresent(a, (k, v) -> v = true);
            map.computeIfAbsent(a, k -> false);

        }
        return map;

    }
}