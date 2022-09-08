package Day22.Java;

import java.util.Arrays;

public class OCA1 {
    public static void main(String[] args) {
        int num [][] = new int[1][3];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = 10;
            }
        }
        System.out.println(Arrays.deepToString(num));
    }
}
