package Day7.Practice;

public class Malika {
    public static void main(String[] args) {
        String Country = "united states of america";
        System.out.println(Country.indexOf("s"));

        String country = "america";
        System.out.println(country.indexOf("america"));

        String company = "EXELENTER";
        int e = company.lastIndexOf("E");
        System.out.println("e = " + e);

        int e1 = company.lastIndexOf('E', e-1);
        System.out.println("e1 = " + e1);

        String usa = "united states of america";
        System.out.println("index 5 ==> " + usa.charAt(5));
        System.out.println("last character ==> " + usa.charAt(usa.length()-1));
        System.out.println("first character ==> " + usa.charAt(0));

        int a1 = usa.lastIndexOf('a');
        System.out.println("a1 = " + a1);
        /* int a2 = usa.lastIndexOf("a", --a);
        System.out.println("a2 = " + a2); */

        String company1 = "EXELENTER";

        char c = company1.charAt(0);
        System.out.println("c = " + c);
        System.out.println("index 1 ==> " + company1.charAt(1));

        String text = "JAVA IS FUN";
        //task1: SUBSTRING ONLY "JAVA"
        System.out.println(text.substring(0,4));
        //task2: SUBSTRING ONLY "FUN"
        System.out.println(text.substring(8));

        //IsEmpty Method

        String str = "exelenter";
        boolean empty = str.isEmpty();
        System.out.println("empty = " + empty); //===> will return FALSE, since str has some characters

        //Contains Method (TRUE/FALSE)
        String str2 = "java is fun";
        boolean java = str2.contains(" is ");
        System.out.println("java = " + java);

        boolean isTrue = str2.contains("java ");
        System.out.println("isTrue = " + isTrue);

        //Equals and EqualsIgnoreCase Method

        String str4 = "JAVA";
        String str5 = "JAVA";

        boolean isEquals = str4.equals(str5);
        System.out.println("isEquals = " + isEquals);

        String enterYourPassword = "my password";
        String repeatYourPassword = "my passwort";
        String str3 = enterYourPassword;

        boolean arePassEqual = enterYourPassword.equals(repeatYourPassword);
        System.out.println("arePassEqual = " + arePassEqual);

        arePassEqual = enterYourPassword.equals(str3);
        System.out.println("arePassEqual = " + arePassEqual);

    }
}
