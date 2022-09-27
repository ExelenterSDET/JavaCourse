package Day34.Practice.Tohir_Week_8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        Task_3 asg = new Task_3();
        ArrayList<Integer> numlist = new ArrayList<>(Arrays.asList(5,1,3,2,6,7,4,3));
        System.out.println((asg.returnmax(numlist)));
        System.out.println(asg.sortofdigits(numlist));

    }
    ArrayList<Integer> sortofdigits(ArrayList<Integer> numArr) {
        ArrayList<Integer> sorted = new ArrayList<>();
        int max = 0;
        for (int inum = 0; inum < numArr.size(); inum++) {
            sorted.add(returnmax(numArr).get(0));
            numArr.remove(returnmax(numArr).get(1).intValue());
            inum--;
        }
        return sorted;
    }
    ArrayList<Integer> returnmax(ArrayList<Integer> numArr)
    {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int inum = 0; inum < numArr.size(); inum++) {
            if (min>numArr.get(inum))
            {
                min = numArr.get(inum);
                index = inum;
            }
        }
        ArrayList<Integer> maxlist = new ArrayList(Arrays.asList(min,index));
        return maxlist;
    }

    /*
        Task 3

        Create a method, which will return a ArrayList<Integer> and parameter is a ArrayList<Integer>.
        The method should sort the ArrayList.

        Note: Don`t use any of built-in sort methods.

        Example:
        {5,4,2,1,0,3}

        Result: {0,1,2,3,4,5}
     */
}
