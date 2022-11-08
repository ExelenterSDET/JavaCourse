package Mentoring.Day_11_7;
/*
* A peak element is an element that is strictly greater than its neighbors.
        Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
        You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
        You must write an algorithm that runs in O(log n) time.

        Example 1:

        Input: nums = [1,2,3,1]
        Output: 2
        Explanation: 3 is a peak element and your function should return the index number 2.
        Example 2:

        Input: nums = [1,2,1,3,5,6,4]
        Output: 5
        Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
*/

/*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].


Example 1:

Input: nums = [5,7,8,8,8,8,8,10], target = 8
Output: [2,6]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:
Input: nums = [], target = 0
Output: [-1,-1]

*/

import java.util.Arrays;

public class Task2 {
    static int[] startEndPosition(int[] arr, int target){
        int[] newArray = new int[2];
        if(arr == null){
            newArray[0] = -1;
            newArray[1] = -1;
        }

        newArray[0] = findStartPosition(arr, target);
        newArray[1] = findEndPosition(arr, target);

        return newArray;
    }
    static int findStartPosition(int[] arr, int target){
        int start = -1;

        int left = 0;
        int right = arr.length -1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (target == arr[mid]) {
                start = mid;
                right = mid - 1;
            } else if (target > arr[mid]) {
                left = mid + 1;
            }else {
                right = right - 1;
            }
        }
        return start;
    }
    static int findEndPosition(int[] arr, int target){

        int end = -1;
        int left = 0;
        int right = arr.length -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == arr[mid]) {
                end = mid;
                left = mid + 1;
            }else if (target > arr[mid]){
                left = mid + 1;
            }else {
                right = right - 1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,8,8,8,8,8,10};
        int[] ints = startEndPosition(arr, 8);
        System.out.println(Arrays.toString(ints));
    }
}
