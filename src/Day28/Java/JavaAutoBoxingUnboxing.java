package Day28.Java;

import java.util.ArrayList;

public class JavaAutoBoxingUnboxing {

    // Interview questions: What do you know about autoboxing and unboxing?
    /*
    Autoboxing & Unboxing
    Autoboxing: Automatic conversion of primitive types to the object of their corresponding wrapper
    classes is known as autoboxing. For example – conversion of int to Integer, long to Long, double to Double
    etc.

    Unboxing: It is just the reverse process of autoboxing. Automatically converting an object of a wrapper
    class to its corresponding primitive type is known as unboxing. For example – conversion of Integer to int,
    Long to long, Double to double etc.
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        int num = 5;
        list.add(num); // autoboxing. when primitive data type automatically is converted to Wrapper class

        Integer integer = list.get(0);
        int num2 = list.get(0); // unboxing. when wrapper class is converted to primitive data type

    }
}
