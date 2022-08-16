package Day6.Practice.Mentoring;

public class Task1 {

    public static void main(String[] args) {


//      TASK1: Write a program, which prints out the text, its length and char representation of the length
//      TEXT:  ASCII stands for American Standard Code for Information Interchange.
//      NOTE: Text should be in double quotes. Character should be in single quotes.

        String text1 = "ASCII stands for American Standard Code for Information Interchange.";
        int txtLength = text1.length();
        char ch1 = (char) txtLength;

        System.out.println("\"" + text1 + "\"" + "\n" + txtLength + "\n" + "\'" + ch1 + "\'");

    }
}
