package Day6.Practice.Mentoring;

public class Task2 {

    public static void main(String[] args) {


//      TASK2: Write a program, which adds to the text, its length and char representation of the length (use String method: concat())
//      TEXT:  Computers can only understand numbers, so an ASCII code is the numerical representation of a characters.
//      NOTE: Print out each value in separate line. Character should be in single quotes.

        String str1 = "Computers can only understand numbers, so an ASCII code is the numerical representation of a characters.";
        int strLength = str1.length();
        char ch1 = (char) strLength;

        System.out.println(str1.concat("\n" + strLength + " ").concat("\n" + "\'" + ch1 + "\'"));

    }
}
