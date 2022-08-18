package Day7.Practice;

public class Bakhridin_String_Methods {
    public static void main(String[] args) {

        /*
        Task1
        Create 3 strings as "JAVA ", " IS ", "FUN".
        Using concat method assign to the new string all of them.
        Last string should be "JAVA IS FUN"
      */
        String str1 = "JAVA ";
        String str2 = "IS ";
        String str3 = "FUN";

        String str4 = str1.concat(str2).concat(str3);
        System.out.println("str4 = " + str4);

        //       Task2: get the length of the last string

        System.out.println("Length of the str4 is " + str4.length());

        //       Task3: Get the index of the first "I" character

        int getIndex = str4.indexOf('I');
        System.out.println("getIndex = " + getIndex);

        //      Task4: Get the character of the last index
        char getLastCharacter = str4.charAt(str4.length() - 1);
        System.out.println("getLastCharacter = " + getLastCharacter);

        //      Task5: Validate that the string has "JAVA"

        boolean isContains = str4.contains("JAVA");
        System.out.println("isContains = " + isContains);

        //       Task6: Validate that the sting isEmpty

        boolean isEmpty = str4.isEmpty();
        System.out.println("isEmpty = " + isEmpty);


        //     Task7: Substring "JAVA" from the string
        String substringJava = str4.substring(0, 4);
        System.out.println("substringJAVAonly = " + substringJava);

        //      Task8: create a new string which is "java".
        //     and using equals and equalsIgnoreCase methods validate that they are equal.

        String str5 = "java";

        boolean isEqualsTrue = substringJava.equals(str5);
        System.out.println("isEqualsTrue = " + isEqualsTrue);

        boolean isEqualsIgnoreTrue = substringJava.equalsIgnoreCase(str5);
        System.out.println("isEqualsIgnoreTrue = " + isEqualsIgnoreTrue);

    }
}
