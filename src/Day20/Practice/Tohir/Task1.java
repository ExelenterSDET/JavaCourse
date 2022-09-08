package Day20.Practice.Tohir;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;


public class Task1 {
    public static void main(String[] args) {
        //Task1:
        //         1. Create two int arrays. Name them as arrOuter and arrInner.
        //            1.a arrOuter is length of 4.
        //            1.b arrInner is length of 2.
        //
        //        2. Using Random class, generate random numbers between 0 and 10
        //        and fill all indexes of both arrays.
        //
        //        3. Sort both of arrays.
        //
        //        4. Print true if all the numbers in the inner array also appear in the outer array.
        //        Otherwise, print false
        //        (In other words, print true if first array contains second array.)
        //        Samples:
        //        [1, 2, 4, 6], [2, 4] → true
        //        [1, 2, 4, 6], [2, 3] → false
        //        [1, 2, 4, 4], [2, 4] → true

        int arrOuter[] = new int[4];
        int arrInner[] = new int[2];
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arrOuter.length; i++) {
            arrOuter[i] = ran.nextInt(0,10);
        }
        for (int i = 0; i < arrInner.length; i++) {
            arrInner[i] = ran.nextInt(0,10);
        }
        Arrays.sort(arrInner);
        Arrays.sort(arrOuter);
        int stat = 0;
        System.out.println("arrInner = " + Arrays.toString(arrInner));
        System.out.println("arrOuter = " + Arrays.toString(arrOuter));
        OuterLoop:
        for (int i = 0; i < arrInner.length; i++) {
            InnerLoop:
            for (int i1 = 0; i1 < arrOuter.length; i1++) {
                if (arrInner[i] == arrOuter[i1]) {
                    stat++;
                    continue OuterLoop;
                }
            }
        }
        System.out.println(stat==2?"true":"false");
    }

}
