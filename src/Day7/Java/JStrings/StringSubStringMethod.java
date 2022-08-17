package Day7.Java.JStrings;

public class StringSubStringMethod {
    public static void main(String[] args) {
     /* Extracts the characters from a string, beginning at a specified start
    position, and through the specified number of character */

    String company = "i live in new york. new york is big city";
        int n = company.indexOf("new");
        System.out.println("n = " + n);
        String newYork = company.substring(n); // n = 10
        System.out.println("newYork = " + newYork);

        System.out.println(company.substring(14));

        System.out.println(company.substring(2));

        System.out.println(company.substring(20, 35));

        // TASKS: "JAVA IS FUN"
        // TASK1 : SUBSTRING ONLY "JAVA"
        String str = "JAVA IS FUN";
        System.out.println(str.substring(0,4));
        // Task2: substring only fun
        System.out.println(str.substring(8));
        System.out.println(str.substring(8,11));
        System.out.println(str.substring(str.indexOf('F')));
        System.out.println(str.substring(str.indexOf('F'),str.length()));



    }
}
