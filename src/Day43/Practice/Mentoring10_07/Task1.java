package Day43.Practice.Mentoring10_07;

import java.util.Arrays;

public class Task1 {
    /*Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they
    add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.*/

    static int[] sumOfTwo2(int[] arr, int target){
        // 2  7 11 15
        int a = 0;
        int b = arr.length-1;

        while(a < b){
            int sum = arr[a] + arr[b];
            if(sum > target){
                b--;
            }else if(sum < target){
                a++;
            }else if(sum == target){
                return new int[]{a + 1, b + 1};
            }
        }
        return new int[]{a + 1, b + 1 };
    }
    public static void main(String[] args) {

        int [] arr = {2, 7, 2, 15, 7};


        int[] sumOfTwo = sumOfTwo2(arr, 14);
        System.out.println(Arrays.toString(sumOfTwo));


    }
    static int[] sumOfTwo(int[] arr, int target){

        int[] newArr = new int[2];
        //sum = [0] + [1]
        // i = 2 7 11 2 7        target = 14
        // j = 2 7 11 2 7

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if (arr[i] + arr[j] == target) {
                    newArr[0] = j + 1;
                    newArr[1] = i + 1;
                    break;
                }
            }
        }
        return newArr;
    }


}
