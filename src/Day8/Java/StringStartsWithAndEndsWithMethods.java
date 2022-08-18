package Day8.Java;

public class StringStartsWithAndEndsWithMethods {

    //startsWith() Checks whether a string starts with specified characters
    //endsWith() Checks whether a string ends with the specified character(s)

    public static void main(String[] args) {

        String str = "Exelenter";

        boolean e = str.startsWith("E"); // returns true, since str starts with character E
        System.out.println("e = " + e);
        boolean exel = str.startsWith("Exel"); // returns true, since str starts with string "Exel"
        System.out.println("exel = " + exel);
        boolean exel1 = str.startsWith("exel"); // returns false, since method is case sensitive
        System.out.println("exel1 = " + exel1);

        String str1 = "java is fun";
        boolean is = str1.startsWith("is", 5); // you may use it if needed. but better to use contains method instead
        System.out.println("is = " + is);

        boolean r = str.endsWith("r");
        System.out.println("r = " + r); // will return true, since Exelenter ends with "r"

        boolean fun = str1.endsWith("fun"); // will return true, since "java is fun" ends with "fun"
        System.out.println("fun = " + fun);

        boolean fun1 = str1.endsWith("FUN"); // will return false, since method is case sensitive.
        System.out.println("fun1 = " + fun1);

        // Task
        // Create a string which is "hello world"
        // 1. validate if string startsWith "Hello"

        String task1 = "hello world";
        System.out.println(task1.startsWith("Hello"));

        // 2. validate if string ends with "ld";
        System.out.println(task1.endsWith("ld"));


    }
}
