package Day23.Java;

public class Task2 {
    // create a method. return type is boolean. takes one String parameter.
    // Validate if a given String has at least 8 characters.

    public static void main(String[] args) {
        String str = "Java is Fun";
        System.out.println(isLengthOver7(str));
    }

    public static boolean isLengthOver7(String s){
        return s.length()>7;
    }
}
