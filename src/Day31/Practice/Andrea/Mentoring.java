package Day31.Practice.Andrea;

import java.util.ArrayList;
import java.util.Arrays;

public class Mentoring {

    //Task 6 from Saturday Project

    static void countOfIntegersInList(ArrayList<Integer> list){

        while (list.size() >= 1) {

            ArrayList<Integer> copy = new ArrayList<>(list);
            int value = list.get(0);
            int counter;
            list.removeIf(n -> n == value);
            counter = copy.size() - list.size();
            System.out.print(value + " = " + counter + "; ");
        }
        System.out.println();
    }

    static void countOfIntegersInList2(ArrayList<Integer> list){
        int[] arr = new int[list.size()];

        for (Integer integer : list) {
            arr[integer] += 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.print(i + " = " + arr[i] + "; ");
            }

        }
    }


        public static void main(String[] args) {
        ArrayList<Integer> iList = new ArrayList<>(Arrays.asList(1,3,5,4,2,3,1,2,4,6,2,5,1));
     //   countOfIntegersInList(iList);
        System.out.println("=======================================");
        countOfIntegersInList2(iList);

        }
}
