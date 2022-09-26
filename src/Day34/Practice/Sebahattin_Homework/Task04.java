package Day34.Practice.Sebahattin_Homework;

import java.util.ArrayList;
import java.util.Random;

public class Task04 {
/*
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
        ArrayList<Integer> numbersList = new ArrayList<>(getRandomNumbers());
        System.out.println(numbersList);
        int total = 10;
        System.out.println(getFalseTrue(numbersList,total));
}
    static ArrayList<Integer> getRandomNumbers (){
        ArrayList<Integer> num = new ArrayList<>();
        Random ram = new Random();
        for (int i = 0; i < 5; i++) {
            num.add(ram.nextInt(0,10));
        }
        return num;
    }
    static Boolean getFalseTrue (ArrayList<Integer> list, int total){
        Boolean bol = false;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i!=j)
                {
                    if ((list.get(i)+list.get(j)) == total)
                    {
                        bol = true;
                        break;
                    }
                }
            }
        }
        return bol;
    }
}
