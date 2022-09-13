package Day24.Practice.Tohir_Week5;

import java.util.Arrays;

public class Assignment_8 {
    public static void main(String[] args) {
        Assignment_8 as = new Assignment_8();
        int[] num = {1, 33, 5, 6, 3, 8, 9};
        System.out.println("as.updateRange({1,33,5,6,3,8,9},3,7) = " +Arrays.toString(as.updateRange(num, 3, 7)));
    }

    int[] updateRange(int[] a, int b, int c) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b && a[i] < c) {
                a[i] = -1;
            }
        }
        return a;

    }
}
//Task 8
//
//Create a method whose name is updateRange
//   As parameters it takes an int array, and two int values (in order)
//       The first parameter is an int array,
//       the second parameter is an int (lower bound),
//       and the third parameter is an int (upper bound)
//       Upper bound is always given as bigger than or equal to lower bound.
//   It returns an int array
//   The method changes all elements in the int array which are between  (exclusively) the lower bound and the upper bound to -1.
//   It keeps the elements in the array if the elements is equal to or out of the range of the lower and upper boundaries.
//   Sample:
//   int array = [1,6,12,15,22,18,30,16]
//   lower bound = 12
//   upper bound = 20
//   it returns [1,6,12,-1,22,-1,30,-1]
