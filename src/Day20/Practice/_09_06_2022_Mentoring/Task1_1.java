package Day20.Practice._09_06_2022_Mentoring;

import java.util.Arrays;

public class Task1_1 {
    public static void main(String[] args) {

        int [] arrOuter = {8, 5,8,7 };//new int[4];
        int [] arrInner = {8,6};//new int[2];
        int counter = 0;
        boolean contains = false;
//
//        for (int i = 0; i < arrOuter.length; i++) {
//            arrOuter[i] = (int) (Math.random() * 10);
//        }
//        for (int i = 0; i < arrInner.length; i++) {
//            arrInner[i] = (int) (Math.random() * 10);
//        }
        Arrays.sort(arrInner);
        Arrays.sort(arrOuter);

        System.out.println(Arrays.toString(arrOuter));
        System.out.println(Arrays.toString(arrInner));

        for (int i : arrOuter) {
            for (int j : arrInner) {
                if (i == j) {
                    System.out.println("match = " + i + " is the same as " + j);
                    counter += 1;
                    if (counter == 2 && arrInner[0] != arrInner[1] ) {
                        contains = true;
                    }
                }
            }
        }
        System.out.println("contains = " + contains);
    }
}
