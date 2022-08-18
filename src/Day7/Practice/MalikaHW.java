package Day7.Practice;

public class MalikaHW {
    public static void main(String[] args) {
        /*Task1
        Create 3 strings as "JAVA ", " IS ", "FUN".
                Using concat method assign to the new string all of them.
                Last string should be "JAVA IS FUN" */

        String Str1 = "JAVA ";
        String Str2 = "IS ";
        String Str3 = "FUN";
        String Task1 = Str1.concat (Str2.concat (Str3) );
        System.out.println("Task1 ===> " + Task1);

        /* Task2: get the length of the last string */

        int Task2 = Task1.length();
        System.out.println("Task2 ===> " + Task2);

        /*Task3: Get the index of the first "I" character*/

        int Task3 = Task1.indexOf("I");
        System.out.println("Task3 ===> " + Task3);

        /*Task4: Get the character of the last index*/

        char Task4 = Task1.charAt(10);
        System.out.println("Task4 ===> " + Task4);


        /*Task5: Validate that the string has "JAVA"*/


        boolean Task5 = Task1.contains("JAVA");
        System.out.println("Task5 ===> " + Task5);

        /*Task6: Validate that the sting isEmpty*/

        boolean Task6 = Task1.isEmpty();
        System.out.println("Task6 ===> " + Task6);

        /*Task7: Substring "JAVA" from the string*/

        String Task7 = Task1.substring(0,4);
        System.out.println("Task7 ===> " + Task7);

       /* Task8: create a new string which is "java".
                and using equals and equalsIgnoreCase methods validate that they are equal.*/

        String Newstring = "java";
        boolean Task8 = Newstring.equals(Task7);
        System.out.println("Task8 ===> equals = " + Task8);
        boolean equalsIgnoreCase = Newstring.equalsIgnoreCase(Task7);
        System.out.println("equalsIgnoreCase = " + equalsIgnoreCase);

    }
}
