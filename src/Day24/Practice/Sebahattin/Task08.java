package Day24.Practice.Sebahattin;

import java.util.Arrays;

public class Task08 {
    /*      Create a method whose name is updateRange
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
    public static void main(String[] args) {
        int[] arr = {1,6,12,15,22,18,30,16};
        int low = 12;
        int up = 20;
        System.out.println(Arrays.toString(updateRange(arr,low,up)));
    }
    static int[] updateRange (int[] arr, int low, int up){
        int []newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (low>up){
                System.out.println("Upper bound is always given as bigger than or equal to lower bound!!!");
                break;
            }
            if (arr[i] <= low || up <= arr[i]) {
                newArr[i] = arr[i];
            } else if (arr[i] > low && up > arr[i]) {
                newArr[i] = -1;
            }
        }
        return newArr;
    }
}
