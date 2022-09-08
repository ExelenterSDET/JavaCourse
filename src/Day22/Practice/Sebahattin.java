package Day22.Practice;

import java.util.Arrays;

public class Sebahattin {
    public static void main(String[] args) {
        int arr[]={4,13,9,55,1,-7};
        String []fruit = {"Pear", "Cherry", "Avocado", "Grape", "Strawberry"};
        System.out.println("Array --> "+ Arrays.toString(arr));
        System.out.println("Array (String) --> "+ Arrays.toString(fruit));
        getMaxNum(arr);
        Sebahattin hw = new Sebahattin();
        hw.getMinNum(arr);
        getTotal(arr);
        hw.reversedArray(fruit);
    }
    static void getMaxNum(int[]max){
        Arrays.sort(max);
        System.out.println("max number --> "+max[max.length-1]);
    }
    void getMinNum(int[] min) {
        int num = min[0];

        for (int i = 0; i < min.length; i++) {
            if (min[i] < num) {
                num = min[i];
            }
        }
        System.out.println("min number --> " + num);
    }
    static void getTotal(int[] totalArr){
        int total =0;
        for(int j : totalArr){
            total += j;
        }
        System.out.println("total --> "+total);
    }
    static void reversedArray(String []reverse) {
        for(int i=0; i<reverse.length/2; i++) {
            String rev = reverse[i];
            reverse[i] = reverse[reverse.length-i-1];
            reverse[reverse.length-i-1] = rev;
        }
        System.out.println(Arrays.toString(reverse));
    }
}
