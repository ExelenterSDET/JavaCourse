package Day24.Practice.Day24Andrea;

import java.util.Arrays;

public class PracticeJavaVarArgs {
    //variable arguments "..." similar to array

    public static void main(String... args) {
        System.out.println("fine");
    //    int[] num = new int[] {1,2,3};
        listOfNumbers(1,2,5,34,66,74454,24);


    }
    //can only have 1 arg and it must be last parameter
    public static void listOfNumbers(int... args){
        int[] arr = args;
        System.out.println(Arrays.toString(args));

    }

}
