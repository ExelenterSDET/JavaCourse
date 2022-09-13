package Day25.Java;

import java.util.Arrays;

public class OCAQ71 {
    public static void main(String[] args) {

        int[][] arr = new int [2][4];

        arr[0] =  new int[] {1,3,5,7};
        arr[1] = new int[] {1,3};

        for (int[] a : arr) { //arr[row] == a
            for (int i = 0; i < arr.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

        System.out.println("======================");
        for (int[] a : arr) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("===================");

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }




    }
}
