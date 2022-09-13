package Day24.Practice;

import java.util.Arrays;
import java.util.Objects;

public class Dilnoza {
 /*
    Task3

1. Create a method named as isEqual. Method must have two int parameters.
Method should check if both numbers are equal and return boolean.
2. Create a method named as isEqual. Method must have two String parameters.
Method should check if both Strings are equal and return boolean.
3. Create a method named as numberOfElementsInVarArg. Method has two parameters:

int VarArg and int. Count how many int numbers are exist in the given varArg and return qty.
4. Create a method named as numberOfElementsInVarArg. Method has two parameters:
 String VarArg and String. Count how many Strings are exist in the given varArg and return qty.
     */

    public static void main(String[] args) {


        int[] arrA = {4, 5, 6, 7, 7, 7, 8, 9, 10};
        int[] arrB = {4, 5, 6, 7, 7, 7, 8, 9, 10};
        boolean isEqual = true;
        isEqual(arrA,arrB);
        System.out.println(isEqual);

        String strB = "Hello World";
        String strA = "Hello World";
        isEqual(strA,strB);
        System.out.println(isEqual);


        int[] ints = {1, 3, 5, 6, 7, 7, 8, 9, 19};
        numberOfElementsInVarArg(ints);
        String strings1 = "Hello World Hello";
        numberOfElementsInVarArg(strings1);
        String strings2 = "Hello Java Hello";
        numberOfElementsInVarArg(strings2);

    }

    static boolean isEqual(int[] arrA, int[] arrB) {
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        return (arrA[arrA.length - 1] == (arrB[arrB.length - 1]));

    }


    static boolean isEqual(String strA, String strB) {
        return (Objects.equals(strA, strB));
    }


    public static int numberOfElementsInVarArg(int... VarArgs) {
        int total = 0;
        for (int i = 0; i < VarArgs.length; i++) {
            total += VarArgs[i];
        }
        System.out.println("Count number of Int existing in VarArgs = " + total);
        return total;
    }

    public static String numberOfElementsInVarArg(String... VarArgs) {
        String str = String.valueOf(0);
        for (int i = 0; i < VarArgs.length; i++) {
            str += VarArgs[i];

        }
        System.out.println("Count number of Int existing in VarArgs = " + str.length());
        return str;
    }
}
