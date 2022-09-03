package Day20.Java;

import java.util.Arrays;

public class JavaArraysClass5 {
    public static void main(String[] args) {

        int num[] = {1,3,5,7,9 };

        // use binarySearch only if array is sorted and has no duplicates
        int i = Arrays.binarySearch(num, 50);
        System.out.println("i = " + i);


    }
}
