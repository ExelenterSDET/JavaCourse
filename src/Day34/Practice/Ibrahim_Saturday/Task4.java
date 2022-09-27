package Day34.Practice.Ibrahim_Saturday;

import java.util.ArrayList;
import java.util.Random;

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
public class Task4 {
    static ArrayList<Integer> createArray(){
        Random random = new Random();
        ArrayList<Integer> iArr = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            iArr.add(random.nextInt(11));
        }
        System.out.println("iArr = " + iArr);
        return iArr;
    }


    static boolean isTotalEqualX(ArrayList<Integer> list, int x){
        boolean b = false;
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size()-1; j > i; j--) {
                if(list.get(i) + list.get(j) == x){
                    b = true; break;
                }
            }
        }
        System.out.println("b = " + b);
        return b;
    }

    public static void main(String[] args) {

        isTotalEqualX(createArray(), 19);
    }
}
