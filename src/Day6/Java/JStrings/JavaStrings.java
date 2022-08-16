package Day6.Java.JStrings;

public class JavaStrings {

   static int number;
   static double db;
   static char ch;
   static String str1;

    public static void main(String[] args) {

       char a = 'a';
       char b = 'b';
       String str = "ab";
       String str2 = str;

       // Difference between primitive data types and reference types.

        System.out.println(number); // default value for int = 0
        System.out.println(db); // default value for double = 0.0
        System.out.println(ch); // default value for char = /u0000
        System.out.println(str1); // default value for all reference/object data types is null

        // STRING ===> is set of characters (array, list)
        String name = "Furkat Ali";
        System.out.println("name = " + name);

    }
}
