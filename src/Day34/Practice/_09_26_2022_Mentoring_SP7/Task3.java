package Day34.Practice._09_26_2022_Mentoring_SP7;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
        /*    Task 3

        Create a method, which will return a ArrayList<Integer> and parameter is a ArrayList<Integer>.
        The method should sort the ArrayList.

        Note: Don`t use any of built-in sort methods.

        Example:
        {5,4,2,1,0,3}

        Result: {0,1,2,3,4,5}
        */
    static ArrayList<Integer> sortArrayList(ArrayList<Integer> integerArrayList){
        int leftPointer = 0, rightPointer = 1, temp;

        while (leftPointer < integerArrayList.size() - 1){
            if (rightPointer == integerArrayList.size()){
                leftPointer++;
                rightPointer = leftPointer;
            }
            if (integerArrayList.get(leftPointer) > integerArrayList.get(rightPointer)){
                temp = integerArrayList.get(leftPointer);
                integerArrayList.set(leftPointer, integerArrayList.get(rightPointer));
                integerArrayList.set(rightPointer, temp);
            }
            rightPointer++;
        }
        return integerArrayList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,4,2,1,0,3));
        System.out.println(sortArrayList(list));
    }
}
