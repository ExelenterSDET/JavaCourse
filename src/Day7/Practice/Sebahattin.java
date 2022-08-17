package Day7.Practice;

public class Sebahattin {
    public static void main(String[] args) {
 /*
        Task1
        Create 3 strings as "JAVA", " IS ", "FUN".
        Using concat method assign to the new string all of them.
        Last string should be "JAVA IS FUN"
*/
        String str1 = "JAVA";
        String str2 = " IS ";
        String str3 = "FUN";
        String str4= str1.concat(str2+str3);
        System.out.println("Task 1 = "+str4);
        System.out.println("-------------");
/*
        Task2: get the length of the last string
*/
        int length= str4.length();
        System.out.println("Task 2 = "+length);
        System.out.println("-------------");
/*
        Task3: Get the index of the first "I" character
*/
        int firstI = str4.indexOf('I');
        System.out.println("Task 3 = "+str4.indexOf('I'));
        System.out.println("Task 3 = "+ firstI);
        System.out.println("-------------");
/*
        Task4: Get the character of the last index
*/
        System.out.println("Task 4 = "+str4.charAt(str4.length()-1));
        System.out.println("-------------");
/*
        Task5: Validate that the string has "JAVA"
*/
        boolean val = str4.contains("JAVA");
        System.out.println("Task 5 = "+val);
        System.out.println("-------------");
/*
        Task6: Validate that the sting isEmpty
*/
        boolean val1 = str4.isEmpty();
        System.out.println("Task 6= "+val1);
        System.out.println("-------------");
/*
        Task7: Substring "JAVA" from the string
*/
        System.out.println("Task 7 = "+str4.substring(0,4));
        System.out.println("-------------");
/*
        Task8: create a new string which is "java".
        and using equals and equalsIgnoreCase methods validate that they are equal.
 */
        String str6 = "JaVa";
        System.out.println("Task 8 = "+str1.equals(str6));
        System.out.println("Task 8 = "+str1.equalsIgnoreCase(str6));

    }
}
