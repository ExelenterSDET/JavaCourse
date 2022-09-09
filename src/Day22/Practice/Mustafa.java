package Day22.Practice;

import java.util.Arrays;

public class Mustafa {
    public static void main(String[] args) {
        // 1. Create a method which will take as a parameter int[] and print maximum number in the given array (name of the method - getMaxNum)
        // 2. Create a method which will take as a parameter int[] and print minimum number in the given array (name of the method - getMinNum)
        // 3. Create a method which will take as a parameter int[] and print total of all numbers in the array (name of the method - getTotal)
        // 4. Create a method which will take as a parameter String[] and print all Strings in the reversed order (name of the method - reversedArray)
        int arr[] = {2,5,89,6,3,48,1,3,78,45613,15};
        Mustafa day22 = new Mustafa();
        day22.MaxNum(arr);
        day22.MinNum(arr);
        day22.TotalNum(arr);
        day22.Reversearr(arr);
    }
    void MaxNum(int arr[]){
        System.out.println("Task1");
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
    void MinNum(int arr[]){
        System.out.println("Task2");
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
    void TotalNum(int arr[]){
        int total = 0;
        System.out.println("Task3");
        for (int i = 0; i < arr.length; i++) {
            total +=arr[i];

        }
        System.out.println(total);
    }
    void Reversearr (int arr[]){
        System.out.println("Task4");
        int Reverse []= new int[arr.length];
        for (int i = arr.length-1, j =0;  j<arr.length ;i--,j++) {
            Reverse[j] = arr[i] ;

        }
        System.out.println(Arrays.toString(Reverse));
    }

}


