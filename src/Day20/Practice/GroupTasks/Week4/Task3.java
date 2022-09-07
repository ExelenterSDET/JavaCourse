package Day20.Practice.GroupTasks.Week4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {

    public static void main(String[] args) {

        /*
       Task3:
        1. Create two int arrays. Name them as arrOuter and arrInner.
            1.a arrOuter is length of 4.
            1.b arrInner is length of 2.
        2. Using Random class, generate random numbers between 0 and 10
        and fill all indexes of both arrays.

       3. Print true if they have the same first element, or they have the same last element.
        Samples:
        [1, 2, 4, 6], [2, 6] → true
        [1, 2, 4, 6], [2, 3, 4] → false
        [1, 2, 4, 4, 6], [1, 4] → true
         */
        /*
        Random randomNum = new Random();

        int arrOuter = randomNum.nextInt(0,4);
        int arrInner = randomNum.nextInt(0,2);
        int[] numArray1 = new int[arrOuter];
        int[] numArray2 = new int[arrInner];

        OuterLoop:
        for (int i = 0; i <numArray1.length ; i++) {
            numArray1[i] = randomNum.nextInt(0,4);
            InnerLoop:
            for (int j = 0; j < numArray2.length; j++) {
                numArray2[j] = randomNum.nextInt(0,2);
                }
            }
        System.out.print("numArray1 = " +Arrays.toString(numArray1));
        System.out.print("numArray2 = " +Arrays.toString(numArray2));
        System.out.print(numArray1[0]==numArray2[0] && numArray1[numArray1.length-1]==numArray2[numArray2.length-1]);

         */
        /*
        Random rnd=new Random();
        int[] arrOuter=new int[4];
        int[] arrInner=new int[2];

        boolean result=false;

        for (int i = 0; i < arrOuter.length; i++) {
            arrOuter[i]=rnd.nextInt(5);

            for (int i1 = 0; i1 < arrInner.length; i1++) {
                arrInner[i1]=rnd.nextInt(3);

                if (arrOuter[0]==arrInner[0]){
                    result=true;

                } else if (arrOuter[arrOuter.length-1]==arrInner[arrInner.length-1]) {
                    result=true;
                }

            }

        }
        System.out.println(Arrays.toString(arrOuter));
        System.out.println(Arrays.toString(arrInner));
        System.out.println("result = " + result);

         */
        int []arrOuter = new int [4];
        int []arrInner = new int [2];
        Random random = new Random();
        boolean isTrue= true;
        for (int i = 0; i <arrOuter.length ; i++) {
            arrOuter[i] =random.nextInt(0,10);

            for (int j = 0; j <arrInner.length ; j++) {
                arrInner[j] =random.nextInt(0,10);
                if(arrOuter[0]==arrInner[0] || arrOuter[arrOuter.length-1]==arrInner[arrInner.length-1]){
                    isTrue=true;
                }else{
                    isTrue=false;
                }
            }
        }      System.out.println("arrInner = " + Arrays.toString(arrOuter));
        System.out.println("arrOuter = " + Arrays.toString(arrInner));
        System.out.println("isTrue = " + isTrue);


    }
}