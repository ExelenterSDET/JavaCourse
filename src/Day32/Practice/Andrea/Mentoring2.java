package Day32.Practice.Andrea;

import java.util.Arrays;
import java.util.HashSet;

public class Mentoring2 {

    // Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5,5};
        System.out.println(hasDupes2(nums));
    }

    static boolean hasDupes (int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

    static boolean hasDupes2 (int[] nums){
        HashSet<Integer> setOfInts = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
                boolean isItAdded = setOfInts.add(nums[i]);
                if (!isItAdded){
                    return true;
                }
        }
        return false;
    }
}
