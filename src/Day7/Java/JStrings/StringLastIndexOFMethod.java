package Day7.Java.JStrings;

public class StringLastIndexOFMethod {

    public static void main(String[] args) {

        String company  = "EXELENTER";
        // Parameter may accept int (should be char value from char table), char or string
        int e = company.lastIndexOf("E");
        System.out.println("e = " + e);
        int i = company.lastIndexOf('E');
        System.out.println("i = " + i);
        int i1 = company.lastIndexOf(69);
        System.out.println("i1 = " + i1);

        int e1 = company.lastIndexOf('E', e - 1);
        System.out.println("e1 = " + e1);

        // Create a string country as "united states of america"
        // Task1 find the index of the last letter "a" in the string

        String country = "united states of america";
        int a = country.lastIndexOf('a');
        System.out.println("a = " + a);

        // Task2 find the index of the second last character a
        System.out.println("index of second last a " + country.lastIndexOf('a', --a)); // --a i can use a-1 or 22





    }
}
