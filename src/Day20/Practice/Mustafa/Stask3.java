package Day20.Practice.Mustafa;

import java.util.Arrays;
import java.util.Random;

public class Stask3 {
    public static void main(String[] args) {
 /*Task3:
        1. Create two int arrays. Name them as arrOuter and arrInner.
        1.a arrOuter is length of 4.
        1.b arrInner is length of 2.
        2. Using Random class, generate random numbers between 0 and 10
        and fill all indexes of both arrays.

        3. Print true if they have the same first element, or they have the same last element.
        Samples:
        [1, 2, 4, 6], [2, 6] → true
                [1, 2, 4, 6], [2, 3, 4] → false
                [1, 2, 4, 4, 6], [1, 4] → true*/

        int[] arrOuter = new int[4];
        int[] arrInner = new int[2];

        Random ran = new Random();
        for (int i = 0; i < arrOuter.length; i++) {
            arrOuter[i] = ran.nextInt(10);

        }
        System.out.println("ArrOuter = " + Arrays.toString(arrOuter));

        for (int i = 0; i < arrInner.length; i++) {
            arrInner[i] = ran.nextInt(10);

        }
        System.out.println("arrInner = " + Arrays.toString(arrInner));

        boolean check = arrOuter[0] == arrInner[0] || arrOuter[arrOuter.length-1] == arrInner[arrInner.length-1]?true:false;

        System.out.println(check);
    }
}
