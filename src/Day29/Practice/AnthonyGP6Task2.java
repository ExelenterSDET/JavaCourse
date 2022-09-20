package Day29.Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class AnthonyGP6Task2 {
    public static void main(String[] args) {
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
        Scanner scan = new Scanner(System.in);
        int input = 0;
        ArrayList<Integer> listNew = new ArrayList<>();


        while (input >= 0) {
            System.out.print("Enter any number: ");
            input = scan.nextInt();
            if(input >= 0);{
                listNew.add(input);
            }
            if(listNew.isEmpty()){
                input=0;
            }
        }
        System.out.println("Created list: " +listNew);
        System.out.println();
        System.out.print("Enter an index within the list between 0 and " +(listNew.size()-1) + ": ");
        int index1 = scan.nextInt();
        System.out.print("Enter an index within the list between 0 and "+ (listNew.size()-1) + " : ");
        int index2 = scan.nextInt();

        if (index1 >=0 && index1 <= listNew.size()-1 && index2 >= 0 && index2 <= listNew.size()-1) {
            int temp = listNew.get(index1);
            listNew.set(index1, listNew.get(index2));
            listNew.set(index2, temp);
        } else {
            int temp = listNew.get(0);
            listNew.set(0, listNew.get(listNew.size() - 1));
            listNew.set(listNew.size() - 1, temp);
        }
        System.out.println("Update List: "+ listNew);
    }
}
