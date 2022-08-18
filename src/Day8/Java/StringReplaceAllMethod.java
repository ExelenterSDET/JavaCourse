package Day8.Java;

public class StringReplaceAllMethod {
/*
replaceAll() Replaces each substring of this string that matches the given regular
expression with the given replacement
 */
    public static void main(String[] args) {

        String str = "Java is Fun. I love java";

        String x = str.replaceAll("[aelJ]", "x");
        System.out.println("x = " + x);

        String price = "$2.5 usd";
        String s = price.replaceAll("[^0-9.]", "");
        System.out.println("s = " + s);

        String newString = "Java is Fun. I love java";
        String s1 = newString.replaceAll("[A-Z]", "S");
        System.out.println("s1 = " + s1);

        String s2 = newString.replaceAll("[a-z]", "5");
        System.out.println("s2 = " + s2);

        String str3 = newString.replaceAll("[A-Za-z]", "8");
        System.out.println("str3 = " + str3);


        String address = "1233 East 19th Street, Brooklyn, New York, 11230";
        String replace = address.replaceAll("[0-9A-Za-z]", "*");
        System.out.println("replace = " + replace);

        // Task
        // Create a string with your home address.
        // replace all non-numeric characters to *

        String s3 = address.replaceAll("[^0-9 ]", "*");
        System.out.println("s3 = " + s3);

        String s4 = address.replaceAll("[^\\d ]", "*");
        System.out.println("s4 = " + s4);


    }
}
