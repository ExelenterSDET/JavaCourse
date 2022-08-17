package Day7.Java.JStrings;

public class StringIndexOfMethod {

    public static void main(String[] args) {

        String company = "EXELENTER";

        int e = company.indexOf("E");
        // Parameter may accept int (should be char value from char table), char or string

        System.out.println("e = " + e);

        int n = company.indexOf("N");
        System.out.println("n = " + n);

        int x = company.indexOf("X");
        System.out.println("x = " + x);

        int r = company.indexOf("R");
        System.out.println("r = " + r);

        System.out.println("Company length -1 ===>>> " + (company.length()-1));

        int i = company.indexOf("O");
        System.out.println("i = " + i);  // When method doesnt find a character or string, return value would be -1

        int len = company.indexOf("LEN");
        System.out.println("len = " + len);

        int ter = company.indexOf("TER");
        System.out.println("ter = " + ter);

        int e1 = company.indexOf("E", 3);
        System.out.println("e1 = " + e1);

        //Create a string as country = "united states of america"
        // Task1. find the index of FIRST letter "s"
        String country = "united states of america";
        System.out.println(country.indexOf("s"));

        // Task2. find the index of SECOND letter "s";
        int firstIndexForS = country.indexOf("s");
        int secondIndexForS = country.indexOf("s", ++firstIndexForS);
        System.out.println("secondIndexForS = " + secondIndexForS);

        // Task3. find the index of "america"
        int america = country.indexOf("america");
        System.out.println("america = " + america);


    }

}
