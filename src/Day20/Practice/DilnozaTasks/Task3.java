package Day20.Practice.DilnozaTasks;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    /*
 Task3:
           1. Create two int arrays. Name them as arrOuter and arrInner.
           1.a arrOuter is length of 4.
           1.b arrInner is length of 2.
           2. Using Random class, generate random numbers between 0 and 10
   and fill all indexes of both arrays.
       3. Print true if they have the same first element, or they have the same last element.
   Otherwise, print false
   Both arrays will be length 1 or more.
           [1, 2, 3], [7, 3] → true
           [1, 2, 3], [7, 3, 2] → false
           [1, 2, 3], [1, 3] → true
           [1, 2, 3], [1, 7, 5, 2] → true
    */
    public static void main(String[] args) {
        int []arrOuter = new int [4];
        int []arrInner = new int [2];
        Random random = new Random();
        boolean isTrue= true;
        for (int i = 0; i <arrOuter.length ; i++) {
            arrOuter[i] =random.nextInt(0,10);

            for (int j = 0; j <arrInner.length ; j++) {
                arrInner[j] =random.nextInt(0,10);
                if(arrOuter[0]==arrInner[0]|| arrOuter[arrOuter.length-1]==arrInner[arrInner.length-1]){
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
