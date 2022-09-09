package Day23.Practice.Day23.Andrea;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] intArr = {2,4,6,8,20,6,6,15,7};
        Practice practice = new Practice();
        practice.maxNum(intArr);
        practice.minNum(intArr);
        practice.getTotal(intArr);

        String[] strArr = {"cat","dog","mouse","frog","rabbit"};
        practice.revArr(strArr);
    }

    void maxNum (int[] arr){
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
    void minNum (int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
    void getTotal (int[] arr){
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        System.out.println("total = " + total);
    }
    void revArr (String[] arr){
        for (int i = 0, j = arr.length-1; i < j; i++, j--) {
            String tempStorage = arr[i];
            arr[i] = arr[j];
            arr[j] = tempStorage;
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
