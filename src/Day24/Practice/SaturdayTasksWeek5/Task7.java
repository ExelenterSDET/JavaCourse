package Day24.Practice.SaturdayTasksWeek5;

public class Task7 {

    //    Part 1.
//
//    Create a method named as threeEvenOrOdd
//    It takes an int array as parameter
//    It returns a boolean
//    It returns true if the array contains EITHER three even OR three odd values.
//    It returns false otherwise.
//            Sample:
//            [2, 3, 10, 8] -> true
//            [5, 11, 27] -> true
//            [1, 2, 3, 4] -> false
//            [5, 10] -> false
//
//    Part 2.
//
//    Create a method named as qtyOfThreeEvenOrOdd.
//    It takes an int double array as parameter
//    It returns an int
//    Return count of arrays which contains EITHER three even OR three odd values.
//            Sample:
//            [[2, 3, 10, 8], [1, 3, 5, 8],[2, 2, 5, 1],[4, 12, 9, 8]] -> should return 3, since there three arrays, which have three odd or even values.
    public static void main(String[] args) {

        int[] array = {3, 6, 3, 8, 12};
        System.out.println(threeEvenOrOdd(array));
        int[][] arr2D = {{2, 3, 10, 8},{1, 3, 5, 8},{2, 2, 5, 1},{4, 12, 9, 8}};
        System.out.println(qtyOfThreeEvenOrOdd(arr2D));
    }
    static boolean threeEvenOrOdd(int[] arr) {
        int evenCounter = 0;
        int oddCounter = 0;
        boolean result = false;
        for (int j : arr) {
            if (j % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }
        if (evenCounter == 3 || oddCounter == 3) {
            result = true;
        }
        return result;
    }
    static int qtyOfThreeEvenOrOdd(int[][] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
             if(threeEvenOrOdd(array[i])){
                 result++;
             }
        }
        return result;
    }
}