package Day7.Java.JStrings;

public class StringContainsMethod {
    /*
    Checks whether a string contains a sequence of characters
     */
    public static void main(String[] args) {

        String usa = "united states of america";

        boolean usaContainsString = usa.contains("states");
        System.out.println("usaContainsString = " + usaContainsString);

        usaContainsString = usa.contains(" states ");
        System.out.println("usaContainsString = " + usaContainsString);

        usaContainsString = usa.contains(" states  ");
        System.out.println("usaContainsString = " + usaContainsString);

        // Create a string "java is fun"
        // Task1. validate if string contains "is "
        String str = "java is fun";
        System.out.println(str.contains("is "));

        // Task2. validate if string contains " java"
        boolean isTrue = str.contains(" java");
        System.out.println("isTrue = " + isTrue);

    }
}
