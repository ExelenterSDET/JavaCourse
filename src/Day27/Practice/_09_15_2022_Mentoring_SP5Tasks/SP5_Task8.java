package Day27.Practice._09_15_2022_Mentoring_SP5Tasks;

import java.util.Arrays;

public class SP5_Task8 {

        /*Task 8

Create a method whose name is updateRange
   As parameters it takes an int array, and two int values (in order)
       The first parameter is an int array,
       the second parameter is an int (lower bound),
       and the third parameter is an int (upper bound)
       Upper bound is always given as bigger than or equal to lower bound.
   It returns an int array
   The method changes all elements in the int array which are between  (exclusively) the lower bound and the upper bound to -1.
   It keeps the elements in the array if the elements is equal to or out of the range of the lower and upper boundaries.
   Sample:
   int array = [1,6,12,15,22,18,30,16]
   lower bound = 12
   upper bound = 20
   it returns [1,6,12,-1,22,-1,30,-1]
   */

    static int [] updateRange(int [] arr, int lower_bound, int upper_bound ){

        for (int i = 0; i < arr.length; i++) {
            //1. way
            arr[i] = arr[i] <= lower_bound || arr[i] >= upper_bound ? arr[i] : -1;
            //2. way
//            if (!(arr[i] <= lower_bound || arr[i] >= upper_bound)){
//                arr[i] = -1;
//            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] array = {1, 6, 12, 15, 22, 18, 30, 16};
        int lower_bound = 12;
        int upper_bound = 20;

        System.out.println(Arrays.toString(updateRange(array, lower_bound, upper_bound)));

    }
}
