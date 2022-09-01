package Day18.Java;

import java.util.Arrays;

public class JavaArrays2 {

    public static void main(String[] args) {

        int numberArr[] = new int[5];

        System.out.println(numberArr.length); // in array, we call length function. in the String we call length method.

        numberArr[0] = 15;
        numberArr[1] = 20;
        numberArr[4] = 25;

        System.out.println("numberArr = " + Arrays.toString(numberArr));
        numberArr[2] = 50;
        numberArr[3] = 55;
        numberArr[0] = 2;
        System.out.println("numberArr = " + Arrays.toString(numberArr));

        int numberArr2[] = {2,20,50,55,25};
        System.out.println("numberArr2 = " + Arrays.toString(numberArr2));







    }
}
