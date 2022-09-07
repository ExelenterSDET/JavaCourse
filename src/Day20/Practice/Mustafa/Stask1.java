package Day20.Practice.Mustafa;

import java.util.Arrays;
import java.util.Random;

public class Stask1 {
    public static void main(String[] args) {
/*
    Task1:
            1. Create two int arrays. Name them as arrOuter and arrInner.
            1.a arrOuter is length of 4.
            1.b arrInner is length of 2.
            2. Using Random class, generate random numbers between 0 and 10
    and fill all indexes of both arrays.
        3. Sort both of arrays.
            4. Print true if all the numbers in the inner array also appear in the outer array.
            Otherwise, print false
            (In other words, print true if first array contains second array.)
    Samples:
            [1, 2, 4, 6], [2, 4] → true
            [1, 2, 4, 6], [2, 3] → false
            [1, 2, 4, 4], [2, 4] → true
 */

        int [] arrOuter = new int[4];
        int [] arrInner = new int[2];

        Random rnd = new Random();

        for (int i = 0; i < arrOuter.length; i++) {
            arrOuter[i] = rnd.nextInt(10);
        }
        for (int i = 0; i < arrInner.length; i++) {
            arrInner[i] = rnd.nextInt(10);
        }


        Arrays.sort(arrOuter);
        Arrays.sort(arrInner);

        System.out.println("arrOuter = " + Arrays.toString(arrOuter));
        System.out.println("arrInner = " + Arrays.toString(arrInner));

        int counter = 0;

        for (int i : arrInner) {
            for (int j : arrOuter) {
                if (j == i){
                    counter++;
                    break;
                }
            }
        }
        boolean hasSubArray = counter == arrInner.length;
        System.out.println("hasSubArray = " + hasSubArray);


    }
}
