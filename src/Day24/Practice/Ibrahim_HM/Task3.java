package Day24.Practice.Ibrahim_HM;

import Day7.Java.JStrings.StringIndexOfMethod;

public class Task3 {
    /*
    1. Create a method named as isEqual. Method must have two int parameters. Method should check if both numbers are equal and return boolean.
    2. Create a method named as isEqual. Method must have two String parameters. Method should check if both Strings are equal and return boolean.
    3. Create a method named as numberOfElementsInVarArg. Method has two parameters: int VarArg and int. Count how many int numbers are exist in the given varArg and return qty.
    4. Create a method named as numberOfElementsInVarArg. Method has two parameters: String VarArg and String. Count how many Strings are exist in the given varArg and return qty.
     */

    static boolean isEqual(int a, int b){
        return a==b;
    }
    static boolean isEqual(String a, String b){
        return a.equals(b);
    }
    static int numberOfElementsInVarArg(int a, int... args){
       int counter = 0;
        for (int i = 0; i < args.length; i++) {
            if (a == args[i]){
                counter++;
            }
        }
        return counter;
    }

    static int numberOfElementsInVarArg(String a, String... args){
        int counter = 0;
        for (int i = 0; i < args.length; i++) {
            if (a.equals(args[i])){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {


        System.out.println(isEqual(34, 34));
        System.out.println(isEqual(459, 499));
        System.out.println(isEqual("mom", "dad"));
        System.out.println(isEqual("happy", "happy"));
        System.out.println(numberOfElementsInVarArg(2, 1, 2, 5, 7, 9, 2, 2, 2));
        System.out.println(numberOfElementsInVarArg("a", "Java","is", "a"));

    }
}
