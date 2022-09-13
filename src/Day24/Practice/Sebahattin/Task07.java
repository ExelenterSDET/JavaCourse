package Day24.Practice.Sebahattin;

public class Task07 {
    public static void main(String[] args) {
/*      Task 7
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
        int []arr = {4, 7, 10, 12};
        int [][]array= new int[][] {{1, 3, 7, 9}, {11, 3, 5, 8},{2, 2, 5, 1},{4, 12, 9, 8}};

        System.out.println("----> "+threeEvenOrOdd(arr));
        System.out.println(qtyOfThreeEvenOrOdd(array));
    }
    static boolean threeEvenOrOdd (int[] arr){
        int counterEven = 0;
        int counterOdd = 0;
        boolean bol = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0){
                counterEven++;
            } else if (arr[i]%2 == 1) {
                counterOdd++;
            }
        }
        if (counterEven == 3 || counterOdd ==3){
            bol = true;
        }
        return bol;
    }
    static int qtyOfThreeEvenOrOdd (int[][] array){
        int cntr = 0;
        for (int[] i : array) {
            boolean one = threeEvenOrOdd(i);
            if (one){
                cntr++;
            }
        }
        return cntr;
    }
}
