package Day58.Practice.Dilnoza;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int []numbers= {1, 5, 3, 6, 4 ,7, 8,15,25,35};
        int i = kthLargest(numbers, 2);
        System.out.println("i = " + i);
        int []numbers1= {1, 5, 3, 6, 4 ,7, 8};
        Arrays.sort(numbers1);
        System.out.println("numbers1 = " + Integer.parseInt(String.valueOf(numbers1.length-1)));



    }
    public static int kthLargest(int[] arr, int k){
        int temp;
        int kLargets=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            kLargets=arr[arr.length-k];
        }
        System.out.println(kLargets);
        return kLargets;
    }
}
