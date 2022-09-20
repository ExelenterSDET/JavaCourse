package Day29.Practice.Tohir1;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        Task9 asg = new Task9();
        System.out.println(asg.single(new int[]{2, 2,9,9,4,4, 3, 3, 5, 5, 7,7, 9, 9, 11}));


    }

    int single(int[] num) //old fashion
    {

        int ret = -1;
        num = Arrays.stream(num).sorted().toArray();
        for (int i = 0; i < num.length-1; i++) {
            if (num[i] != num[i + 1]) {
                ret = num[i];
                break;
            }
            i++;
        }
        if (ret==-1) {
            ret = num[num.length - 1];
        }

        return ret;
}
    /*int single_1(int[] num) //new fashion
    {
        ArrayList<Integer> numlist = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            numlist.add(num[i]);
        }
        numlist.sort();
        for (int i = 0; i < numlist.size()-1; i++) {
            if (numlist.get(i)==numlist.get(i+1)){
                numlist.remove(i);
                numlist.remove(i);
                i = i++;

            }

        }*/

    //Task 9
    //
    //           Create a method that has an int[] as parameter.
    //           Every element in the array appears twice except for one.
    //           Find that single one and return.
    //
    //            Example s:
    //            Input: nums = [2,2,1]
    //            Output: 1
    //
    //            Input: nums = [4,1,2,1,2]
    //            Output: 4
    //
    //            Input: nums = [1]
    //            Output: 1
}
