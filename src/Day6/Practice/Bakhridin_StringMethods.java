package Day6.Practice;

public class Bakhridin_StringMethods {
    public static void main(String[] args) {

        stringConcat_and_GetLength("Hello ","all ","students");

    }

    public static void stringConcat_and_GetLength(String str1,String str2,String str3) {

        String str4=str1.concat(str2).concat(str3);
        System.out.println(str4);
        System.out.println("Length of given parameters are "+str4.length());

    }
}
