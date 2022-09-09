package Day23.Java;

import java.util.Arrays;

public class Task1 {
    // create a method, which will take int[] and return the maxNum
    // create a method, which will take int[] and return the minNum
    // create a method, which will take two int parameters and calculate total of maxNum and minNum
    public static void main(String[] args) {

        int[] arr = {5,6,2,1,9,10,15,20};

        int total = getTotal(maxNum(arr), minNum(arr));
        System.out.println(total);

    }

    static int maxNum(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    static int minNum(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    static int getTotal(int a, int b){
        return a+b;
    }
}
