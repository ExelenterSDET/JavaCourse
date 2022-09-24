package Day29.Practice.Sebahattin;

import java.util.ArrayList;
import java.util.Scanner;

public class Task02 {
/*
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

            Scanner input = new Scanner(System.in);
            int num = 0;
            System.out.println("Enter number = ");
            num = input.nextInt();
            ArrayList<Integer> numbers = new ArrayList<>();

            while (num >= 0){
                numbers.add(num);
                System.out.println("Enter number = ");
                num = input.nextInt();
            }
            System.out.println(numbers);

            System.out.println("Enter number to provide two indexes " +
                    "between 0 and the last index of the ArrayList = ");

            int index1 = input.nextInt();
            int index2 = input.nextInt();

            if ((index1 >= 0 && index1 <= numbers.size()-1) && (index2 >= 0 && index2 <= numbers.size()-1)){
                int first = numbers.get(index1);
                int second = numbers.get(index2);
                numbers.set(index1,second);
                numbers.set(index2,first);
            }

            else {
                int range = numbers.get(0);
                numbers.set(0, numbers.get(numbers.size()-1));
                numbers.set(numbers.size() - 1, range);
            }
            System.out.println(numbers);
        }
}

