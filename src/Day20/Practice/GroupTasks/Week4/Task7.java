package Day20.Practice.GroupTasks.Week4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
/*
        1. Create an array with random length between 5 and 15.
        2. Generate random numbers between 0 and 3 and insert into an array.
        3. Print true if the first element and the last element are equal.
                Print false otherwise
        Example:
            [1, 2, 3] → false
                [1, 2, 3, 1] → true
                [1, 2, 1] → true
                [1] → true

 */
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);

        int length = ran.nextInt(2,15);
        int numArr [] = new int[length];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = ran.nextInt(0,4);
        }
        System.out.println("numArr = " + Arrays.toString(numArr));
        System.out.println(numArr[0]==numArr[numArr.length-1]?"TRUE":"FALSE");

    }
}
