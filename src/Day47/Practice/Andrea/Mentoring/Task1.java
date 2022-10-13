package Day47.Practice.Andrea.Mentoring;

import java.util.HashSet;

public class Task1 {

    static int uniqueNumber(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                set.remove(arr[i]);
            } else {
                set.add(arr[i]);
            }
            for (Integer eachNumber : set) {
                return eachNumber;
            }
        }

            return -1;
        }

    static boolean containsDuplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            } else {
                set.add(arr[i]);
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,4,5};
        int i = uniqueNumber(arr);
        System.out.println(i);
        System.out.println(containsDuplicate(arr));
    }

}

