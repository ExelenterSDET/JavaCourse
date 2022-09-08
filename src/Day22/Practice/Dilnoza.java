package Day22.Practice;

import java.util.Arrays;

public class Dilnoza {
// 1. Create a method which will take as a parameter int[] and print maximum number in the given array (name of the method - getMaxNum)
// 2. Create a method which will take as a parameter int[] and print minimum number in the given array (name of the method - getMinNum)
// 3. Create a method which will take as a parameter int[] and print total of all numbers in the array (name of the method - getTotal)
// 4. Create a method which will take as a parameter String[] and print all Strings in the reversed order (name of the method - reversedArray)

        public static void main(String[] args) {

            int[] array = {10, 15, 8, 55, 12, 102, 99, 2, 15};
            System.out.println("=======================");
            int max = getMaxNum(array);
            System.out.println("max = " + max);
            System.out.println("=======================");
            int min = getMinNum(array);
            System.out.println("min = " + min);

            System.out.println("=======================");
            System.out.println("Total = " + getTotal(array));

            System.out.println("=======================");
            System.out.println("Array= "+ Arrays.toString(array));
            Dilnoza dilnoza= new Dilnoza();// non static example
            dilnoza.reverse(array);

        }

        static int getMaxNum(int[] numArray) {
            int maxValue = numArray[0];

            for (int i = 0; i < numArray.length; i++) {
                if (maxValue < numArray[i]) {
                    maxValue = numArray[i];
                }

            }
            return maxValue;
        }

        static int getMinNum(int[] numArray) {

            int minValue = numArray[0];

            for (int i = 1; i < numArray.length; i++) {

                if (minValue > numArray[i]) {
                    minValue = numArray[i];
                }

            }
            return minValue;
        }

        static int getTotal(int[] arr1) {

            int total = 0;
            for (int i = 0; i < arr1.length; i++) {

                if(arr1[i]>0){
                    total+= arr1[i];
                }
            }
            return total;
        }
        void reverse( int [] reverse){

            for (int i = reverse.length - 1; i >= 0; i--) {
                System.out.print(reverse[i]+", ");

            }
        }

    }



