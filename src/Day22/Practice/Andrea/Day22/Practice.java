package Day22.Practice.Andrea.Day22;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int num [][] = new int[1][3];
        for (int i = 0; i < num.length ; i++) {
            for (int j = 0; j <num[i].length ; j++) {
                num[i][j] = 10;
            }
        }
        System.out.println(Arrays.deepToString(num));
        Practice p1 = new Practice();
        String str = "Happy";
        p1.print(str);
    }
        //methods
        void print(String s){
        s = s.concat(" World");
            System.out.println("s = " + s);

        }

        static void print2(String s){
            s = s.concat(" World");
            System.out.println("s = " + s);

        }



}
