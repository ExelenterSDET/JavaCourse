package Day26.Practice;

import java.util.Arrays;
// Saturday task4
public class Day26Prac {
    public static void main(String[] args) {

        int arr[][] = new int[5][];

        for (int i = 0; i < 5; i++) {
            arr[i] = new int[i];
            for (int j = 0; j <i; j++) {
                arr[i][j] = i;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
