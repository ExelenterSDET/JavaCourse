package Day29.Practice;

import java.util.Arrays;

public class ArtDay29tsk9 {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2,4,6};
        System.out.println("retUnique(arr) = " + retUnique(arr));
    }

    static int retUnique(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] == arr[i + 1]) {
                i = i + 2;
            }

        }
        return arr[i];
    }

}
