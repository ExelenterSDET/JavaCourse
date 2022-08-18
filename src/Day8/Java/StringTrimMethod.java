package Day8.Java;

public class StringTrimMethod {
// trim() Removes whitespace from both ends of a string
    public static void main(String[] args) {

        String str = "       Java is Fun            ";
        int length = str.length();
        System.out.println("str = " + str);
        System.out.println("length = " + length);

        String str2 = str.trim();
        length = str2.length();
        System.out.println("str2 = " + str2);
        System.out.println("length = " + length);

        // Task Create a string "       Java is Fun            " and trim the string.

    }
}
