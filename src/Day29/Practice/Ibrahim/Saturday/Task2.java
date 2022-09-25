package Day29.Practice.Ibrahim.Saturday;

import java.lang.reflect.Array;
import java.util.*;

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
public class Task2 {

    // 1.


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();

        int input;
        do {
            System.out.print("Please enter a number : ");
            input = scan.nextInt();
            if (input == 0) {
                System.out.println(list1);
                    System.out.print("Please enter 1st index : ");
                    int index1 = scan.nextInt();
                    System.out.print("Please enter 2nd index : ");
                    int index2 = scan.nextInt();

                    if(0 <= index1 && index1 <= list1.size()-1 && 0 <= index2 && index2 <= list1.size()-1){
                        Collections.swap(list1, index1, index2);
                    }else{
                        Collections.swap(list1, 0, list1.size()-1);
                    }
                    System.out.println(list1);

            }else{
                list1.add(0, input);
            }
        } while (input > 0);
    }
}
