package Day56.Practice.mentoring_10_26;

public class Task3 {
/*
A peak element is an element that is strictly greater than its neighbors.
        Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
        You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
        You must write an algorithm that runs in O(log n) time.

        Example 1:

        Input: nums = [1,2,3,1]
        Output: 2
        Explanation: 3 is a peak element and your function should return the index number 2.
        Example 2:

        Input: nums = [1,2,1,3,0,6,4]
        Output: 5
        Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
*/
public static void main(String[] args) {
    int[]arr = {1,2,1,3,5,6,4};
    int i = peakElementIndex2(arr);
    System.out.println("index = " + i);
}
    static int peakElement(int[] arr){
        // binary search ----> [1,2,1,3,5,6,4] if(mid > mid - 1) check all left side of mid && if(mid < mid + 1) it will check all right of mid
        int left = 0;
        int right = arr.length - 1;

        while (left < right){
            int mid = left + (right - left)/2;
            if(arr[mid] > arr[mid + 1]){
                right = mid;
            }
            else if (arr[mid] < arr[mid + 1]){
                left = mid +1 ;
            }
        }

        return left;
    }
    public static int peakElementIndex2(int[] arr) {
        int len = arr.length;
        int left = 0;
        int right = len - 1;
        while (left < right) {
            if (arr[left] <= arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("max = " + left);
        return left;
    }
}
