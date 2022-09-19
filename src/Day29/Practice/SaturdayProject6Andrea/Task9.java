package Day29.Practice.SaturdayProject6Andrea;

import java.util.ArrayList;
import java.util.Arrays;

public class Task9 {
//>>>>>NEEDS WORK<<<<<
  /*  Task 9

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

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 1, 2, 1, 2));
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            array[i] = list.get(i);
        System.out.println(findNonDouble(array));
    }

    static int findNonDouble(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(i);
        }
        System.out.println("list = " + list);
        for (int i = list.size()-1; i > 0; i--) {
            if (list.get(i).equals(list.get(i-1))) {
                list.remove(i);
                --i;
                list.remove(i);
            }
        }
        return list.get(0);
    }
}



//        int[] newArr = new int[10];
//        int index = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
//                i++;
//                newArr[index] = arr[i];
//                index++;
//            }
//
//        }
//        for (int i = 0; i < index; i++) {
//            System.out.println(newArr[i]);
//        } return newArr[0];
//    }
//}









