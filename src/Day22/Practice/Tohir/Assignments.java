package Day22.Practice.Tohir;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Assignments {
    //// 1. Create a method which will take as a parameter int[] and print maximum number in the given array (name of the method - getMaxNum)
    //    // 2. Create a method which will take as a parameter int[] and print minimum number in the given array (name of the method - getMinNum)
    //    // 3. Create a method which will take as a parameter int[] and print total of all numbers in the array (name of the method - getTotal)
    //    // 4. Create a method which will take as a parameter String[] and print all Strings in the reversed order (name of the method - reversedArray)
    public static void main(String[] args) {
        Assignments asgn = new Assignments();
        int numb [] = {1,2,3,4};
        String str [] = {"money","honey","$","gold"};
        asgn.MaxMinTotal(numb);
        asgn.reverse(str);

    }

    void reverse(String s []){
        String [] t = new String[s.length];
        for (int i = 0; i < s.length; i++) {
            t[s.length-1-i] = s[i];
        }
        System.out.println("String reversed = " + Arrays.toString(t));
    }
    void MaxMinTotal(int num[]){
        int total = 0;
        int min = num[0];
        int max= num[0];
        for (int i = 0; i < num.length; i++) {
            if(num[i] < min){
                min = num[i];
            }
            if(num[i] > max){
                max = num[i];
            }
            total+=num[i];
        }
        System.out.println("Min "+min+"\nMax "+max+" \nTotal = "+total);
    }

}
