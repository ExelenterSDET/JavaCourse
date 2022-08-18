package Day8.Java;

public class StringToLowerCaseAndToUpperCaseMethods {

    // toLowerCase() Converts a string to lower case letters
    // toUpperCase() Converts a string to upper case letters

    public static void main(String[] args) {

        String str = "Hello World";
        String s = str.toLowerCase();
        System.out.println(s);
        String s1 = str.toUpperCase();
        System.out.println("s1 = " + s1);

        // Task
        // 1. Create a string which is "Hello, my name is <<put your name>>"
        // convert all characters in the string to lower case.
        String name = "Hello, my name is Furkat Ali";
        System.out.println("name = " + name.toLowerCase());

        // 2. convert all characters in the string to upper case
        System.out.println(name.toUpperCase());


    }
}
