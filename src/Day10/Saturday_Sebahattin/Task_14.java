package Day10.Saturday_Sebahattin;

import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {

        /*      Task 14
        Create a string. Validate if a string has a space. (use maximum 1 spaces in the string)
        if string doesnt have a space, return the string itself.
        if string has a space, get two words to the left from the space and to the right from the space.
            Validate which word is the longest and print it.
        if words have equal length, return the whole string.
        Example:
        Hello World = Hello = 5, World = 5 Output should be "Hello World"
        Exelenter Sdet = Exelenter = 9, Sdet = 4 Ouput should be "Exelenter"
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Task 14 / Verifies if a string contains spaces and prints the long word");
        System.out.print("Enter string = ");
        String wrd = input.nextLine();

        boolean wrdCont = wrd.contains(" ");

        if (!wrdCont){
            System.out.println(wrd);
        }
        if ( wrdCont){
            String[] wrdStr = wrd.split(" ");
            String oneStr = wrdStr[0];
            String twoStr = wrdStr[1];

            int lengthOneStr = oneStr.length();
            int lengthTwoStr = twoStr.length();

            if (lengthOneStr > lengthTwoStr){
                System.out.println(oneStr);
            }
            if (lengthTwoStr > lengthOneStr){
                System.out.println(twoStr);
            }
            if (lengthOneStr == lengthTwoStr){
                System.out.println(wrd);
            }
        }
    }
}
