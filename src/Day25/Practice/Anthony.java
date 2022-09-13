package Day25.Practice;

import java.util.Arrays;

public class Anthony {

    public static void main(String[] args) {
        System.out.println("======================== TASK 1 ============================");
        int[][] dArr = new int[3][3];
//        dArr[0][0] = 1;
//        dArr[0][1] = 2;

        dArr[0] = new int[]{1}; //{0,0,0}
        dArr[1][0] = 2;
        dArr[1][1] = 4;
        dArr[2][0] = 3;
        dArr[2][1] = 6;

        System.out.println(Arrays.deepToString(dArr));

        System.out.println("======================== TASK 2 ============================");

        int[][] dArr2 = new int[][]{{1, 2, 3, 7}, {2, 4, 6, 8}, {10, 12, 14, 16}};
        System.out.println(Arrays.deepToString(dArr2));

        System.out.println("======================== TASK 3 ============================");
        int[][] dArr3 = new int[3][3];

        for (int row = 0; row < dArr3.length; row++) {
            for (int column = 0; column < dArr3[row].length; column++) {
                dArr3[row][column] = row;
            }
        }
        System.out.println(Arrays.deepToString(dArr3));

        System.out.println("======================== TASK 4 ============================");

        int[][] dArr4;
        dArr4 = new int[3][]; // column length is optional.

        int[] a = {1, 3, 5, 7, 9}; // length => 5
        int[] b = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26}; // 13
        int[] c = {0, 5, 10, 15, 20, 25, 30, 35}; // 8
        dArr4[0] = a;
        dArr4[1] = b;
        dArr4[2] = c;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.deepToString(dArr4));

        System.out.println("======================== TASK 5 ============================");
        int[][] dArr5 = {{1, 3, 5, 7, 9}, {2, 4, 6, 8, 10}, {0, 5, 10, 15, 20, 25}};
        System.out.println(dArr5[1][2]);
        System.out.println(dArr5[0][4]);
        System.out.println(dArr5[2][3]);
        System.out.println(dArr5[1][0]);
        System.out.println(dArr5[0][3]);

        System.out.println("====================== OCA2 =========================");

        float var1 = (12_345.01 <= 123_45.00) ? 12_456 : 124_56.02f;
        float var2 = var1 + 1024;
        System.out.print(var2);

        System.out.println("\n"+"====================== OCA3 =========================");

        String[][] chs = new String[2][];
        chs[0] = new String[2];
        chs[1] = new String[5];
        int i = 97;
        for (int a3 = 0; a3 < chs.length; a3++) {
            for (int b3 = 0; b3 < chs.length; b3++) {
                chs[a3][b3] = "" + i;
                i++;
            }
        }
        for (String[] ca : chs) {
            for (String c3 : ca) {
                System.out.print(c3 + " ,");
            }
        }
        System.out.println();


        System.out.println("====================== OCA5 =========================");

        int wd = 0;
        String days[] = {"sun", "mon", "wed", "sat"};
        for (String s : days) {
            switch (s) {
                case "sat":
                case "sun":
                    wd -= 1;
                    break;
                case "mon":
                    wd -= 1;
                    break;
                case "wed":
                    wd += 2;
            }
        }
        System.out.println(wd);

        System.out.println("====================== OCA7 =========================");

        byte x = 1;
        switch (x) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        }
        System.out.println("====================== OCA8 =========================");
        int wd8 = 0;
        String days8[] = {"sun", "mon", "wed", "sat"};
        for (String s : days8) {
            switch (s) {
                case "sat":
                case "sun":
                    wd8 -= 1;
                    break;
                case "mon":
                    wd8++;
                case "wed":
                    wd8 += 2;
            }
            System.out.println(wd8);
        }
    }
}


