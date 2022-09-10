package Day24.Java;

import java.util.Arrays;

public class JavaVarArgs {
    public static void main(String... args) {
//        System.out.println("fine");

//        int[] num = new int []{1,2,3};

        int[] arr = new int[]{2,4,6,8,10,12,14};

        listOfNumbers2(1,2,3,10,25,23,23,4,56,5);

        listOfNumbers(arr);

    }

    public static void listOfNumbers(int[] args){
        System.out.println(Arrays.toString(args));
    }
    public static void listOfNumbers2(int... args){

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }


}
