package Day47.Practice.Dilnoza.MentoringTasks;

import java.util.HashSet;

public class Task2 {
    /*
    Bahodur Exelenter — Today at 7:36 PM
// non-empty array of Integers, every element is repeating except one number, return that number;
// {1, 2 ,5 ,2 ,1}==5
// {1, 2, 2}  =====1
     */

    public static void main(String[] args) {
        int []array = {1, 2 ,3 ,2 ,1};
        int unique = findUnique(array);
        System.out.println("unique = " + unique);
        boolean aTrue = containsDuplicate(array);
        System.out.println("aTrue = " + aTrue);
    }


    public static boolean containsDuplicate(int []arr){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])){
                return true;
            }
            else{
                set.add(arr[i]);
            }
        }return false;
    }
    static int findUnique(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                set.remove(arr[i]);
            } else {
                set.add(arr[i]);
            }
        }
        for (Integer eachNumber : set) {
            return eachNumber;
        }
return -1;

    }
}







//    int findUnique(int []numbers){
//        int number = 0;
//        int []array = {1, 2 ,5 ,2 ,1};
//      //  ArrayList<Integer>temp= new ArrayList<>(array);
//        HashSet<Integer>newArray= new HashSet<>();
//        for (int i = 0; i < array.length; i++) {
//            newArray.add(array[i]);
//
//        }
//        number=newArray[0];
//
//
//        return number;
//    }




