package Day26.Practice._09_14_2022_Mentoring_SP5;

public class Task7 {
        /*
    Task 7

Part 1.

Create a method named as threeEvenOrOdd
   It takes an int array as parameter
   It returns a boolean
   It returns true if the array contains EITHER three even OR three odd values.
   It returns false otherwise.
   Sample:
   [2, 3, 10, 8] -> true
   [5, 11, 27] -> true
   [1, 2, 3, 4] -> false
   [5, 10] -> false

Part 2.

Create a method named as qtyOfThreeEvenOrOdd.
   It takes an int double array as parameter
   It returns an int
   Return count of arrays which contains EITHER three even OR three odd values.
   Sample:
   [[2, 3, 10, 8], [1, 3, 5, 8],[2, 2, 5, 1],[4, 12, 9, 8]] -> should return 3, since there three arrays, which have three odd or even values.
    */

    boolean threeEvenOrOdd (int [] arr){
        int evenCounter = 0;
        int oddCounter = 0;

        for (int value : arr) {
//            evenCounter += value % 2 == 0 ? 1 : 0;
//            oddCounter += value % 2 != 0 ? 1 : 0;

            // 2. way
            if (value % 2 == 0){
                evenCounter++;
            }else {
                oddCounter++;
            }
        }

        return evenCounter == 3 || oddCounter == 3;
    }

    int qtyOfThreeEvenOrOdd(int [][] int2Darr){
        int counter = 0;
        for (int[] ints : int2Darr) {
            counter += threeEvenOrOdd(ints) ? 1 : 0;
        }
        return counter;
    }
}
