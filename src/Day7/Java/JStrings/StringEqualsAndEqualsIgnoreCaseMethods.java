package Day7.Java.JStrings;

public class StringEqualsAndEqualsIgnoreCaseMethods {
/*
equals() ==> Compares two strings. Returns true if the strings are equal, and false if
not

equalsIgnoreCase() ==> Compares two strings, ignoring case considerations

 */
    public static void main(String[] args) {

        String str1 = "JAVA";
        String str2 = "JAVA";

        boolean isEquals = str1.equals(str2);
        System.out.println("isEquals = " + isEquals);

        String enterYourPassword = "my password";
        String repeatYourPassword = "my passwort";
        String str3 = enterYourPassword;

        boolean arePassEqual = enterYourPassword.equals(repeatYourPassword);
        System.out.println("arePassEqual = " + arePassEqual);

        arePassEqual = enterYourPassword.equals(str3);
        System.out.println("arePassEqual = " + arePassEqual);

        enterYourPassword = "MY pASSwORd";
        repeatYourPassword = "my PassWorD";

        arePassEqual = enterYourPassword.equalsIgnoreCase(repeatYourPassword);
        System.out.println("arePassEqual = " + arePassEqual);

        arePassEqual = enterYourPassword.equals(repeatYourPassword);
        System.out.println("arePassEqual = " + arePassEqual);

        // TASK create two strings "MY JAVA" and "My Java".
        // using equals and equalsIgnoreCases validate if two string are the same
        String myJava1 = "MY JAVA";
        String myJava2 = "My Java";

        System.out.println(myJava1.equals(myJava2));
        System.out.println(myJava1.equalsIgnoreCase(myJava2));
    }
}
