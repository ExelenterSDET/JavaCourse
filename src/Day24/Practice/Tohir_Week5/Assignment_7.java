package Day24.Practice.Tohir_Week5;

import java.util.Arrays;

public class Assignment_7 {
    public static void main(String[] args) {
        Assignment_7 asg = new Assignment_7();
        int nu [] = {2,3,4,5,6,7,55};
        System.out.println("asg.threeEvenOrOdd(nu) = " + asg.threeEvenOrOdd(nu));
        int[][] n1 = {{2, 3, 10, 8}, {1, 3, 5, 8},{2, 2, 5, 1},{4, 12, 9, 8}};
       // System.out.println("asg.qtyOfThreeEvenOrOdd(n1) = " + asg.qtyOfThreeEvenOrOdd(n1));
    }
    boolean threeEvenOrOdd(int... a)//part1
    {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0){
                even++;
            }
            else {
                odd++;
            }
        }
        return even==3||odd==3;
    }
/*    int qtyOfThreeEvenOrOdd(int[][]... a)
    {
        String syt = "";

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int i1 = 0; i1 < a[i].length; i1++) {
                syt = syt.concat(a[i][i1]+" ");
                }
            String spl[] = syt.split(" ");
            int [] ni = new int[spl.length];
            for (int i1 = 0; i1 < spl.length; i1++) {
                ni[i1] = Integer.parseInt(spl[i1]);
            }
           if (threeEvenOrOdd(ni)){
                sum++;
                }
            }
        return sum;
        }*/
    }

//Task 7
//
//Part 1.
//
//Create a method named as threeEvenOrOdd
//   It takes an int array as parameter
//   It returns a boolean
//   It returns true if the array contains EITHER three even OR three odd values.
//   It returns false otherwise.
//   Sample:
//   [2, 3, 10, 8] -> true
//   [5, 11, 27] -> true
//   [1, 2, 3, 4] -> false
//   [5, 10] -> false
//
//Part 2.
//
//Create a method named as qtyOfThreeEvenOrOdd.
//   It takes an int double array as parameter
//   It returns an int
//   Return count of arrays which contains EITHER three even OR three odd values.
//   Sample:
//   [[2, 3, 10, 8], [1, 3, 5, 8],[2, 2, 5, 1],[4, 12, 9, 8]] -> should return 3, since there three arrays, which have three odd or even values.