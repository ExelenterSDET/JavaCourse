package Day21.Practice.Tohir;

import java.util.Arrays;
import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {

        int [][] num = new int[4][5];
        Random ram = new Random();
        System.out.println("num.length = " + num.length);
        for (int i = 0; i < num.length; i++) {
            for (int i1 = 0; i1 < num[i].length; i1++) {
                num[i][i1] = ram.nextInt(0,11);
            }
        }
        System.out.println("Arrays.deepToString(num) = " + Arrays.deepToString(num));
        int[] sum = new int[num.length];
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j <num[i].length;j++) {
                sum[i] +=num[i][j];
            }
        }
        System.out.println("Sum = " + Arrays.toString(sum));
    }
}
