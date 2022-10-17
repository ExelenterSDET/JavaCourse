package Day34.Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ufuktask3 {
    /*Task 3
        Create a method, which will return a ArrayList<Integer> and parameter is a ArrayList<Integer>.
        The method should sort the ArrayList.

        Note: Don`t use any of built-in sort methods.

        Example:
        {5,4,2,1,0,3}

        Result: {0,1,2,3,4,5}
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please give the lenght of the list");
        int len= scan.nextInt();
        System.out.println("Please enter numbers to build a list ");

        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < len; ++i) {
            int number=scan.nextInt();
            list.add(number);
        }
        System.out.println(list);
        orderIt(list);

    }
    static ArrayList<Integer> orderIt(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size()-1; j++) {
                if(list.get(i)<list.get(j)){
                    int temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        System.out.println("orderList = " + list);
     return list;
    }
}
