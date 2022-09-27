package Day29.Practice.Ibrahim.Saturday;

import java.util.Arrays;

/*
Task 9

           Create a method that has an int[] as parameter.
           Every element in the array appears twice except for one.
           Find that single one and return.

            Example s:
            Input: nums = [2,2,1]
            Output: 1

            Input: nums = [4,1,2,1,2]
            Output: 4

            Input: nums = [1]
            Output: 1
 */
public class Task9 {

    static int findSingle(int[] a){
        int result = 0;
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            result = a[i];
            for (int i1 = 1; i1 < a.length; i1++) {
                if (a.equals(result)){
                    System.out.println("i1 = " + i1);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {4,4,1,2,5,1,2,5,6,6,3,3,1,1,7};
        System.out.println(Arrays.toString(a));
        System.out.println("Number which is not duplicated : " + findSingle(a));
    }
}
