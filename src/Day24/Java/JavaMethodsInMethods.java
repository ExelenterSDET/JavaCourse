package Day24.Java;

import java.util.Arrays;

public class JavaMethodsInMethods {
    // method get max num
    int getMax(int... nums){
        Arrays.sort(nums);
        return nums[nums.length-1];
    }

    // method get min num
    static int getMin(int... nums){
        Arrays.sort(nums);
        return nums[0];
    }

    // method get difference between max and min
    static int getMaxMinDifference(int... nums){
        JavaMethodsInMethods jv = new JavaMethodsInMethods();
        return (jv.getMax(nums) - getMin(nums));
    }

    public static void main(String[] args) {

        int maxMinDifference = getMaxMinDifference(1, 2, 3, 5, 4, 6, 10);
        System.out.println(maxMinDifference);

    }
}
