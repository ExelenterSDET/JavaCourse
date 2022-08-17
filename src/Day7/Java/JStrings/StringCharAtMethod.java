package Day7.Java.JStrings;

public class StringCharAtMethod {
    public static void main(String[] args) {

        /*
        Returns the character at the specified index (position)
         */

        String company = "EXELENTER";

        char c = company.charAt(0);
        System.out.println("c = " + c);

        System.out.println("index 1 ==> " + company.charAt(1));

        //Create country "united states of america"
        // Task1 = return the character which is in the index 5
        String country  = "united states of america";
        System.out.println("character in the index 5 => " + country.charAt(5));

        // Task2 =  return the last character using charAt method
        System.out.println(country.charAt(country.length()-1));

        // Task3 = return the first character using charAt method
        System.out.println(country.charAt(0));

        char c1 = country.charAt(country.length());
        // if provide an index equals or over string length, out of bounds error will be thrown
        System.out.println(c1);


    }
}
