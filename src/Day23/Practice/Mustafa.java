package Day23.Practice;

import java.util.Arrays;

public class Mustafa {
    public static void main(String[] args) {
        // create a method, which will take int[] and return the maxNum
        // create a method, which will take int[] and return the minNum
        // create a method, which will take two int parameters and calculate total of maxNum and minNum
        // create a method. return type is boolean. takes one String parameter.
        // Validate if a given String has at least 8 characters.
        Mustafa tasdy23 = new Mustafa();
        int arr[] = {4,5,89,2,323,411,78,6};
        String str = "Hello";


        System.out.println("Max num is ==>"  + maxNum(arr));
        System.out.println("Min num is ==>"  +minNum(arr));
        System.out.println("Total of maxnum and minnum is ==>" + TotalminmaxNum(arr));
        System.out.println("String has minimum 8 characters ==>" + tasdy23.check8char(str));
    }
    static int maxNum(int arr[]){
        System.out.print("Task1 ==>");
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    static int minNum(int arr[]){
        System.out.println();
        System.out.print("Task2 ==>");

        Arrays.sort(arr);
        return arr[0];
    }
    static int TotalminmaxNum(int arr[]){
        System.out.println();
        System.out.print("Task3 ==>");

        Arrays.sort(arr);
        return arr[0] + arr[arr.length-1];
    }
    boolean check8char(String str){
        System.out.println();
        System.out.print("Task4 ==>");
        return str.length() >= 7?true:false;
    }
}



