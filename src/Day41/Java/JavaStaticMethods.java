package Day41.Java;

import java.util.Arrays;
import java.util.Random;

public class JavaStaticMethods {

    public static void print(){
        System.out.println("Static");
    }
    public void print2(){
        System.out.println("Non-Static");
    }

    public static void main(String[] args) {
        print();
        JavaStaticMethods jm = new JavaStaticMethods();
        jm.print2();
    }
}

class Test2{
    public static void main(String[] args) {

        // Static methods and attributes belong to the class
        JavaStaticMethods.print();

        // Non-static methods and attributes belong to the object/instance of the class.
        JavaStaticMethods jvm = new JavaStaticMethods();
        jvm.print2();

        // Examples for the non-static methods.
        String str = "Hello";
        String str2 = new String("Hello");

        System.out.println(str);
        System.out.println(str2);
        int length = str.length();
        int length1 = str2.length();

        Random rnd = new Random();
        rnd.nextInt();

        // Examples for the static methods
        int max = Math.max(2, 5);
        Arrays.sort(new int[3]);
    }
}
