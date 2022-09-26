package Day34.Practice.SaturdayProject7Andrea;

import java.util.ArrayList;
import java.util.Random;

public class Task4 {

//    Task 4
//            1. Create a method which will return ArrayList<Integer> with no parameters.
//    Add 10 random numbers between 0 and 10 to the list.
//
//        2. Create a method which will return true or false.
//    Parameter is ArrayList<Integer>, and int (X).
//    Determine whether there exist two elements in the list whose sum is exactly X.
//
//    Example:
//
//    {1, 4, 45, 6, 10, 8} and X = 16
//    Result = true;
//
//    {1, 2, 4, 3, 6} and X = 11
//    Result = false;
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(createArray());
        System.out.println(list1);
        int num = 15;
        System.out.println(addsUp(list1, num));
    }
    static ArrayList<Integer> createArray (){
        ArrayList<Integer> arrList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(0, 10);
            arrList.add(num);
        }
        return arrList;
    }
    static boolean addsUp (ArrayList<Integer> arrList, int x){
//        boolean doesItAddUp = false;
//        int num = 0;
        for (int i = 0; i < arrList.size(); i++) {
            if(arrList.contains(x-arrList.get(i))){
                System.out.println((x - arrList.get(i)) + " + " + arrList.get(i) + " = " + x);
                return true;
            }
        }
        return false;
    }
}
