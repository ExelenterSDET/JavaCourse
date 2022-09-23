package Day31.Practice.Dilnoza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {

/*
   Create a method with parameter list of list of Integer.
   Print max int
    */
            ArrayList<ArrayList<Integer>> numList = new ArrayList<>();

            numList.add(new ArrayList<>(Arrays.asList(1, 5, 15, 26, 18, 35, 55)));
            numList.add(new ArrayList<>(Arrays.asList(13, 5, 45, 21, 17, 33, 56)));
            numList.add(new ArrayList<>(Arrays.asList(2, 3, 19, 22, 38, 85, 95)));
            int max = getMax(numList);
            System.out.println("max = " + max);
        }
        static int getMax (ArrayList < ArrayList < Integer >> numbers) {
            int max = Integer.MIN_VALUE;

            for (ArrayList<Integer> number : numbers) {
                max = max > Collections.max(number) ? max : Collections.max(number);

            }
            return max;
        }
    }
