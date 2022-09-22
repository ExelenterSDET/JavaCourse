package Day24.Practice.Ibrahim_HM;

public class Task7 {
    /*
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
     */

    static boolean threeEvenOrOdd (int[] iArr){

        int numberOfOdd = 0, numberOfEven = 0;
        boolean b = false;
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] %2 == 0){
                numberOfEven++;
            }else{
                numberOfOdd++;
            }
        }
        if(numberOfOdd >= 3 || numberOfEven >= 3){
            b = true;
        }
        return b;
    }

    public static void main(String[] args) {
     int[] a = {1, 2, 3, 4, 5};
        System.out.println("threeEvenOrOdd(a) = " + threeEvenOrOdd(a));
     int[][] b = {{2, 3, 10, 8},{1, 3, 5, 8},{2, 2, 5, 1},{4, 12, 9, 8}};
        System.out.println("qtyOfThreeEvenOrOdd(b) = " + qtyOfThreeEvenOrOdd(b));
        
    }

     /*
    Part 2.

       Create a method named as qtyOfThreeEvenOrOdd.
       It takes an int double array as parameter
       It returns an int
       Return count of arrays which contains EITHER three even OR three odd values.
       Sample:
       [[2, 3, 10, 8], [1, 3, 5, 8],[2, 2, 5, 1],[4, 12, 9, 8]] -> should return 3, since there three arrays, which have three odd or even values.
     */
    
    static int qtyOfThreeEvenOrOdd(int [][] iArr){
        int counter = 0;
        for (int i = 0; i < iArr.length; i++) {
            if(threeEvenOrOdd(iArr[i])){
                counter++;
            }
        }
        return counter;
    }
}
