package Day8.Java;

public class StringReplaceFirstMethod {
/*
replaceFirst() Replaces the first occurrence of a substring that matches the given regular
expression with the given replacement
 */

    public static void main(String[] args) {
            String str = "java is fun. I LOVE JAVA";

            String s = str.replaceAll("[A-Z]", "*");
            System.out.println("s = " + s);
            String s1 = str.replaceFirst("[A-Z]", "*");
            System.out.println("s1 = " + s1);

            String s2 = str.replaceAll("[A-Za-z]", "*");
            System.out.println("s2 = " + s2);
            String s3 = str.replaceAll("[A-z]", "*");
            System.out.println("s3 = " + s3);
            String s4 = str.replaceFirst("[A-z]", "*THE FIRST CHARACTER*");
            System.out.println("s4 = " + s4);
    }

}
