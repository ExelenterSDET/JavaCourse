package Day20.Practice.DilnozaTasks;

import java.util.Arrays;
import java.util.Random;

public class Task4 {

        /*
        Task4:
                1. Create one int array with length of 10.
                2. Using Random class, generate random numbers between 0 and 20
                 and fill all indexes of an array.
                3. Print the difference between the largest and smallest values in the array. (largest - smallest = difference)
                [10, 3, 5, 6, 8, 7, 5, 6, 8, 7] → 7 (observe 10-3 = 7)
       */
        public static void main(String[] args) {
            int numArr [] = new int [10];
            Random random = new Random();
            int maxValue = Integer.MIN_VALUE;
            int minValue = Integer.MAX_VALUE;

            for (int i = 0; i <numArr.length ; i++) {
                numArr[i]=random.nextInt(0,20);

                if(numArr[i]> maxValue){
                    maxValue = numArr[i];
                }
                if (numArr[i] < minValue){
                    minValue = numArr[i];
                }
            }

            System.out.println(maxValue);
            System.out.println(minValue);

            System.out.println("numArr = " + Arrays.toString(numArr));
            System.out.println(maxValue-minValue);



        }


    }


