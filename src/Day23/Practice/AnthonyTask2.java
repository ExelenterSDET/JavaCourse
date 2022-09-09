package Day23.Practice;

public class AnthonyTask2 {
    /*
    Create a method return type is boolean. takes one string parameter.
    validate if a given string has at least 8 characters
     */

    public static void main(String[] args) {
        String str = "Java";
        System.out.println(isLengthOver7(str));

    }
    public static boolean isLengthOver7(String s){
        return s.length()>7;
    }
}
