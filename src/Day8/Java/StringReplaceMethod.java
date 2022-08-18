package Day8.Java;

public class StringReplaceMethod {
    /*
    replace() Searches a string for a specified value, and returns a new string where the
    specified values are replaced

     */
    public static void main(String[] args) {

        String str = "Txelenter";

        String replacedStr = str.replace('T', 'E');
        System.out.println("replacedStr = " + replacedStr);

        String replace = replacedStr.toLowerCase().replace('e', 'a');
        System.out.println("replace = " + replace);

        String s = replace.replace('a', 'e').toUpperCase();
        System.out.println("s = " + s);

        // Tasks
        // 1. Create string "Java is FUN".
        // 2. Substring only FUN.
        // 3. Convert to lowercase.
        // 4. replace all 'u' chars to 'a' chars.

        String text = "Java is FUN";
        String replace1 = text.substring(8).toLowerCase().replace('u', 'a');
        System.out.println("replace1 = " + replace1);


        String newString = "Hello World Hello";
        String replace2 = newString.replace("Hello", "Hi");
        System.out.println("replace2 = " + replace2);
    }
}
