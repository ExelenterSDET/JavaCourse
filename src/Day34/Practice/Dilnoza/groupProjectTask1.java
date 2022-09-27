package Day34.Practice.Dilnoza;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class groupProjectTask1 {
    /*
     Task 1

        1. Create a method which will return int[]. Parameter is int (n).
           The length of array is n.
           Using Random class, assign to each index of array a random number between 10 and 20.

        2. Create a method which will return a HashMap.
           Parameter will be int[].
           Return how many times each int of array repeats.

           Example:
           [10,11,12,13,10,11,12,13]

           Result:
           10 = 2; 11=2, 12=2, 13=2

     */

        public static void main(String[] args) {
             //  Task 1.1
                groupProjectTask1 t1 = new groupProjectTask1();
                int []numbers = new int[10];
                int[] array = t1.getArray(numbers);
                System.out.println("array = " + Arrays.toString(array));
                HashMap<Integer, Integer> sumOfDuplicates = t1.getSumOfDuplicates(array);
                System.out.println("sumOfDuplicates = " + sumOfDuplicates);

        }

        int []getArray(int[] num){
                int []numbers = new int[num.length];
                Random random= new Random();
                for (int i = 0; i <num.length ; i++) {
                        numbers[i]=random.nextInt(10,20);
                }
                return numbers;
           }
           HashMap<Integer,Integer> getSumOfDuplicates(int [] numbers){
                   HashMap<Integer,Integer> key = new HashMap<>();
                   for (int i = 0; i < numbers.length; i++) {
                           key.computeIfAbsent(numbers[i],k->0);
                           key.computeIfPresent(numbers[i],(k,v) -> v += 1);
                   }
return key;
           }

        }
