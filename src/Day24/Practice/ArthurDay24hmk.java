package Day24.Practice;

import java.util.Arrays;

public class ArthurDay24hmk {
    public static void main(String[] args) {
        int[] array = {1,6,12,15,22,18,30,16};

        System.out.println("updateRange(array, 12,20) = " + Arrays.toString(updateRange(array, 12,20)));


    }

    static int[] updateRange(int[] arr, int lb, int ub){
        int[] copyArr = Arrays.copyOf(arr,arr.length);
        Arrays.sort(copyArr);
        if (lb<copyArr[0] || ub>copyArr[copyArr.length-1]){
            return arr;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<ub && arr[i]>lb) {
                arr[i]=-1;
            }
        }
        return arr;

    }

}
