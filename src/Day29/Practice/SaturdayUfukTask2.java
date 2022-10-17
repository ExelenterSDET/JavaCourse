package Day29.Practice;

import java.util.*;

public class SaturdayUfukTask2 {
    /*Task 2.

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
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter an integer number greater than 0");
        int number= scan.nextInt();
        ArrayList<Integer> liste = new ArrayList<>();

        while (number>0){
            liste.add(number);
            number= scan.nextInt();
        }
        System.out.println(liste);

        System.out.println("Please enter two indexes to be swapped: ");
        int num1= scan.nextInt();
        int num2= scan.nextInt();

        SaturdayUfukTask2 sut=new SaturdayUfukTask2();
        sut.switchIndex(liste,num1,num2);

        System.out.println("Liste with swapped elements is: "+ liste);
    }

     ArrayList<Integer> switchIndex(ArrayList<Integer> arr, int int1, int int2){
        Collections.swap(arr,int1,int2);
        if (int1<0 || int2>arr.size()-1){
            Collections.swap(arr,0,arr.size()-1);
        }
     return arr;
    }
}
