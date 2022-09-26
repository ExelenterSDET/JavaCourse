package Day34.Practice.Dilnoza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class groupProjectTask4 {
    /*
    Task 4
        1. Create a method which will return ArrayList<Integer> with no parameters.
           Add 10 random numbers between 0 and 10 to the list.

        2. Create a method which will return true or false.
           Parameter is ArrayList<Integer>, and int (X).
           Determine whether there exist two elements in the list whose sum is exactly X.

          Example:

          {1, 4, 45, 6, 10, 8} and X = 16
          Result = true;

          {1, 2, 4, 3, 6} and X = 11
          Result = false;

     */
    public static void main(String[] args) {
        System.out.println("=====================Part1===================");
        System.out.println(randomNumbers());
        System.out.println("=====================Part2===================");
        int num=66;
        System.out.println(hasPairToSum(randomNumbers(),num));
        System.out.println("=====================Part3===================");
        ArrayList<Integer> arrList= new ArrayList<>(Arrays.asList(1, 2, 4, 3, 6));
        System.out.println(hasPairToSum(arrList,num) );
    }
    static boolean hasPairToSum(ArrayList<Integer> list, int x){
        boolean hasPair =false;

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i) +list.get(j)==x){
                    hasPair= true;
                }

            }

        }return hasPair;
}
   static ArrayList<Integer> randomNumbers(){
       Random random = new Random();
       ArrayList<Integer> list1 = new ArrayList<>();
       for (int i = 0; i < 11; i++) {
           list1.add(random.nextInt(0, 10));
       }
       return list1;
    }



}
