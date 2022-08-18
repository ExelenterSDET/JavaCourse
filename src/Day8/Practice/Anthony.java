package Day8.Practice;

public class Anthony {

    public static void main(String[] args) {
        // Task
        //Create a string which is "hello world"
        //1. validate if string startsWith "Hello"

        String str = "hello world";
        System.out.println("Task 1 w/ starts with = "+str.startsWith("Hello"));

        //2. validate if string ends with "ld";

        System.out.println("Task 2 w/ starts with = "+str.endsWith("ld"));

        // Task
        // 1. Create a string which is "Hello, my name is <<put your name>>"
        // convert all characters in the string to lower case.
        String num1 = "Hello, my name is Anthony";
        String a = num1.toLowerCase();
        System.out.println("TASK to lower = " + a);
        String b = num1.toUpperCase();
        System.out.println("TASK to upper = " + b);

        // Task create a string "     Java is Fun         " and trim the string;
        String str11 = "     Java is Fun         ";
        int length = str11.length();
        System.out.println("TASK Trim = " + str11);
        System.out.println("TASK Trim length = " + length);


        String str2 = str11.trim();
        length = str2.length();
        System.out.println("TASK Trim = " + str2);
        System.out.println("TASK Trim length2 = " + length);

        //Tasks
        //1. Create string "Java is FUN".
        //2. Substring only FUN/
        // 3.Convert to lowercase.
        //4. replace all 'u' chars to 'a' chars.

        String text = "Java is FUN";
        String replace1 = text.substring(8).toLowerCase().replace('u', 'a');
        System.out.println("TASK Replace = " + replace1);

        String newString = "Hello World Hello";
        String replace2 = newString.replace("Hello", "Hi");
        System.out.println("TASK Replace 2 = " + replace2);

        String address = "18303 Living the Vida Loca, Las Vegas, NV 83290";
        String s = address.replaceAll("[^0-9 ]", "*");
        System.out.println("TASK Replace address = " + s);

        String s1 = address.replaceAll("[^\\d ]", "*");
        System.out.println("TASK Replace address = " + s1);


    }

}
