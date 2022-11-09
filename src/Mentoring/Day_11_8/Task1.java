package Mentoring.Day_11_8;
/* Given a binary array nums, return the maximum number of consecutive 1's in the array.
        Input: nums = [1,1,0,1,1,1]
        Output: 3
        Explanation: The first two digits or the last three digits are consecutive 1s.
        The maximum number of consecutive 1s is 3*/
public class Task1 {

static int longestConsecutiveOne(int [] arr){
       /* [1 1 0 1 1 1]
       *             ^
       * maxLength = Math.max(maxLength, counter)
       * maxLength = 3
       * counter = 3
       * */

    int maxLength  = 0;
    int counter = 0;

    for (int i = 0; i < arr.length; i++) {
        if(arr[i] == 1){
            counter++;
            maxLength = Math.max(maxLength, counter);
        }else {
            counter = 0;
        }
    }
    return maxLength;
    }
    static int longestConsecutiveOne2(int [] arr){
    int maxLength = 0;
    int counter = 0;

        for (int j : arr) {
        if (j == 0) {
            counter = 0;
        } else {
            counter++;
            maxLength = Math.max(maxLength, counter);
        }
    }
        return maxLength;
}

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 1, 1};
        int i = longestConsecutiveOne(arr);
        System.out.println(i);
    }
}
