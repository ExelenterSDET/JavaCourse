package Day7.Practice;

public class Mustafa {
    public static void main(String[] args) {
        /*Task1
        Create 3 strings as "JAVA ", " IS ", "FUN".
                Using concat method assign to the new string all of them.
                Last string should be "JAVA IS FUN"

        Task2: get the length of the last string

        Task3: Get the index of the first "I" character

        Task4: Get the character of the last index

        Task5: Validate that the string has "JAVA"

        Task6: Validate that the sting isEmpty

        Task7: Substring "JAVA" from the string

        Task8: create a new string which is "java".
                and using equals and equalsIgnoreCase methods validate that they are equal.*/
        String str1 = "JAVA ";
        String str2 = " IS ";
        String str3 = "FUN";

        String str4 = str1.concat(str2).concat(str3);
        System.out.println("str4 = " + str4);
        int length = str4.length();
        System.out.println("length = " + length);
        int i = str4.indexOf("I");
        System.out.println("i = " + i);
        char c = str4.charAt(11);
        System.out.println("c = " + c);

        boolean java = str4.contains("JAVA");
        System.out.println("java = " + java);
        boolean b = str4.isEmpty();
        System.out.println("b = " + b);

        String substring = str4.substring(0, 4);
        System.out.println("substring = " + substring);

        String java1 = "Java";
        boolean b1 = java1.equals(substring);
        System.out.println("b1 = " + b1);
        boolean b2 = java1.equalsIgnoreCase(substring);
        System.out.println("b2 = " + b2);

    }
}
