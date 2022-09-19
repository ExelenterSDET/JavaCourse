package Day29.Practice.Saturday_Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
     /*
          Task 2.

            1. Using Scanner class, and using conditional loop, ask user to provide any int numbers and add to the ArrayList<Integer>.
               When user enters number less than 0, don`t add to the ArrayList and print the result.

               Example: [1, 5, 10, 25, 30]

            2. Ask User to provide two indexes between 0 and the last index of the ArrayList.
               If user provides number between 0 and the last index, switch values in the ArrayList and print the result.
               Example: user provided indexed 1 and 3 => output should be [1, 25, 10, 5, 30] ==> since index 1 was 5, index 3 was 25

               If user provides indexes out of range, switch first and last objects of ArrayList.
               Example: user provided indexed 0 and 10 => output should be [1, 5, 10, 25, 30] ==> since index 10 is out of the index range
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        ArrayList<Integer> intList = new ArrayList<>();
        System.out.print("Enter an integer: ");
        input = scan.nextInt();

        while (input >= 0) {
            intList.add(input);
            System.out.print("Enter an integer: ");
            input = scan.nextInt();
        }
        System.out.println(intList);
        System.out.print("Enter an index within the list: ");
        int index1 = scan.nextInt();
        System.out.print("Enter an index within the list: ");
        int index2 = scan.nextInt();

        if (index1 <= intList.size() - 1 && index1 >= 0 && index2 <= intList.size() - 1 && index2 >= 0) {
            int temp = intList.get(index1);
            intList.set(index1, intList.get(index2));
            intList.set(index2, temp);
        } else {
            int temp = intList.get(0);
            intList.set(0, intList.get(intList.size()-1));
            intList.set(intList.size() - 1, temp);
        }
        System.out.println(intList);
    }

}
