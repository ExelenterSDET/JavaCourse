package Day34.Practice.Tohir_Week_8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        Task_1 asg = new Task_1();
        int [] numArr = new int[15];
        numArr = asg.randomInt(15);
        System.out.println("numArr = " +Arrays.toString(numArr));
       System.out.println(asg.randomMap(numArr));
    }
    int[] randomInt(int numb)
    {
        Random ram = new Random();
        int [] numArr = new int[numb];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = ram.nextInt(10,20);
        }
        return numArr;
    }
    HashMap<Integer,Integer> randomMap(int[] numArr)
    {
        HashMap<Integer,Integer> hashArr = new HashMap<>();
        for (int i = 0; i < numArr.length; i++) {

            hashArr.computeIfAbsent(numArr[i],k->0);
            hashArr.computeIfPresent(numArr[i],(key,value)->value+=1);

        }
        return hashArr;
    }
}
/*   Task 1

        1. Create a method which will return int[]. Parameter is int (n).
           The length of array is n.
           Using Random class, assign to each index of array a random number between 10 and 20.

        2. Create a method which will return a HashMap.
           Parameter will be int[].

           Return how many times each int of array repeats.

           Example:
           [10,11,12,13,10,11,12,13]

           Result:
           10 = 2; 11=2, 12=2, 13=2*/