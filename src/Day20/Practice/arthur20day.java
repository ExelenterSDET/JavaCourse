package Day20.Practice;

import java.util.Arrays;
import java.util.Random;

public class arthur20day {
    public static void main(String[] args) {


//        Task1:
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

        Random rand = new Random();
        int arrOuter[] = new int[4];
        int arrInner[] = new int[2];

        for (int i = 0; i < 4 ; i++) {
            arrOuter[i] = rand.nextInt(10);
        }

        for (int i = 0; i < 2 ; i++) {
            arrInner[i] = rand.nextInt(10);
        }

        Arrays.sort(arrOuter);
        Arrays.sort(arrInner);

        int j = Arrays.binarySearch(arrOuter, arrInner[0]);
        int k = Arrays.binarySearch(arrOuter, arrInner[1]);

        if ((j>0)&&(k>0)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("Arrays.toString(arrOuter) = " + Arrays.toString(arrOuter));
        System.out.println("Arrays.toString(arrInner) = " + Arrays.toString(arrInner));

        System.out.println("task2");
//        Task2:
//        Given a string as "Peach Berry Orange WaterMelon Orange"
//        1. Convert this string to String[]. Example: [Peach, Berry, Orange, WaterMelon, Orange]
//        2. Write below logic:
//            2.a If this string array contains "Orange" change all "Orange" to "Apple"
//        3. Print the Array
//        Example: Given [Peach, Berry, Orange, WaterMelon, Orange] -> prints [Peach, Berry, Apple, WaterMelon, Apple]
        String str = "Peach Berry Orange WaterMelon Orange";
        String splt[] = new String[5];
        splt = str.split(" ");
        System.out.println(Arrays.toString(splt));



        for (int i = 0; i <=splt.length - 1 ; i++) {
            System.out.println(splt[i]);
            if (splt[i].contains("Orange")){
                splt[i] = "Apple";
                System.out.println("splt = " + splt[i]);
            }

        }

        System.out.println(Arrays.toString(splt));

        System.out.println("task4");

        int firstlast[] = new int[10];

        for (int i = 0; i < 10; i++) {
            firstlast[i] = rand.nextInt(20);

        }

        Arrays.sort(firstlast);
        System.out.println("Arrays.toString(firstlast = " + Arrays.toString(firstlast));
        System.out.println("difference: " + (firstlast[firstlast.length-1]-firstlast[0]));


    }
}
