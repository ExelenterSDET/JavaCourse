package Mentoring.Day_11_8;
/*       Given a binary array nums, return the maximum number of consecutive 1's in the array
         by flipping 2 0 .
        Input: nums = [1,0,1,1  ,0, 1, 1, 1, ,1 0, 0, 1 , 1, 1 1 1 1]

                      [1,0,1,1,0]
                           ^
                      [1,0,1,1,0]
                                ^
                                Math.max(max, R - l + 1)

        Output: 4*/
public class Task2 {
    static int longestConsecutiveOne(int [] arr){

        int left = 0;
        int right = 0;
        int maxLength = 0;
        int counter = 0;
        //     [1,0,1,1,0]
        while (right < arr.length){
            if(arr[right] == 0){
                counter ++;
            }
            if (counter > 1){
                left ++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr ={1,0,1,1,0};
        int i = longestConsecutiveOne(arr);
        System.out.println(i);
    }
}
