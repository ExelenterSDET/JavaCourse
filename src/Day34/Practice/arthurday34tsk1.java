package Day34.Practice;

import java.util.Arrays;
import java.util.HashMap;

public class arthurday34tsk1 {
    public static void main(String[] args) {


        System.out.println(me2(me(10)));

    }

    static int[] me(int n) {
        int[] dummy = new int[n];
        for (int i = 0; i < dummy.length; i++) {
            int j = (int) (Math.random() * 10) + 10;
            dummy[i] = j;
        }
        return dummy;
    }

    static HashMap<Integer, Integer> me2(int[] arr) {
        HashMap<Integer, Integer> dummyHash = new HashMap<>();
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {

            dummyHash.computeIfPresent(arr[i], (k, v) -> v = v + 1);
            dummyHash.computeIfAbsent(arr[i], k -> 1);
        }
        return dummyHash;
    }

}
